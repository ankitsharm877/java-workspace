package demo.callback;

public class DemoCallback {

	public static void main(String[] args) {
		Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();

	}

}
