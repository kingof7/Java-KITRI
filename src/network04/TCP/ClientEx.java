package network04.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter; //바이트모아서 처리
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter; //2->1byte
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket; //소켓 내보내면 소켓이 아이피랑 포트번호로 내보냄
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		BufferedReader br = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress("192.168.0.15", 7878);
			socket = new Socket();
			socket.connect(isa);
			
			//출력
			os = socket.getOutputStream(); // 소켓이 스트림 가져옴
			osw = new OutputStreamWriter(os); //2(스트링)->1byte
			bw = new BufferedWriter(osw, 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			
			System.out.println("전송할 문자");
			String msg = sc.nextLine(); //스트링 = 2바이트
			pw.println(msg); //매개변수를 스트림에 출력
			pw.flush();
			
			//입력					
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			String reply = br.readLine();
			System.out.println("서버가 보낸 메시지: " + reply);
			
		}catch(UnknownHostException e	) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {				
				if(br != null) br.close();
				
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				if(osw != null) osw.close();
				if(os != null) os.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
