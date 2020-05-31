package ch04.object.basic;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 4. 29.
 * @Description : 구현클래스 - 
 * 				  실행클래스 - main함수를 가지고 있는 클래스
 * 				  추상클래스 - 상속 / 자신의 객체 발생이 안됨
 * 				  인터페이스 - 상속 / 자신의 객체 발생이 안됨
 *
 */
public class Exam16 {
	public static void main(String args[]) {
		System.out.println("Su Class");
		Su a = new Su();
		a.x = 10;
		a.y = 20;
		System.out.println(a.x + " " + a.y);
		
		Su b = new Su();
		b.x = 77;
		b.y = 88;
		System.out.println(b.x + " " + b.y);
		
		System.out.println("Person Class");
		Person x = new Person(); // 객체 생성
		x.name = "홍길동";
		x.age = 25;
		x.ki = 157.5f;
		x.disp();
		
		Person y = new Person();
		y.input("펭수", 10, 210f);
		y.disp();
		
		
	}
}
