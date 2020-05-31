package thread07.Synchronized;

public class Hong extends Thread{
	private Calculator calculator;
		
		public void setCalculator(Calculator calculator) {
			this.calculator = calculator;
			setName("Hong");
		}
		@Override
		public void run() {
			calculator.setMemory(50);
		}
}
