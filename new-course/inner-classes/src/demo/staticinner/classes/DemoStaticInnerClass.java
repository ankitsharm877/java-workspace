package demo.staticinner.classes;

public class DemoStaticInnerClass {

	public static void main(String[] args) {
		Outer.InnerClass innerClass = new Outer.InnerClass();
		innerClass.displayInner();
		
	}
}
