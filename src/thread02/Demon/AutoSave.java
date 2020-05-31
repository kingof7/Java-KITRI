package thread02.Demon;

public class AutoSave extends Thread{
	
	public void save() {
		System.out.println("작업을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}			
			save(); // 0.5초 쉬었다가 호출
		}		
		
	}
}
