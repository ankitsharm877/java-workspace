package interfaces.practice;

public class InterfacePractice {

	public static void main(String[] args) {
		CClass cClass = new CClass();
		System.out.println(CClass.X);
		System.out.println(IInterface.X);
		IInterface.meth3();
		IInterface.meth4();
		cClass.meth5();
		cClass.meth6();
	}
}
