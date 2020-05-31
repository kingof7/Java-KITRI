package api06.Quiz;

import api01.Object.Member;

class Point {
	private int i, j, k;	
	private String q = String.valueOf(i);
	private String w = String.valueOf(j);
	private String e = String.valueOf(k);	
	
	public Point() {}
	
	public Point(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
				
	}

	@Override
	public String toString() {
		return "[" + i + "\t" +  j  + "\t" + k + "]";
	}

	@Override
	public boolean equals(Object obj) {	// lee abc123, pw123	//재정의
		if(obj instanceof Point) {
			Point o = (Point) obj; //다운캐스팅
				
				if(this.q.equals(o.q) && w.equals(o.w) && e.equals(o.e)) { 				//this.id.equals(lee.id) && pwd.equals(lee.pwd)	
					return true;
				}
		}		
		return false;		
	}
		
	
}
public class Quiz25 {

	public static void main(String[] args) {
		Point p = new Point(1, 2, 3);
		Point o = new Point(1, 2, 3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("결과:" + p.equals(o));

				
	}

}
