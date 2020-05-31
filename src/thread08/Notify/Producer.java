package thread08.Notify;

public class Producer extends Thread{
	private AutoMachine machine;
	private int i;
	
	public Producer (AutoMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			machine.setDrink("음료 No " + i);
			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println("에러");
			}
		}
	}

}
