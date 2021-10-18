package demo.staticinner.classes;

public class Outer {

	static int x = 10;
	
	public static class InnerClass {
		int y = 20;
		void displayInner() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}
