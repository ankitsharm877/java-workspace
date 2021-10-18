package multiple.interfaces.conflict.rule2;

public interface InterfaceM {
	default void show() {
		System.out.println("Interface M - show()");
	}
}
