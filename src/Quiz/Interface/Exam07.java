package Quiz.Interface;

interface AdderInterface {	
		public int add(int x, int y); //x와 y의 합
		public int add(int x); // 1에서 n까지의 정수 합 리턴, n은 0보다 큰 수로 지정
}
//MyAddress 작성

class MyAddress implements AdderInterface {
	private int hap;
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int add(int x) {
		for(int i=1;i<=x;i++)
			hap += i;
		return hap;
	}	
	
}

public class Exam07 {
	public static void main(String[] args) {
		MyAddress my = new MyAddress();
		System.out.println(my.add(5, 10));
		System.out.println(my.add(10));		
	}

}
