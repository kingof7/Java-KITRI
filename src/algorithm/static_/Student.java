//project명 : java
package static_;

public class Student { //인스턴스는 인스턴스끼리 ,,, 스태틱은 스태틱끼리 나눠야함 그래서 스태틱 메서드 안에 
					   //인스턴스 변수 선언 못한다(접근성을 위해서)
	int a; //인스턴스 변수 : 인스턴스를 만들때마다 새롭게 만들어지는 변수
	public void wow() { //인스턴스 메서드 : 인스턴스를 만들때마다 새롭게 만들어지는 메서드
		System.out.println("wow");
	}
	public static void woo() { // static은 인스턴스 과정 거칠것 없이 클래스에 직접적인 접근이 가능
		//int a; 인스턴스 메서드 쓸 수없음 -> 3 line
		System.out.println("woo");
	} // 단점 : 메모리를 항상 차지하고 있어서 안좋다
	
	//둘의 차이 
}
//non-static은 메모리를 인스턴스화 할때 차지함