package javaStudy.ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(Path.ch15.path+args[0]);
			FileOutputStream fos = new FileOutputStream(Path.ch15.path+args[1]);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data); // void write(int b)
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
