package demo.statickeywords.blocks;

public class ParentClass {
	public int x = 0;
	
	{
		System.out.println("Parent Class initializer");
	}
	
	static {
		System.out.println("Parent Class static block");
	}
	
	ParentClass() {
		System.out.println("Parent Class constructor");
	}
	
	public void show() {
		System.out.println("Show");
	}
}
