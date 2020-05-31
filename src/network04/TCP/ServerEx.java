package network04.TCP;

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
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
			
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
			try {
				InetSocketAddress isa = new InetSocketAddress(7878);
				serverSocket = new ServerSocket();
				serverSocket.bind(isa);
				System.out.println("서버가 연결을 기다리고 있습니다.");
			
				//입력
				socket = serverSocket.accept();
				is = socket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr, 512);
				String msg = br.readLine();
				System.out.println("["+socket.getInetAddress().getHostAddress() + "]: " + msg);
				
				//출력			
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
				pw = new PrintWriter(bw);
				sc = new Scanner(System.in);
				
				System.out.println("답변문자");
				String reply = sc.nextLine();
				
				pw.println(reply);
				pw.flush();	
			
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();		
				
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(is != null) is.close();
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
