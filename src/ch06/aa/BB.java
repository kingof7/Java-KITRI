package ch06.aa;

public class BB {
	public static void main(String[] args) {
		AA a = new AA();
		
		// System.out.println(a.x);		ERROR
		System.out.println(a.z);
		System.out.println(a.y);			 // 동일 패키지 안에서 접근 가능
		System.out.println(a.su);		 // 동일 패키지 안에서 접근 가능
	}
}
