package demo.synchronization.atm;

public class Customer extends Thread {

	String name;
	int amount;
	Atm atm;

	Customer(String n, Atm a, int amt) {
		name = n;
		atm = a;
		amount = amt;
	}

	public void useATM() {
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}

	public void run() {
		useATM();
	}
}
