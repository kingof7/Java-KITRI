package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		ServerSocket serverSocket = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress(666); //포트를 열고
			serverSocket = new ServerSocket(); // 서버 소켓 생성
			serverSocket.bind(isa);
			System.out.println("서버가 연결을 기다리고 있습니다.");
			
			socket = serverSocket.accept(); // 클라이언트 접속 후 연결 수락
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			
			System.out.println("접속: " + ip);			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket != null) serverSocket.close();
				if(socket != null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
