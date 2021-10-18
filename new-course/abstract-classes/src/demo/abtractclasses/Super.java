package demo.abtractclasses;

public abstract class Super {
	int dm1;
	
	{
		System.out.println("Super class initializer");
	}
	
	static {
		System.out.println("Super class static block");
	}
	
	Super(int dm1) {
		this.dm1 = dm1;
		System.out.println("Super Constructor " + this.dm1);
	}
	void meth1() {
		System.out.println("Super Meth1");
	}
	abstract public void meth2();
}
