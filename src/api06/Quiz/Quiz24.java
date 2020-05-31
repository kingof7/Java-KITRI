package api06.Quiz;

import java.util.StringTokenizer;

public class Quiz24 {

	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		
		// splict() 메소드 이용
		
		String[] strArr = str.split(", ");
		for (String i: strArr) {
			System.out.println(i);
		}
		System.out.println();
		
		// StringTokenizer 이용
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		
		while (st.hasMoreTokens()) { 
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
