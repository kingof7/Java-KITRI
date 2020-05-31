package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 5. 6.
 * @description : 
 */
class HH {

	private int x;
	private int y;
	private static int count; // method(constant)영역에 있기 때문에 count가 계속 살아있음

	public HH() {
		// TODO Auto-generated constructor stub
	}
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + "\t" + y);
	}

	public void setCount() {
		System.out.println(++count);
	}

	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam28 {

	public static void main(String[] args) {
		HH a = new HH();
		a.setData(10, 20);
		a.setCount();
		a.disp();
		
		HH b = new HH();
		b.setData(30, 40);
		b.setCount();
		b.disp();
		
		HH c = new HH();
		c.setData(50, 60);
		c.setCount();
		c.disp();

	}
}