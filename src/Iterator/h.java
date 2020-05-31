package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class h {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		a.add(10);
		a.add(1);
		a.add(7);

		b.add("a");
		b.add("d");
		b.add("c");
		
		//for(int e : a) System.out.println(e);
		
		
		//이터레이터 : 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
		Iterator i = a.iterator(); //i에 a값들이 들어감
		//i.hasNext(); // 값이 있는지 없는지 판단, true/false
		//i.next(); // 다음 값으로 넘어가는
		
		
		while(i.hasNext()) { // 값이 없을때까지 돌림
			System.out.println(i.next());
			i.remove(); // i.next()한 값을 삭제
		}//다돌면 다삭제
		
		System.out.println("remove");
		while(i.hasNext()) { // 값이 없을때까지 돌림
			System.out.println(i.next());
		}
		
		Iterator i2 = b.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
			i2.remove();
		}
		System.out.println("remove");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
