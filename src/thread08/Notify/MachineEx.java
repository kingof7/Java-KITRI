package thread08.Notify;

public class MachineEx {
	public static void main(String[] args) {
		AutoMachine machine = new AutoMachine();
		
		Producer gildong = new  Producer(machine);
		Consumer cho = new Consumer(machine, "경은");
		Consumer kim = new Consumer(machine, "명관");
		Consumer park = new Consumer(machine, "정인");
		
		gildong.start();
		cho.start();
		kim.start();
		park.start();
	}
}
