package ch06.inheritance;

class XX  {
	public void disp() {
		System.out.println("disp Function");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "집고고";
	}
		
}

class YY extends XX {
//	public void setData(XX x) 
	public void setData(Object obj){	// Object obj = XX x; 와 같고 (upCasting)
		//obj.disp(); ERROR 자식 메소드라서 못씀
		
		XX x = (XX) obj; // downCasting
		x.disp();
		System.out.println(x.toString());
		/*
		 * System.out.println(x.toString());
		 * x.disp();
		 */
	}
}

public class IExam {

	public static void main(String[] args) {
		XX x = new XX();
		YY y = new YY();
		y.setData(x); // y.setData(XX x)와 같다
	}

}
