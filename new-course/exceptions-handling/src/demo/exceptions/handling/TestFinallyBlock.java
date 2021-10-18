package demo.exceptions.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFinallyBlock {
	public static void main(String[] args) {
		File f = null;
		FileReader reader = null;
		try {
			f = new File("filename");
			reader = new FileReader(f);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
