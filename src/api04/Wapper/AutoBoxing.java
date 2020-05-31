package api04.Wapper;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 13.
 * @Description : Wapper 클래스 : 기본타입(byte ~~ double, boolean) 값을 포장하는 객체.
 * 								  즉, 기본자료형을 클래스로 제공 (Integer, Boolean..)
 * 								  ***기본자료형을 객체로 다룰 수 있다.***
 *
 */
public class AutoBoxing {
	public static void main(String[] args) {
		// Boxing, UnBoxing
		int su = 10;
		Integer obj = su; // AutoBoxing이라 한다., int의 기본자료형 변수를 Integer 타입의 변수의 담았다.
		System.out.println(obj);
		
		int value = obj; // AutoUnBoxing. 반대개념이다.
		System.out.println(value);
		
		int hap = obj + 100;
		System.out.println(hap);
		
		System.out.println();
		
		//int 자료형을 객체화
		Integer a = 127; // AutoBoxing, 내부적으로 Integer a = new Integer(20);로 작동한다. (-128~127 주소 공유한다.)
		Integer b = 127;	// Integer a = new Integer(30); // AutoBoxing // a=0x100, b = 0x100
		System.out.println("주소값비교:" + (a==b)); //false
		System.out.println(a.equals(b)); //false
		
		Integer c = 300;	// Integer c = new Integer(300)
		Integer d = 300;
		System.out.println(c == d); //false
		System.out.println(c.equals(d)); //true
		
		if(a == b) {	 
			System.out.println("T");
		}else {
			System.out.println("F");
		}
	}
}
