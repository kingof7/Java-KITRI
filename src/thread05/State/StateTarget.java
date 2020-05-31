package thread05.State;

public class StateTarget extends Thread{
	
	@Override
	public void run() {		// NEW : start() 메소드가 run() 메소드를 호출하기 전까지는 대기 상태, 호출하면 실행
		System.out.println("OK");
		for(long i=0;i<1000000000;i++) { }		// 실행 RUNNABLE
		
		try {
			sleep(2000);										// 일시정지 중에서 sleep == TIMED_WAITING // 대기시간이 길다
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(long i=0;i<1000000000;i++) { }		// 실행 RUNNABLE
	}	 // 종료
}
