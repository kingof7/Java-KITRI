package ch05.object.test;

class BB{
	private int x;//컴파일러가 this포인터를 만들고 이것이 x를참조하게끔함
	private int y;
	private int z;
	//생성자는 리턴이없다
	
	public BB(int x, int y, int z) { //생성자
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public void disp() {
		System.out.println(this.x + "\t" + y + "\t" + z);
	}
}

public class Exam21 {

	public static void main(String[] args) {
		BB b=new BB(1,2,3);
		b.disp();
	}

}
