package ch06.bb;

import ch06.aa.AA; 	

public class DD {

	public static void main(String[] args) {
			AA a = new AA();
			
			//System.out.println(a.x);
			//System.out.println(a.y); // protected : 동일 패키지 접근 가능 단, extends 해야함
			System.out.println(a.z); 
			//System.out.println(a.su); // default : 다른 패키지 접근 불가
	}
}
