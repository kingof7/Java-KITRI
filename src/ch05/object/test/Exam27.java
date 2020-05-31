package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 5. 6.
 * @description : 클래스배열
 * 				    
 */

class GG{
	private int x;
	private int y;
	
	public GG() {} //디폴트 생성자는 무조건 만들어야 됨 + 변수의 초기화가 0으로 자동으로 됨
	
	public GG(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
			
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
	
}

public class Exam27 {
	public static void main(String[] args) {
		GG[] array = new GG[5];
		array[0] = new GG(10,20);
		array[1] = new GG(30,40);
		array[2] = new GG(50,60);
		array[3] = new GG(70,80);
		array[4] = new GG(99,88);

		for(int i=0;i<array.length;i++) {
			array[i].disp();
		}


	}
}
