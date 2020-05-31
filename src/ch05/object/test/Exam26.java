package ch05.object.test;
/**
 * @author : 이종화
 * @date : 2020. 5. 6.
 * @description : 함수중복 - Overload or Overloading
 * 				    함수명은 같지만 파라미터 형에 따라서 호출되는 함수를 자동으로 찾아준다
 */
class FF{	 //함수들의 이름이 너무 다양해서 찾기가 어렵다 -> disp, hap로 통일
	public void disp(int x) {
		System.out.println(x);
	}
	public void disp(int x, float y) {
		System.out.println(x + "\t" + y);
	}
	public void disp(String str) {
		System.out.println(str);
	}
	public int hap(int x, int y) {
		return x + y;
	}
	public float hap(float x, float y) {
		return x + y;
	}		
}

public class Exam26 {

	public static void main(String[] args) {
		//파라미터 형에 맞는 함수를 알아서 호출함
		FF f = new FF();
		f.disp(10);
		f.disp("apple");
		f.disp(77, 88.8f); // f를 꼭써준다
		
		System.out.println(f.hap(5,6));
		System.out.println(f.hap(77.7f, 88.8f));
		
	}

}
