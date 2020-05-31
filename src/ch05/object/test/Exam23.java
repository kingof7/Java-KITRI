package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 4. 29.
 * @description : 생성자 중복
 * 				     중복은 생성자명 또는 함수명 이름은 같지만 파라메타 타입이나
 * 				     개수가 달라야한다.
 */

class CC{
	private int x;
	private int y;
	
	public CC() {
		
	}
	public CC(int x, int y) { // 생성자 중복 
		this.x=x;
		this.y=y;
	}
	
	public void input(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void disp() {
		System.out.print(x + " " + y);
		System.out.println();
	}
}


public class Exam23 {	

	public static void main(String[] args) {
		CC a = new CC(10,20);
		a.disp();
		
		CC b = new CC(); //구문에맞는(기본생성자) 생성자 호출
		b.input(77, 88);
		b.disp();

	}

}
