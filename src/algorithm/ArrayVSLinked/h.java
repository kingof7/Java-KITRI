package ArrayVSLinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class h {

	public static void main(String[] args) {
		Random r = new Random(); // 난수발생
		ArrayList<Integer> a = new ArrayList<>();
		long start = System.nanoTime(); //시작시간을 구함
		for(int z = 0;z < 1000; z++) {
			a.add(z);
		}
		long finish = System.nanoTime();//종료시간을 구함
		System.out.println("ArrayList insertion(삽입) time:"+(finish-start));
		System.out.println();
		long start1 = System.nanoTime();
		a.get(850); //850번째 값
		long finish1 = System.nanoTime();
		System.out.println("ArrayList get(체크) time"+(finish1-start1));
		
		System.out.println();
		System.out.println();
		
		LinkedList<Integer> l = new LinkedList<>();
		long start3 = System.nanoTime();
		for(int z1=0;z1<1000;z1++) {
			l.add(z1);
		}
		long finish3 = System.nanoTime();
		System.out.print("LinkedList insertion(삽입) time"+(finish3-start3));
		
		System.out.println();
		long start4 = System.nanoTime();
		l.get(850);
		long finish4 = System.nanoTime();
		System.out.print("LinkedList get(체크) time"+(finish4-start4));
		
	}

}
