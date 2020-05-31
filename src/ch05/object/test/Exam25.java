package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 5. 6.
 * @description : static 클래스안에 non-static 클래스를 호출할 수 없다
 * 				    그래서 EE클래스를 메인밖으로 뺀다
 * 				    생성자 호출순서는 기본 생성자부터 아래로..
 */
	class EE{
		private int x, y, z;
		private int a;

		public EE() {
			x = 100;
			y = 200;
			z = 300;
			a = 400;
		}
		
		public EE(int x) {
			/*
			 * this.x = x; y = 77; z = 88; a = 99;
			 */
			this(); // 코드의 중복을 없애기 위해 기본생성자 호출
			this.x=x;
			
		}
		
		public EE(int x, int y) { // EE g = new EE(77,88)
			/*
			 * this.x = x; this.y = y; z=300; a=400;
			 */
			/*
			 * this(); this.x=x; this.y=y;
			 */
			
			this(x); //? 생성자는 맨 위로 (기본생성자->오버로드생성자1->오버로드생성자2)
			this.y=y;
		}
		
		public void disp() {
			System.out.println(x + "\t" + y + "\t" + z + "\t" + a);
		}
		
	}
	

public class Exam25 {	
	public static void main(String[] args) {
		EE e = new EE();
		EE f = new EE(10);
		EE g = new EE(77,88);		
		
		e.disp();
		f.disp();
		g.disp();
		
	}

}
