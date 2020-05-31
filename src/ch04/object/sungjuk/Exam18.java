package ch04.object.sungjuk;
/**
 * 
 * @Author : 김현수
 * @Date : 2020. 4. 29.
 * @Description :  
 *
 */
public class Exam18 {

	public static void main(String[] args) {
		Sungjuk hong = new Sungjuk();
		hong.input("홍길동", 30, 40, 35);
		hong.total();
		hong.average();
		hong.grade();
		hong.disp();
		
		Sungjuk cho = new Sungjuk();
		cho.input("조인성", 30, 10, 20);
		cho.total();
		cho.average();
		cho.grade();
		cho.disp();
	}

}
