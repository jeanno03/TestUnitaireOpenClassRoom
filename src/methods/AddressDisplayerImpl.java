package methods;
import entities.Address;

public class AddressDisplayerImpl implements AddressDisplayer{

	private AddressFetcher addressFetcher;
	
	@Override
	public String displayAddress(String name) {
		Address a = addressFetcher.fetchAddress(name);
		String address = a.getName() + "\n";
		address += a.getNb() + " " + a.getStreet() + "\n";
		address += a.getZip() + " " + a.getTown();
		return address;
	}

	@Override
	public void setAddressFetcher(AddressFetcher af) {
		this.addressFetcher = af;
	}

}
