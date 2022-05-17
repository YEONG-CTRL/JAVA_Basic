package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass003 {
	public static void main(String[] args) {
		String str = "Hello Java World data output";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("/home/park/eclipse/hellowrite.txt");
			dataOutputStream = new DataOutputStream(outputStream); // extend FileOutputStream
			
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
