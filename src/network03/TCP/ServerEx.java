package network03.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;		
		BufferedReader br = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress(2123);
			serverSocket = new ServerSocket(); // 서버 소켓 생성
			serverSocket.bind(isa);
			System.out.println("서버 연결 대기 중");
			
			socket = serverSocket.accept();
			//바이너리는 인풋아웃풋
			is = socket.getInputStream();
			isr = new InputStreamReader(is); // 문자가됨
			br = new BufferedReader(isr, 512);
			
			String msg = br.readLine();
			System.out.println("[" + socket.getInetAddress().getHostAddress() + "]: " + msg);
			
			/*
			 * InetAddress ia = socket.getInetAddress(); String ip = ia.getHostAddress(); --> 35line에 한꺼번에씀
			 */
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!= null) br.close();
				if(is!= null) is.close();
				if(isr!= null) isr.close();
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
