package thread03.join;

public class JoinEx {
	public static void main(String[] args) {
		Sum sum = new Sum();
		//sum.run(); //단일 스레드
		sum.start(); //멀티 스레드
		
		try {
			sum.join();	//Sum 클래스 스레드가 종료할때까지 JoinEx 스레드는 일시 정지한다.(기다려준다)
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		System.out.println("Main 합: " + sum.getSum()); //멀티스레드 경우 이게먼저 나옴 근데 getSum은 아직연산중이므로 일단 0나옴
																					   //sum.join경우 Sum클래스 연산기다려줌
	}
}
