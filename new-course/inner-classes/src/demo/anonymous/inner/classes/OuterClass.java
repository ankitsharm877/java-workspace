package demo.anonymous.inner.classes;

public class OuterClass {

	public void meth() {
		int x = 10;
		MyClass myClass = new MyClass() {
			@Override
			void display() {
				System.out.println("Display" + x);
				
			}
		};
		myClass.display();
		
		MyInterface myInterface = new MyInterface() {
			@Override
			public void display() {
				System.out.println("Display" + x);
				
			}			
		};
		myInterface.display();
	}
}
