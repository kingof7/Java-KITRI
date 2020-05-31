package ch06.inheritance;
/**
 * @author : 이종화
 * @date : 2020. 5. 7.
 * @description : 클래스의 3대 특징 : 은닉화(public변수를 왠만하면 x-->함수나 생성자를 통해서 접근)
 * 																중복성 , 상속성
 */
public class AParents {
	protected int x;
	protected int y; // 외부접근은 안되지만, 상속만 줄때 protected (Class Diagram에서 #으로 씀)
								// public은 static 클래스에 주로 씀
	
	public void sub() {
		System.out.println("AParents sub Function \n");
	}
}