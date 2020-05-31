package ch04.object.basic;

public class Person {
	public String name; // 인스턴스변수, 멤버변수, 필드 라고 불리운다.
	public int age;
	public float ki;
	
	public Person() {
		
	}
	
	public void disp() { // 인스턴스 메서드, 멤버 메서드
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
	}
	// 데이터 접근 방법 .연산자, 멤버 메서드, 생성자 
	public void input(String n, int a, float k) {
		name = n;
		age = a;
		ki = k;
		System.out.println(n);
		System.out.println(a);
		System.out.println(k);
	}
}
