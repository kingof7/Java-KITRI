package Quiz.abstractClass;

class Person {
	protected String name;
	protected int kor;
	protected int eng;
	protected int math;
	protected int tot;
	protected float avg;
	
	public void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
}

class Sungjuk extends Person {
	
	public void total() {
		tot = kor + eng + math;
	}
	public void average() {
		avg = (float)tot/3;
	}
	public void disp() {
		System.out.print(name+"\t"+kor+"\t"+eng+"\t"+math+"\t");
		System.out.print(tot+"\t");
		System.out.print(avg);
	}
}

public class Quiz31 {

	public static void main(String[] args) {
		Sungjuk s = new Sungjuk();
		s.setData("홍길동", 100, 70, 80);
		s.total();
		s.average();
		s.disp();
	}

}
