package api03.String;

public class String01 {

	public static void main(String[] args) {
		String a = "apple";
		String b = new String("banana");		
		System.out.println(a + "\t" + b);

		String subject = "자바프로그래밍";
		char ch = subject.charAt(5);
		System.out.println("문자열추출: \n" + ch);
	
		int len = subject.length();
		System.out.println("문자열길이: \n" + len);
		
		int i = subject.indexOf("프로");	//주어진 문자열이 포함되지 않으면 -1 반환
		System.out.println("문자열 시작: \n" + i);
		
		//주민번호 성별 판별 문제
		
		String juminBunho = "123456-9234567";
							
		if((juminBunho.length() == 14) && (juminBunho.charAt(6) == '-') ) {
			
			if(juminBunho.charAt(7) == '1' || juminBunho.charAt(7) == '3' || juminBunho.charAt(7) == '0')
				System.out.println("남자입니다");
			else if(juminBunho.charAt(7) == '2' || juminBunho.charAt(7) == '4' || juminBunho.charAt(7) == '9')
				System.out.println("여자입니다.");
			else if(juminBunho.charAt(7) == '5' || juminBunho.charAt(7) == '6')
				System.out.println("외국인 입니다.");
			else
				System.out.println("잘못 입력했습니다.");
			
		}
		
		//선생님 코드
		if(juminBunho.length() == 14) {
			int location = juminBunho.indexOf('-');	
			
			if(location == -1) {
				char gender = juminBunho.charAt(location + 1);
				
				switch(gender) {
					case'0': case '1': case '3': case '5':
						System.out.println("남자"); break;
					case '9': case '2': case '4': case '6':
						System.out.println("여자"); break;						
				}
				
			} 
			else 
				System.out.println("주민번호가 틀립니다.");
		} 
		else 
			System.out.println("주민번호가 틀립니다.");
				
	}

}
