package demo.singleton.classes;

public class DemoSingleton {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
		coffeeMachine.getCoffee();
		
	}
}
