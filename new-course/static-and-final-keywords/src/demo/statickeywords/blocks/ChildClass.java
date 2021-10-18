package demo.statickeywords.blocks;

public class ChildClass extends ParentClass{

	static int a;
	int b;
	
//	static {
//		System.out.println("static block 1");
//		a  = 10;
//		//b = 20;
//	}
	static {
		System.out.println("Child class static block");
	}
	
	{
		System.out.println("Child class initializer");
	}

	ChildClass() {
		System.out.println("Child Class constructor");
	}
}
