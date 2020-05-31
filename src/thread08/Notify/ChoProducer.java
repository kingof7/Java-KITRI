package thread08.Notify;

public class ChoProducer extends Thread{
	private WorkData workData;
	
	public ChoProducer(WorkData workData) {
		this.workData = workData;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			workData.sub();
			try {
				sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
