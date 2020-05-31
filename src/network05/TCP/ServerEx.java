package network05.TCP;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ServerEx {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
	
			//입력
			BufferedReader br = null;
		
			//출력
			BufferedWriter bw = null;
			PrintWriter pw = null;
			Scanner sc = null;
			
			try {
				InetSocketAddress isa = new InetSocketAddress(6565);
				serverSocket = new ServerSocket();
				serverSocket.bind(isa);
				System.out.println("서버 연결됨");
				
				socket = serverSocket.accept();
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
				pw = new PrintWriter(bw);
				sc = new Scanner(System.in);
				
				String inputMsg = null, outputMsg = null; //클라만 끝낼수있도록				
				while(true) {
					// 입력
					inputMsg = br.readLine();
					
					if(inputMsg.equalsIgnoreCase("q")) break;
					System.out.println(inputMsg);
					
					// 출력
					outputMsg = sc.nextLine();
					pw.println("서버>>" + outputMsg);
					pw.flush();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(sc != null) sc.close();
					if(pw != null) pw.close();
					if(bw != null) bw.close();						
					if(br != null) br.close();				
					if(socket != null) socket.close();
					if(serverSocket != null) serverSocket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	}
}
