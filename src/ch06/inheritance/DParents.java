package ch06.inheritance;

public class DParents {
	protected int x;
	protected int y;
	
	
	public DParents() {
		System.out.println("DParents 기본생성자"); 
	}
	 
	
	public DParents(int x) {
		this.x = x;
		this.y = 20;
	}
	
	public DParents(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
