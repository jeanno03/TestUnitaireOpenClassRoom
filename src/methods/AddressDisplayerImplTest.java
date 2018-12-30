package methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mock.AddressFetcherMock;

class AddressDisplayerImplTest {
	
	private static AddressDisplayer sut;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sut = new AddressDisplayerImpl();
		sut.setAddressFetcher(new AddressFetcherMock());
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("test end");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDisplayAddress() {
		String resutlatTheorique = "Mathias Dupond\n5 Avenue champs-Elysés\n75005 Paris";
		String ResultatPratique = sut.displayAddress("Dupond");
		assertTrue(ResultatPratique.compareTo(resutlatTheorique) == 0);
	}

	@Test
	void testSetAddressFetcher() {
		fail("Not yet implemented");
	}

}
