package ch06.inheritance;

interface LParents {
	public static final int SU=10; // static final
	public int value=20;
	public void disp();					  // abstract method

}

class LSon implements LParents {
	private int value;
	
	@Override
	public void disp() {
		System.out.println(SU);
	}
	
	public void output() {
		value=77;
		System.out.println(value);
	}
}

public class LExam {

	public static void main(String[] args) {
		//LParents iI - new LParents();
		LParents p =new LSon();
		p.disp();
		System.out.println(LParents.SU);
		LSon s = new LSon();
		s.disp();
		s.output();
		
		
	}

}
