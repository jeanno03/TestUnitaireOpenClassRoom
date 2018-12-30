package methods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorImplTest {

	Calculator calculator = new CalculatorImpl();

	@Test
	void testMultiply() {
		int a;
		int b;
		int c;

		a = 5;
		b = 5;
		c=a*b;
		assertTrue("a et b positif",calculator.multiply(a, b) == c);

		a = 5;
		b = 5;
		c=a*b;
		assertFalse("a et b positif",calculator.multiply(a, b) != c);

		a = -5;
		b = 5;
		c=a*b;
		assertTrue("a est négatif",calculator.multiply(a, b) == c);

		a = 5;
		b = -5;
		c=a*b;
		assertTrue("b est négatif", calculator.multiply(a, b) == c);

		a = 0;
		b = 5;
		c=a*b;
		assertTrue("a est null", calculator.multiply(a, b) == c);

		a = 5;
		b = 0;
		c=a*b;
		assertTrue("b est null", calculator.multiply(a, b) == c);

		a = 0;
		b = 0;
		c=a*b;
		assertTrue("a et b sont nulls", calculator.multiply(a, b) == c);

		a = 0;
		b = -5;
		c=a*b;
		assertTrue("a est null et b est négatif", calculator.multiply(a, b) == c);


	}

	@Test
	void testDivide() {
		int a;
		int b;
		int c;

		a = 5;
		b = 5;
		c=a/b;
		assertTrue("a et b positif", calculator.divide(a, b) == c);

		a = 5;
		b = 0;
		assertTrue("b est null", calculator.divide(a, b) == 0 );

		a = 0;
		b = 5;
		c=a/b;
		assertTrue("a est null", calculator.divide(a, b) == c);

		a = -5;
		b = 5;
		c=a/b;
		assertTrue("a est négatif", calculator.divide(a, b) == c);

		a = 5;
		b = -5;
		c=a/b;
		assertTrue("b est négatif", calculator.divide(a, b) == c);

		a = -5;
		b = -5;
		c=a/b;
		assertTrue("a et b négatif", calculator.divide(a, b) == c);

		a = 0;
		b = -5;
		c=a/b;
		assertTrue("a est null et b est négatif", calculator.divide(a, b) == c);

	}

	@Test
	void testAdd() {
		int a;
		int b;
		int c;

		a = 5;
		b = 5;
		c=a+b;
		assertTrue("a et b positif", calculator.add(a, b) ==c );
		
		a = 5;
		b = 5;
		c=a+b;
		assertFalse("a et b positif", calculator.add(a, b) !=c );
		
		a = 0;
		b = -5;
		c=a+b;
		assertTrue("a est null et b est négatif", calculator.add(a, b) == c);
		
		a = -5;
		b = -5;
		c=a+b;
		assertTrue("a et b sont négatif", calculator.add(a, b) == c);
		
		a = 0;
		b = 0;
		c=a+b;
		assertTrue("a et b sont nulls", calculator.add(a, b) == c);
		
		a = 2140000000;
		b = 2140000000;
		c=a+b;
		assertTrue("resultat est toujours integer", calculator.add(a, b) == c);
	}

	@Test
	void testSubstract() {
		int a;
		int b;
		int c;
		
		a = 5;
		b = 5;
		c=a-b;
		assertTrue("a et b positif", calculator.substract(a, b) ==c );
		
		a = -2140000000;
		b = 2140000000;
		c=a-b;
		assertTrue("resultat est toujours integer\"", calculator.substract(a, b) == c);
	}

}
