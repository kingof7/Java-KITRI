package thread05.State;

public class Ex {

	public static void main(String[] args) {
		StateTarget target = new StateTarget();
		
		while(true) {
			Thread.State state = target.getState(); //inner class // 인스턴스화 안시켜도되나?
			System.out.println("타겟 스레드 상태:" + state);
			
			
			if(state == Thread.State.NEW) { target.start(); } 
									
			if(state == Thread.State.RUNNABLE) { }//실행대기
			
			if(state == Thread.State.TIMED_WAITING) {	}
			
			//if(state == Thread.State.WAITING) {	}
			
			//if(state == Thread.State.BLOCKED) {	}	
			
			if(state == Thread.State.TERMINATED) { break; }
			
				try {
					Thread.sleep(100); //대기시간에 러너블 비해 짧다
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		
	}
}


