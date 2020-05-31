package thread01.Basic;

/**
 * @author : 이종화
 * @date : 2020. 5. 20.
 * @description : Process : 하나의 프로그램을 말한다. OS에서 두 개 이상의 프로그램이 실행하면
 * 											 멀티 태스킹이라 한다.
 * 
 * 							  Thread : 프로세스 하나의 작업단위이다. 멀티 스레드는 2개 이상의 작업
 * 							  Thread.start()메소드를 사용하면 모든 작업이 섞여서 실행 됨 ( run()을 직접호출하는게아님) -->시스템 호출이라고함
 */
public class Ex01 {

	public static void main(String[] args) {
		
		Digit01 digit = new Digit01();
		//digit.run(); //run을 재정의하고 start를해야함
		digit.start();
	
		for(char i=1;i<=50;i++) {
			 System.out.print("main fuction" + "\t");
		}		
		
		Alphabet01 alphabet = new Alphabet01();
		alphabet.start();
	}

}
