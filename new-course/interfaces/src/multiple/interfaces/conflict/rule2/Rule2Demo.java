package multiple.interfaces.conflict.rule2;

public class Rule2Demo {
	public static void main(String[] args) {
		ClassO classO = new ClassO();
		classO.show();
		InterfaceM interfaceM = classO;
		interfaceM.show();
		InterfaceN interfaceN = classO;
		interfaceN.show();
	}
}
