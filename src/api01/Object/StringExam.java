package api01.Object;

public class StringExam {
		public static void main(String[] args) {
			
		String str = "apple";
		int su = 10;
		
		Integer value = new Integer(10);
		System.out.println(value.toString());
		
		Member member = new Member("abc123", "pwd123");
		System.out.println(member.toString());
		System.out.println(member); // toString() 생략 --> 내부적으로 toString을 찾는다
		
		Su s = new Su();
		s.setX(10);
		s.setY(20);
		s.setZ(30);
		System.out.println(s.toString());
		System.out.println(s);
		}
		
	
}
