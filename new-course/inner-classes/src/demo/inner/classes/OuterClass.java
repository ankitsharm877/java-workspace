package demo.inner.classes;

public class OuterClass {
	int x = 10;
	InnerClass innerClass2 = new InnerClass();
	
	public class InnerClass {
		int y = 20;
		//int x = 11;
		void displayInner() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	void displayOuter() {
		InnerClass innerClass = new InnerClass();
		//innerClass.displayInner();
		//System.out.println(innerClass.y);
	}
}
