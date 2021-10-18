package demo.multi.threading.monitor;

public class MyData {

	public void display(String str) {
		synchronized (this) {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		}
	}
}
