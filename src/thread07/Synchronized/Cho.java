package thread07.Synchronized;

public class Cho extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("Cho");
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
