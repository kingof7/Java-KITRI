package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress("192.168.0.15", 666); // 0~65535
			
			socket = new Socket();		// 클라이언트 Socket 생성
			socket.connect(isa);			// 연결(IP, PORT) 요청
			System.out.println("클라이언트가 연결을 요청합니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(socket != null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
