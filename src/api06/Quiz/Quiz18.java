package api06.Quiz;

public class Quiz18 {
	public static void main(String[] args) {
		/*
		 * String str = "";
		 * 
		 * for(int i=1;i<=100;i++) { //스트링 객체 100번생성 -> 안좋은코드 
		 * 		str += i;
		 * }
		 * 
		 * System.out.println(str);
		 */
		//개선코드 작성위치
		
		StringBuffer str = new StringBuffer("");
		for(int i=1;i<=100;i++) 
			str.append(i);
		
		System.out.println(str);
		
	}
}
