package Quiz.Interface;

interface Action{
	void work();
}

class Study implements Action {

	@Override
	public void work() {
		System.out.println("열심히 공부합니다.");		
	}
	
}
public class Quiz10 {

	public static void main(String[] args) {
		Action action = new Study();
		action.work();
	}

}
