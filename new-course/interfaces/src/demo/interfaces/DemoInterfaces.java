package demo.interfaces;

public class DemoInterfaces {
	public static void main(String[] args) {
		Test1 test1;
		test1 = new Test2();
		test1.meth1();
		test1.meth2();
		
		System.out.println(Test1.MAX);
	}
}
