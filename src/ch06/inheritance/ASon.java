package ch06.inheritance;

public class ASon extends AParents {
	private int su;
	private int value;
	
	public void setData(int x, int y, int su, int value) {
		super.x = x;				//this.x=x;
		super.y = y;			//내 껀지 부모 껀지 구분하기위해 super를 써주는게 좋다
		
		this.su = su;
		this.value = value;		
	}
	
	public void disp() {
		System.out.println(x + "\t" + this.x);
		System.out.println(super.x);
		
		System.out.println(y + "\t" + this.y);
		System.out.println(super.y);
		
		sub();
		this.sub();
		super.sub();
		
		System.out.println(su + "\t" + this.su);
		System.out.println(value + "\t" + this.value);
	}
}