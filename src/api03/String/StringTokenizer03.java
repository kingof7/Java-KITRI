package api03.String;

import java.util.StringTokenizer;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 13.
 * @Description :  StringTokenizer 
 * java.lang 패키지 빼고는 import를 해줘야 한다. //토큰:구분자로 나눠진값
 *
 */
public class StringTokenizer03 {
	public static void main(String[] args) {
		String strText = "홍길동/이영자/조인성";
		StringTokenizer st = new StringTokenizer(strText, "/");
		System.out.println("count : " + st.countTokens());
		
		while (st.hasMoreTokens()) { // 토큰에 담긴 값을 차례로 가져온다.
			String token = st.nextToken();
			System.out.println(st.countTokens() + "\t" + token);
		}
		while (st.hasMoreTokens()) { // 두번 실행시 토큰 값을 가져올 수 없다 위에서 다 써버려서;;
			String token = st.nextToken();
			System.out.println(st.countTokens() + "\t" + token);
		}
		
		System.out.println();
		String strValue = "홍길동/이영자*조인성";
		StringTokenizer stoken = new StringTokenizer(strValue, "/"); //StringTokenizer는 하나의 구분자만 사용가능
		
		while (stoken.hasMoreTokens()) { //토큰이 남아있는지 확인 -> 홍길동 이영자*조인성
			String token = stoken.nextToken(); //다음 토큰을 반환 -> 홍길동 이영자*조인성
			StringTokenizer ken = new StringTokenizer(token, "*"); // 구분자가 여러개일경우 여러번 while문 실행하여 걸러낸다.
			
			while (ken.hasMoreTokens()) {  //토큰이 남아있는지 확인 -> 홍길동 이영자 조인성
				System.out.println(ken.nextToken()); 
			}
		}
		
	}
}
