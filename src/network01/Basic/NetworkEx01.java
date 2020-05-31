package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author : 이종화
 * @date : 2020. 5. 22.
 * @description : 네트워크 통신시 사용되는 용어들
 * 							  1) IP 주소(전화번호,주민번호) : 네트워크상에 유일하게 식별될 수 있는 네트워크 장치의 주소이다.
 *							  					4개의 숫자가 점(.)으로 연결되어 있음 // 각각은 0~255로 표현가능
 *												현재 4개의 숫자로 표현된 IP주소는 32bit IPv4로 사용된다. 고갈 되면 128bit IPv6으로 사용될 추세
 *												네트워크 환경에 따라서 고정IP, 유동IP가 존재한다.
 *							  2) PORT(내선번호) : 네트워크를 통해서 데이터를 주고 받는 출입구 0~65535
 *								통신을 위해서는 상대방의 IP주소를 알고있고, port번호를 서로 맞춰준다
 *							  3) 내 컴퓨터 IP 주소 확인 : C:>IPCONFIG 192.168.0.3
 *							  4) 도메인 네임(사람이름//protocol.domainname.company) : www.naver.com		/ 125.209.222.141  --DNS서버
 *							  5) DNS 서버 : www.naver.com은 DNS 서버를 통해서 해당 네이버 IP를 반환한다.
 *							
 *							  2. 네트워크 통신 종류
 *							  1) TCP/IP Transfer Control Protocol / Internet Protocol : 전화 통신
 *							     - IP : 네트워크 연결되는 개개의 컴퓨터 주소
 *								 - TCP : IP 프로토콜 위에서 연결형 서비스를 지원하는 전송계층 프로토콜
 *							  2) UTP User Datagram Protocol : 소포방식 ( 이메일 )
 *								  비연결 지향적 프로토콜이다. 비연결 지향적이란 데이터를 주고 받을 때, 연결절차를 거치지 않고 발신자가 일방적으로 데이터를 보내는 방식
 *
 */	
public class NetworkEx01 {

	public static void main(String[] args)  {
			try {					
				InetAddress a = InetAddress.getByName("www.kitri.re.kr");
				System.out.println("IP주소: " + a.getHostAddress()); //IP주소 리턴 cmd 의 nslookup
				System.out.println("도메인 네임: " + a.getHostName());
				
				InetAddress b = InetAddress.getByName("www.kitri.re.kr");
				System.out.println("IP주소: " + b.getHostAddress()); //IP주소 리턴
				System.out.println("도메인 네임: " + b.getHostName());
				
				InetAddress[] c = InetAddress.getAllByName("www.naver.com");
				System.out.println(c.length); // 하나의 도메인 네임에 아이피주소가 다수일 때
				
				for(int i=0;i<c.length;i++) {
					System.out.println("IP 주소: " + c[i].getHostAddress());
					System.out.println("도메인 네임: " + c[i].getHostName() + "\n");
				}
			} catch(UnknownHostException e) {
				e.printStackTrace();			
			}
	}
}
