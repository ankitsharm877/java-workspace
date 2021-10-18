package demo.thread.classes;

public class ThreadClass extends Thread {
	public ThreadClass(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        //setPriority(Thread.MIN_PRIORITY+2);
    }

	public void run() {
		int count = 1;
		while (true) {
			System.out.println(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
