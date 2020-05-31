package ch06.inheritance;
/**
 * @author : 이종화
 * @date : 2020. 5. 8.
 * @description : 추상클래스
 */

abstract class KParents {	//	추상함수를 하나라도 가지고 있으면 추상클래스로 표시해야함
	protected int x, y;
	
	public void msg() {
		System.out.println("Msg 함수입니다.");
	}
	
	public abstract void disp(); // 추상메서드는 반드시 오버라이딩 해야함
	
}

class KSon extends KParents{
	public void disp() {
		System.out.println("재정의 했습니다.");
		KExam a = new KExam();
		a.abc();
	}
}

public class KExam {

	public static void main(String[] args) {
		// KParents a = new KParents(); 추상클래스는 스스로 인스턴스화 할 수 없다
		KParents b = new KSon();
		b.disp();
		
		KSon c = new KSon();
		c.disp();
		
	}
	KExam b = new KExam();
	//b.abc(); 왜안되지 : main내부로 구문을 옮긴다
	
	public void abc() {
		System.out.println();
	}
}
