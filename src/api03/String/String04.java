package api03.String;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 13.
 * @Description :  split("정규표헌식") : 정규표현식 구분자로 해서 부문 문자열을 분리한 후
 * 										 배열에 저장하고 반환한다.
 *
 */
public class String04 {
	public static void main(String[] args) {
		String str = "홍길동,이수홍,박연수,김자바,최영호";
		String[] strArr = str.split(",");
		
		for (String i: strArr) {
			System.out.println(i);
		}
		System.out.println();
		
		String text = "홍길동&이수홍;박연수,김자바-최영호";
		String[] testArr = str.split("& | , | -");
		
		for (String i: testArr) {
			System.out.println(i);
		}
		
		
	}
}
