package demo.abtractclasses;

public class Demo {

	public static void main(String[] args) {
		Super s1;
		//s1 = new Super();
		s1 = new Sub(1, 2);
		s1.meth1();
		s1.meth2();
		//s1.meth3();
		
		Sub s2 = new Sub(3,4);
		s2.meth1();
		s2.meth2();
		s2.meth3();
	}
}
