package methods;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.MyListImpl;

class MyListImplTestTest {
	
	
	private static MyList<Integer> sut;  //la classe à tester
	private static int expectedSize;  // la taille à l'origine
	private static Properties prop;  // les propriétés
	private static List<Integer> testSet;  //les nombres que nous mettrons dans notre class
	private static FileInputStream propFile;  //le fichier de propriétés
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		prop = new Properties();
		testSet = new LinkedList<Integer>();
		propFile = new FileInputStream("src/FileInputStream.properties"); //charge le fichier de propriétés
		prop.load(propFile);
		expectedSize = Integer.parseInt(prop.getProperty("taille")); //parse la taille
		System.out.println("expectedSize : " + expectedSize);
		String numbers = prop.getProperty("nombre"); //récupère les nombre à mettre dans la liste

		String[] str = numbers.split(" ");
		System.out.println("tableau str : " + Arrays.toString(str));
		
		for(String i : numbers.split(" ")) { //pour chaque nombre 
			System.out.println("***" +i+"***" );
			testSet.add(Integer.parseInt(i.trim()));  // l'enregistrer en tant que int			
	        }

//		not working
		String stringWithoutSpace;
		for(String s : str) {
			stringWithoutSpace = s.replaceAll(" ","");
			System.out.println("stringWithoutSpace*****" + stringWithoutSpace +"****");
		}


	        sut = new MyListImpl<Integer>();  // instancier la classe à tester
	        System.out.println("avant tout");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		propFile.close(); // On ferme le fichier à traiter à la fin du texte	
		System.out.println("après tout");
	}

	@BeforeEach
	void setUp() throws Exception {
		for(int i : testSet) {
			sut.add(new Integer(i)); //On ajoute les nombres au début de chaque test
		}
		
		
		System.out.println("avant un test");
	}

	@AfterEach
	void tearDown() throws Exception {
		sut.reset(); // à la fin de chaque test, on reset notre liste
		System.out.println("après un test");
	}

//	@Test
//	void testTestMyListImpl() {
//		fail("Not yet implemented");
//	}

	@Test
	void testTestAdd() {
		assertEquals(expectedSize, sut.getSize());
		sut.add(new Integer(8));
		assertEquals(expectedSize+1, sut.getSize());
		for(int i=0;i<testSet.size();i++) {
			assertEquals(testSet.get(i), sut.getAt(i));
			System.out.println("testSet.get(i) : " + testSet.get(i));
			System.out.println("sut.getAt(i) : " + sut.getAt(i));
			assertTrue("testSet.get(i) et sut.getAt(i) sont égaux ", testSet.get(i).equals(sut.getAt(i)));
		}
	}

	@Test
	void testTestRemoveAt() {
		
		assertEquals(expectedSize, sut.getSize());
		
		//l element au rang 3
		int elem3 = sut.getAt(3);
		System.out.println("elem3 : " + elem3);
		
		//on retire l element au rang 3
		int retrait = sut.removeAt(new Integer(3));
		System.out.println("retrait : " + retrait);
		assertEquals(elem3, retrait);
		
		assertTrue("taille de 'sut' doit etre de -1", sut.getSize() == (expectedSize-1));
		System.out.println("sut.getSize() : " + sut.getSize());
		System.out.println("(expectedSize-1) : " + (expectedSize-1));
			
	}
	
	@Test
	void testTestRemoveAt2() {

		assertEquals(expectedSize, sut.getSize());
		//on va faire un test avec un nombre + grand que le tableau
		assertThrows(ArrayIndexOutOfBoundsException.class, ()-> sut.getAt(10));
		
	}
	
	
	
//
//	@Test
//	void testTestRemoveItem() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testTestSetAt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testTestGetAt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testTestGetSize() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testTestReset() {
//		fail("Not yet implemented");
//	}

}
