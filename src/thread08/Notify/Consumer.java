package thread08.Notify;

public class Consumer extends Thread{
	private AutoMachine machine;
	private String name;
	
	public Consumer(AutoMachine machine, String name) {
		this.machine = machine;
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(machine.getDrink() + " : " + name + " 꺼내 먹음");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
}
