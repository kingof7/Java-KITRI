package api02.Class;

public class ActionMain {
	public static void main(String[] args) throws Exception{
		ReceiveAction r = new ReceiveAction();
		r.execute();
		
		SendAction s = new SendAction();
		s.execute();
		
		Action action = new ReceiveAction();
		action.execute();
		
		action = new SendAction();
		action.execute();
		
		System.out.println("-------위는 정적객체----------\n\n");
			
		
		//동적객체 : 키,밸류(class)방식으로 밸류(class)가 엄청많이 넘어오는데 이 모든 동적객체들을 인터페이스로 묶을 수 있음
		Class<?> clazz = Class.forName("api02.Class.ReceiveAction"); //동적객체 생성
		ReceiveAction obj =(ReceiveAction) clazz.getDeclaredConstructor().newInstance(); // 다운캐스팅하면서 오브젝트로 바꿈
		obj.execute();
		System.out.println(obj); // toString()이 없으니 주소값이 반환
		
		String[] classArray = new String[] {"api02.Class.ReceiveAction", "api02.Class.SendAction"}; //동적객체 2개
		
		for(int i=0;i<classArray.length;i++) {
			Class<?> cla = Class.forName(classArray[i]);
			//그럼 아래는 업캐스팅하는건가..??
			Action ac = (Action) cla.getDeclaredConstructor().newInstance(); // 이래서 인터페이스를 받는거임, 객체가 몇천개일경우 유용함 + 오버라이딩해야함(Action은 자식클래스 메소드를 제어할 수 없으니까)
			ac.execute();
		}
		
		
	}
}
