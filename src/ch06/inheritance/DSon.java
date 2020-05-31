package ch06.inheritance;

/**
 * @author : 이종화
 * @date : 2020. 5. 7.
 * @description : 생성자 (부모에 디폴트 생성자만 주석처리하면 에러남) 
 */
public class DSon extends DParents{ //DSon에 생성자가 없으므로 디폴트 만들고 부모로올라감
		
	public DSon() {
		// TODO Auto-generated constructor stub
	}
	
	public DSon(int x) {
		super(x);
		//super(50);
		//System.out.println("DSon 기본생성자");
	}
	 	
	public DSon(int x, int y) {
		super(x, y);
		//super(x); // DParents(int x)를 찾아감
		//System.out.println("bbb");
	}
	
	public void showPoint() { 
		System.out.println(x + "\t" + y);
	}
}
