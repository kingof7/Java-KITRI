package thread02.Demon;

public class DemonEx02 {
	
	public static void main(String[] args) {
		AutoSave autoSave = new AutoSave();
		autoSave.setDaemon(true);
		autoSave.start();
		
		try {
			Thread.sleep(10000); //10초후 종료
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
