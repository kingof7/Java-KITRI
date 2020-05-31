package ch05.object.saram;

/**
 * @author : 이종화
 * @date : 2020. 4. 29.
 * @description : 클래스 3대 특징 : 은닉화, 함수중복, 상속성
 */
public class Exam05 {

	public static void main(String[] args) {
		Saram hong = new Saram();
		hong.input("홍길동","구로구",
					"010-123-1234","123456-1234657"); //가동, 효율성이 아래보다 더좋다
		hong.output();
		
		Saram cho = new Saram();
		//cho.name="조인성";
		cho.address="이태원";
		cho.phoneNumber="010-222-444-555";
		cho.juminBunho="123456-1234567";
		cho.output();
		
		//System.out.println(cho.name); //Saram class의 접근제한자가 private일 때 접근불가
		System.out.println(cho.address);		
		
	}

}
