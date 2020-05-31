package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 5. 6.
 * @description : 
 */
class YY{
	private int x;
	public int y;

	private static int a; //객체와 this로 접근을 권장하지 않음, class관할 아니므로
	public static int b;

	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void sub(int a, int b) { //a와 b는 클래스와 같이 힙에있는 것이아니라, 메서드 영역에 있기 때문에 this나 객체로 접근하면 불안정함
		YY.a = a; // this.a = a; --> 되긴 되지만 불안정함
		YY.b = b;
		
	}
}

public class Exam29 {
	public static void main(String[] args) {
		YY y = new YY();
		y.y = 70;
		y.b = 20; // 스태틱이라 객체나 this로 접근하면 안정적이지 못함
		System.out.println(y.b);
		YY.b=20; //스태틱은 클래스로 접근
	}
}