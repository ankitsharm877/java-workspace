package demo.callback;

public class Customer implements Member {

	String name;

	Customer(String n) {
		name = n;
	}

	public void callback() {
		System.out.println("Ok, I will visit," + name);

	}
}
