package multiple.interfaces.conflict.rule2;

public interface InterfaceN extends InterfaceM{
	default void show() {
		System.out.println("Interface N - show()");
	}
}
