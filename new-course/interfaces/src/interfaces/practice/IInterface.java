package interfaces.practice;

public interface IInterface {
	Integer X = 10;
	void meth1();
	void meth2();
	public static void meth3() {
		System.out.println("interface static method 3");
	}
	public static void meth4() {
		System.out.println("interface static method 4");
		meth8();
	}
	
	public default void meth5() {
		System.out.println("interface static method 5");
	}
	public default void meth6() {
		System.out.println("interface static method 6");
		meth7();
		meth8();
	}
	
	private void meth7() {
		System.out.println("interface static method 7");
	}
	
	private static void meth8() {
		System.out.println("interface static method 8");
	}
}
