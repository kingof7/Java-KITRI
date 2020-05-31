package ch06.inheritance;

class Super{
	private int a,b;
	public void disp() {
		System.out.println(a + ", " + b);
	}
	
}

public class Test13 extends Super{
		
	public void disp() {
		System.out.println(a + ", " + b);
	}
}
