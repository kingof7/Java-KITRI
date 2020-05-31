package ch06.inheritance;

public class EPoint {
	protected int x;
	protected int y;
	
	public EPoint() {
		// TODO Auto-generated constructor stub
	}
	
	public EPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() { 
		System.out.print(x + "\t" + y + "\t");
	}

}
