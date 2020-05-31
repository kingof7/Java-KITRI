package api02.Class;
/**
 * @author : 이종화
 * @date : 2020. 5. 12.
 * @description :  동적객체생성 (API 참고)
 * 									Class 클래스 : 동적객체 생성시 사용,
 * 															 클래스 이름, 필드정보, 메소드 정보, 생성자 정보
 */
public class CarMain {
	public static void main(String[] args) throws Exception{
		Car car = new Car("그랜져", "강사");
		System.out.println(car.toString());
		
		Class<?> a = car.getClass(); //car의 클래스 정보를 넘겨줌
		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(a.getPackageName());
		
		Car c = new Car();
		c.setModel("소나타");
		c.setOwner("김경은");
		System.out.println(c.getModel()+"\t"+c.getOwner());
		
		//동적객체생성 - 풀패키지명 문자열
		String str ="api02.Class.Car";
		System.out.println(str);
		Class<?> cls = Class.forName(str) ; // 문자열이 클래스로 바뀜 // class<?>로반환
		Car obj = (Car) cls.getDeclaredConstructor().newInstance(); //cls.newInstance() = object반환 // 다운캐스팅
		//str->class->object
		
		obj.setModel("아반떼");
		obj.setOwner("지명관");
		System.out.println(obj.toString());
		
		System.out.println();
		
	}
}
