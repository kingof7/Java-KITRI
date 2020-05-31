package ch06.inheritance;

class HParents {
	protected int x;
	protected int y;
	
	public HParents() {}
	
	public HParents(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void yonsan() {
		System.out.println("hap: " + (x+y));
	}
}	
	
class HSon extends HParents {
	
	public HSon() {
		// TODO Auto-generated constructor stub
	}
	
	public HSon(int x, int y) {
		super(x,y);
	}
	
	public void yonsan() {
		System.out.println("cha: " + (x-y));
	}
	public void disp() {
		System.out.println("hihihi");
	}
}

public class HExam {

	public static void main(String[] args) {
		HParents h = new HParents(77, 88);
		h.yonsan();
		
		HSon s = new HSon(100, 200);
		s.yonsan(); 	//함수재정의
		
		// HSon a = new HParents(1, 2);		ERROR 자식은 부모클래스를 담을 수 없다
		HParents r = new HSon(1, 2);	//upCasting
		r.yonsan(); // ? 함수를 컨트롤하지못하기에 오버라이딩된 함수가 우선순위임
		//r.disp();			ERROR
		
		HSon a = (HSon) r;		//부모의 객체를 형변환해서 자식 클래스에 담음	//downCasting
		a.yonsan();
		
		HSon b = (HSon) new HParents(1,2); //부모의 객체를 형변환해서 자식 클래스에 담음
		b.disp(); // ERROR : upCasting 먼저한 객체만 downCasting이 가능
		
	}
}

