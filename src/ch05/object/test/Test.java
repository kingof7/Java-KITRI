package ch05.object.test;

public class Test {
	private String name; //private으로 짠다 -> DB랑 연결
	private int age;
	private float ki;
	public String getName() {
		return name;
	}
	public void setName(String name) { //받아서 멤버변수에 값 고정
		this.name = name;
	}
	public int getAge() { //멤버변수에 있는 값 리턴
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getKi() {
		return ki;
	}
	public void setKi(float ki) {
		this.ki = ki;
	}	
	
	//데이터 접근 방법 : 1. .연산자 
	//             2. 함수
	//             3. 생성자
	

}
