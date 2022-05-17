package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainClass001 {
	public static void main(String[] args) {
		
		InputStream inputStream = null;
		try {
			
			inputStream = new FileInputStream("/home/park/eclipse/hello.txt");
			int data = 0;
			byte[] bs = new byte[3];
			
			while(true) {
				try {
					data = inputStream.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				} if(data == -1) break;
				System.out.println("data :" + data);
				for (int i=0; i<bs.length; i++) {
					System.out.println("bs[" + i + "]" + bs[i]); //last array [1],[2] is remainder of latest array
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
