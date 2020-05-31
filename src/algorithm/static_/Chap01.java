package static_;

public class Chap01 {

	//클래스를 만들때 인스턴스화 시켜서 만든다
	
	public static void main(String[] args) { //public다른클래스 사용가능 / void보내는게 없음(String[] args 글자형태의 입력을 받겠다 선언된모든것)
		Student s = new Student(); // 우항은 인스턴스화다
		s.wow(); // 객체를 생성후 접근
		s.woo();
		//Student.wow(); static이 아니라서 이건안됨
		Student.woo(); // static은 안스턴스화 시키지 않고 클래스에 직접적인 접근이 가능
		Student s1 = new Student();
		s1.wow(); // 객체를 생성후 접근
		s1.woo();
		Student s2 = new Student();
		s2.wow(); // 객체를 생성후 접근
		s2.woo();
	}

}
