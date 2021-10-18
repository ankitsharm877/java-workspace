package demo.runnable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		int i = 1;
		 while (true) {
			 System.out.println("Hello " + i);
			 i++;
		 }
	}

}
