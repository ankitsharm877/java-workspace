package demo.runnable;

public class TestRunnable {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();

		int i = 1;
		while (true) {
			System.out.println(i + " World");
			i++;
		}
	}

}
