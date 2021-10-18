package multiple.interfaces.conflict.rule3;

public class ClassC implements InterfaceA, InterfaceB{

	public void print() {
		System.out.println("Class C - print()");
		InterfaceA.super.print();
		InterfaceB.super.print();
	}

}
