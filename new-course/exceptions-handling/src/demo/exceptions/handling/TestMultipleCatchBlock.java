package demo.exceptions.handling;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int A[] = {1,0,3,4,5};
			int r;
			r = A[0] / A[1];
			System.out.println(r);
			System.out.println(A[10]);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (IndexOutOfBoundsException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
