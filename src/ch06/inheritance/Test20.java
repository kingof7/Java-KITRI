package ch06.inheritance;

class ZZ { protected int x = 10;}

public class Test20 extends ZZ {
	public void disp() {
		System.out.println(x + ", " + this.x + "\t" + super.x);
	}
}
