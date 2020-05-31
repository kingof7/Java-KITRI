package thread07.Synchronized;

public class Family extends Thread {
	private Toilet toilet;
	
	public Family() {
		
	}
	public Family(Toilet toilet) {
		this.toilet = toilet;
	}
	
	@Override
	public void run() {
		toilet.openDoor(Thread.currentThread().getName());
	}
}
