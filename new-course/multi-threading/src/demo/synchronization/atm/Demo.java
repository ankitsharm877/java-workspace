package demo.synchronization.atm;

public class Demo {

	public static void main(String[] args) {
		Atm atm = new Atm();
		Customer c1 = new Customer("Smith", atm, 100);
		Customer c2 = new Customer("John", atm, 200);
		c1.start();
		c2.start();
	}
}
