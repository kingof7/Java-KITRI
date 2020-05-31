package ch06.bb;

import ch06.aa.AA; 		// 패키지가 다른 클래스를 상속받을때는 import해야됨

public class CC extends AA { 
	public void disp() {
		// System.out.println(super.x); // private라서 접근불가
		System.out.println(super.y);	
		System.out.println(super.z);
		
		// System.out.println(super.su); // default라서 다른 패키지끼리 접근 불가
	
	}
}
