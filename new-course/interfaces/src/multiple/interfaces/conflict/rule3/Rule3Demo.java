package multiple.interfaces.conflict.rule3;

public class Rule3Demo {

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		classC.print();
		InterfaceB interfaceB = classC;
		interfaceB.print();
		InterfaceA interfaceA = classC;
		interfaceA.print();
	}

}
