package static_2;

public class Student {
	int ns = 0; //nonstatic variable
	static int s = 0;
	
	int a = 0;
	int b = 0;
	static int width=5;
	static int height=8;
	
	
	//static이란 같은 공간에 접근하는 것이고, 클래스에 직접접근이 가능한다
	//딱 확실한 값들, 확실해야만 메모리에 저장해놓을 수 있음
	//인스턴스 변수와 인스턴스 메서드가 같이 정의되고
	//스태틱 변수와 스태틱 메서드가 같이 정의되어야 함
	//가장큰차이: 클래스에 직접 접근하느냐 vs 인스턴스화에 접근해서 생성되느냐
	//논스태틱:각각 접근하는 객체마다 다르고
	//스태틱:객체가 달라도 접근하는 메모리영역은 같다
	
	public void nost() { //nonstatic method
		ns++;
		System.out.println(ns);
		//s = 10;
		//ns = 10;
	}
	
	public static void st() {
		s++;
		System.out.println(s);
		//s = 10;
		//nonstatic = 10; 안됨
	}
}
