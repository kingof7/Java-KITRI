package thread06.yield;

public class A extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {				
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A 작업내용");
			}
		}
		
		System.out.println("A 종료");
	}

}