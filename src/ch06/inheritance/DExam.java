package ch06.inheritance;

public class DExam {
	public static void main(String[] args) {
		DSon a = new DSon();
		DSon b = new DSon(10);
		DSon c = new DSon(77, 88);
		
		b.showPoint();
		c.showPoint();
		
	}
}
