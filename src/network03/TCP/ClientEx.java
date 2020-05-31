package network03.TCP;
/**
 * @author : 이종화
 * @date : 2020. 5. 22.
 * @description : 데이터 전송
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	
	/*
	 * File
	 * 
	 * 파일 시스템의 파일 정보를 얻기 위한 클래스
	 * 
	 * Console
	 * 
	 * 콘솔로부터 문자를 입출력하기 위한 클래스
	 * 
	 * InputStream / OutputStream
	 * 
	 * 바이트 단위 입출력을 위한 최상위 입출력 스트림 클래스
	 * 
	 * FileInputStream / FileOuputStream
	 * 
	 * 바이트 단위 입출력을 위한 하위 스트림 클래스
	 * 
	 * DataInputStream / DataOutputStream
	 * 
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * PrintStream
	 * 
	 * BufferedInputStream / BufferedOutputStream
	 * 
	 * Reader / Writer
	 * 
	 * 문자 단위 입출력을 위한 최상위 입출력 스트림 클래스
	 * 
	 * FileReader / FileWriter 
	 *  
	 * InputStreamReader / OutputStreamWriter
	 * 
	 * PrintWriter
	 * 
	 * BufferedReader / BufferedWriter
	 * 문자 단위 입출력을 위한 하위 스트림 클래스
	 */



	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null; //스트림과 바이트 섞여있음
		BufferedWriter bw = null;
		Scanner sc = null;
		//sc --> BufferedWriter --> socket(binary)로 내보냄
		try {
			
			InetSocketAddress isa = new InetSocketAddress("192.168.0.15",666);
			socket = new Socket();
			socket.connect(isa);
			//소켓은 1바이트로만 내보냄
			//바이너리는 음악,도영상,문자 다됨
			os = socket.getOutputStream(); // 1byte로 나감 5. 소켓으로 던짐
			osw = new OutputStreamWriter(os); //소켓 스트림 이용 // msg.getByte;와 같은 역할 4. 바이너리로 바꿈 osw는 문자를 바이트로바꿈
			bw = new BufferedWriter(osw, 512); // 2byte, 512byte 3. osw에 던짐
			sc = new Scanner(System.in);
			
			System.out.println("전송할 문자: "); //string
			String msg = sc.nextLine(); //1
			bw.write(msg); //2 버퍼에게 보내줌
			bw.flush();
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close();
				if(bw != null) bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
