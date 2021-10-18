package multiple.interfaces.conflict.rule1;

public interface InterfaceB {

	default void print() {
		System.out.println("InterfaceB - print()");
	}
}
