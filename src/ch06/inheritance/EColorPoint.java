package ch06.inheritance;

public class EColorPoint extends EPoint{
	private String color;
	
	public EColorPoint() {
		// TODO Auto-generated constructor stub
		super(); //부모 디폴트 생성자
	}
	
	public EColorPoint(int x, int y, String color) {
		super(x, y); //부모 생성자
		this.color=color;
	}
	
	public void showColorPoint() {
		showPoint(); // x,y는 부모 클래스에 있는 변수니까 함수타고올라가서 출력
		System.out.println(color); //color는 자식 클래스에 있는 변수니까 여기서 바로 출력
	}
}
