package multiple.interfaces.conflict.rule3;

public interface InterfaceA {
	default void print() {
		System.out.println("Interface A - print()");
	}
}
