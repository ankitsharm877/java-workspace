package demo.exceptions.handling;

public class TestExceptionHandling {

	public static void main(String[] args) {
		
		int a, b, c;
		try {
			a = 5;
			b = 0;
			c = a / b;
			System.out.println(c);
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}
