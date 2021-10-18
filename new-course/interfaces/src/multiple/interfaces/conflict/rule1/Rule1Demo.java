package multiple.interfaces.conflict.rule1;

public class Rule1Demo {

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		classC.print();
		InterfaceB interfaceB = classC;
		interfaceB.print();
	}

}
