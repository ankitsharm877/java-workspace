package demo.abtractclasses;

public class Sub extends Super{
	int dm2;
	Sub(int dm1, int dm2) {
		super(dm1);
		this.dm2 = dm2;
		System.out.println("Sub Constructor " + dm2);
	}

	public void meth2() {
		System.out.println("Sub Meth2");
	}
	
	public void meth3() {
		System.out.println("Sub Meth3");
	}
}
