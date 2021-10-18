package demo.local.inner.classes;

public class OuterClass {

	void display() {
		final class InnerClass {
			void innerDisplay() {
				System.out.println("Inner Display");
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.innerDisplay();
	}
}
