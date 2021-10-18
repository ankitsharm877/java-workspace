package demo.file;

import java.io.File;

public class DemoFile {
	public static void main(String[] args) throws Exception {
		// select path of any directory on you computer
		File f = new File("C:\\MyJava");

		System.out.println(f.isDirectory());
		File list[] = f.listFiles();

		for (File x : list) {
			System.out.println(x.getParent() + " " + x.getName());
		}
	}
}
