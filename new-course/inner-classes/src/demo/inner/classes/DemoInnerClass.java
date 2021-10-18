package demo.inner.classes;

import demo.inner.classes.OuterClass.InnerClass;

public class DemoInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		//outerClass.displayOuter();
		
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.displayInner();

//		InnerClass innerClass2 = outerClass.new InnerClass();
//		innerClass2.displayInner();
	}

}
