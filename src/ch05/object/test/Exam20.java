package ch05.object.test;

class AA{ //? 메인바깥에 클래스는 public 붙이지 않는다 -->붙이게되면 메인함수가 찾지못함 // this=객체(a)
	private int x;
	private int y;
	
	public void input(int x, int y) {
		x=x; //넘어온값이 그대로 x가됨
		this.y=y; //this.y는 AA클래스의 멤버변수 y다.
		//x=x면 input안에서의 x이고
		
		System.out.println(x); 		//지역변수(넘어온값)
		System.out.println(this.x); //멤버변수
		
		System.out.println(y);		//지역변수(넘어온값)
		System.out.println(this.y); //멤버변수
	
	}
	
	public void sub() {
		//System.out.println(x);	//x가블록안에 없으니 순차적으로 위로 올라가서 x찾음
		System.out.println(x);
	}
}

public class Exam20 {
	public static void main(String[] args) {
		AA a = new AA();
		a.input(10,20);
		a.sub();
	}

}
