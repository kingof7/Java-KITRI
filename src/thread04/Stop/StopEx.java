package thread04.Stop;
/**
 * @author : 이종화
 * @date : 2020. 5. 21.
 * @description : 메인 메소드에서는 0,1,2,3찍히는 동시에 셋터에 true값을 넘겨줬기에 while(false)가되어 종료 --> 자원반납 x
 */
class PrintThread extends Thread {
	private boolean stop = false;
		
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		
		while(!stop) { //i->3이되면 stop에 true가 들어가서 반복 종료
			System.out.println("실행 중......." + stop);						
			
			try {
				sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("자원 종료");
			System.out.println("실행 종료");
		}
	}
}

public class StopEx {

	public static void main(String[] args) {
		PrintThread print = new PrintThread();
		print.start(); //쓰레드 객체 생성->실행대기->실행(run() 호출)
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			
			//if(i == 3) print.stop(); //갑자기 종료하면 자원반납이 안됨
			
			if(i==3) {
				print.setStop(true);
				break;
			}
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
