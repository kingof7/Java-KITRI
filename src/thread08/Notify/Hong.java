package thread08.Notify;

public class Hong extends Thread{
	private WorkData workData;
	
	public Hong() {}
	
	public Hong(WorkData workData) {
		this.workData = workData;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			workData.method();
			try {
				sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
