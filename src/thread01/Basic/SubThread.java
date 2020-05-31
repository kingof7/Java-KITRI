package thread01.Basic;

public class SubThread extends Thread {
	
	public static boolean inputCheck = false; //static이므로, 객체발생없이 inputCheck가 계속살아있을 수 있음
	
	@Override
	public void run() {
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			if(inputCheck) return; //입력값이 있다면, 아래 실행안하고 빠져나감
			
			try {
				sleep(1000); // 1000ms = 1 second
			} catch(InterruptedException e) {
				e.printStackTrace();
			}			
		}
		System.out.println("데이터가 입력되지 않았습니다."); //for를 다돌고 나와서
		System.exit(0); // 스레드 모두 정상 종료 Terminated
	}

}
