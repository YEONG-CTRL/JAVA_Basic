package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("ready for client");
			
			socket = serverSocket.accept();
			System.out.println("client connected!");
			System.out.println("socket :" + socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while (true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage :" + clientMessage);
				
				dataOutputStream.writeUTF("message send completed");
				dataOutputStream.flush();
				
				if (clientMessage.equals("STOP")) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				
				if(socket != null) socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
