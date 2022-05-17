package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass002 {
	public static void main(String[] args) {
		
		OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("/home/park/eclipse/hellowrite.txt");
			String data = "Hello java world";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

	