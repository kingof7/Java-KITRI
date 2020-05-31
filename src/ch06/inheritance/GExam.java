package ch06.inheritance;
/**
 * @author : 이종화
 * @date : 2020. 5. 7.
 * @description : 추상클래스는 오버라이딩 반강제, 인터페이스는 100% 강제
 * 								오버라이딩은 상속받은 클래스의 필드,메서드를 그대로 쓰지않기 때문에 사용된다.
 */
class AA { //추상도 인터페이스도아닌 일반 클래스
	public void aa()	{ }
	public void bb() { }
	public void cc() { }
	public void dd() { }
	
	public void disp() { // 함수선언 // 오버라이딩 아님
		System.out.println("hahahahahaha"); // 함수정의
	}
}

class BB extends AA {		//aa(), bb(), cc(), dd() 필요
	
	/*
	 * public void disp() { System.out.println("하하하하"); } //overriding : 함수재정의
	 */
}

class CC extends BB {
	
}


public class GExam {

	public static void main(String[] args) {
		
		BB b = new BB();
		b.disp(); // BB클래스에 disp() 메서드가없으므로 AA로 올라가서 찾음

	}

}
