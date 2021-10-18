package demo.exceptions.handling;

public class TestNestedTryCatch {
	public static void main(String[] args) {
		try {
			int A[] = {1,0,3,4,5};
			try {
				int r;
				r = A[0] / A[1];
				System.out.println(r);
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}
			System.out.println(A[10]);
		} catch (IndexOutOfBoundsException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
