package methods;

public class CalculatorImpl implements Calculator{

	@Override
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public int divide(int a, int b) {

		try {
			int c = a / b;
			return c;	
		}catch(ArithmeticException ex) {
			return 0;
		}

	}

	@Override
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}

	@Override
	public int substract(int a, int b) {
		int c = a - b;
		return c;
	}

}
