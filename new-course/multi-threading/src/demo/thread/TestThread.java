package demo.thread;

public class TestThread {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		int i = 1;
		while (true) {
			System.out.println(i + " World");
			i++;
		}

	}

}
