package multiple.interfaces.conflict.rule3;

public interface InterfaceB {

	default void print() {
		System.out.println("Interface B - print()");
	}
}
