package ch04.object.pay;
/**
 * 
 * @Author : 김현수
 * @Date : 2020. 4. 29.
 * @Description :  
 *
 */
public class Exam17 {

	public static void main(String[] args) {
		Pay hong = new Pay();
		hong.input("홍길동", 2000000);
		hong.yonsan();
		hong.output();
		
		Pay cho = new Pay();
		cho.input("조인성", 2500000);
		cho.yonsan();
		cho.output();
	}

}
