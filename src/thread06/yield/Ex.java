package thread06.yield;

public class Ex {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
		
		a.stop = true;
		b.stop = true;
	}

}
