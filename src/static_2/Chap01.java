package static_2;

public class Chap01 {

	public static void main(String[] args) {
		//인스턴스는 각각의 객체마다 생성되는 것이기때문에
		//서로 다른 객체끼리 영향을 주지 않는다.
			Student s = new Student();
			s.st(); // 2. 클래스 자체에 접근해버리기 때문에
			s.nost(); // 1. 인스턴스 객체는 객체마다(s,s1)접근하기에 각각다르지만
			
			Student s1 = new Student();
			s1.st(); // 3. 객체가 s에서 s1로 변해도 누적값이 2가됨
			s1.nost(); // 4. 0부터 다시 1누적
			Student.st();
			Student.st();
	}

}

//스태틱은 같은공간(클래스)를 사용
//인스턴스는 서로 다른공간을 사용
