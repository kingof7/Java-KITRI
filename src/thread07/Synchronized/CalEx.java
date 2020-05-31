package thread07.Synchronized;

public class CalEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Hong hong = new Hong();
		hong.setCalculator(calculator);
		hong.start();
		
		Cho cho = new Cho();
		cho.setCalculator(calculator);
		cho.start();
	}
}
