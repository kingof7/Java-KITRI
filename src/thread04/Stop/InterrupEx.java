package thread04.Stop;

/**
 * @author : 이종화
 * @date : 2020. 5. 21.
 * @description : 스레드가 실행 대기 또는 실행 상태에 있을 때, interrupt() 메서드가 실행되면
 * 							  스레드가 미래에 일시정지 상태가 되어 InterruptedException이 발생한다.
 * 							  interrupt() 메서드가 호출되었다면 스레드는 interrupted() 메서드는 true를 리턴한다.
 */
class SubThread extends Thread {
	public void run() {
		int count = 1;
		System.out.println("실행중...");
		
		while(count <= 10) {
			System.out.println(count);
			
			try {
				if(interrupted()) break;
				sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("스레드가 종료됩니다.");
				System.exit(1); // 프로그램 종료
			}			
			
		}
			
			System.out.println("자원종료....");
			System.out.println("실행종료....");
		}
	}

public class InterrupEx {

	public static void main(String[] args) {
		SubThread sub = new SubThread();
		sub.start();
		
		for(int i=0;i<=2;i++) {
			System.out.println("main" + i); //이게 스레드보다 좀더빠르니까 먼저찍어줌
			
			if(i==1) sub.interrupt();
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
