package methods;

import entities.Address;

public class AddressFetcherImpl implements AddressFetcher{

	@Override
	public Address fetchAddress(String name) {
//Méthode bidon
		String entry = name.toLowerCase();
		Address adress = new Address();

		if((name.contains("john"))||(name.contains("jean"))) {
			adress.setName("nom");
			adress.setNb(7);
			adress.setStreet("rue du roi");
			adress.setTown("Paris");
			adress.setZip(75018);

		}

		return adress;
	}

}
