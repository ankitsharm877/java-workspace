package demo.anonymous.inner.classes;

public class DemoAnonymousClass {

	public static void main(String[] args) {
		MyClass myClass = new MyClass() {
			@Override
			void display() {
				System.out.println("Display");
				
			}
		};
		myClass.display();
		
		MyInterface myInterface = new MyInterface() {
			@Override
			public void display() {
				System.out.println("Display");
				
			}			
		};
		myInterface.display();
		
		OuterClass outerClass = new OuterClass();
		outerClass.meth();
	}
}
