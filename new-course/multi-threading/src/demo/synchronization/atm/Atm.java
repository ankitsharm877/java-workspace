package demo.synchronization.atm;

public class Atm {

	synchronized public void checkBalance(String name) {
		System.out.print(name + " Checking ");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println("Balance");
	}

	synchronized public void withdraw(String name, int amount) {
		System.out.print(name + " withdrawing ");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println(amount);

	}
}
