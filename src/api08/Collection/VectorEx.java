package api08.Collection;
/**
 * @author : 이종화
 * @date : 2020. 5. 14.
 * @description : ArrayList는 Vector보다 ArrayList의 속도가 더 빠르고
 * 							  Vector는 스레드 동기화 처리에 적당하였으나  
 * 						      Collections.synchronizedList()로 ArrayList도 동기화 가능
 */
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		System.out.println(vec.get(2));
		System.out.println(vec);
		
		vec.add(50);
		vec.add(2, 77);
		vec.set(1, 99);
		vec.remove(2);
		System.out.println(vec);
		
		for(int e : vec) { //향상된 for문
			int su = vec.get(e);
			System.out.println(su);
		}
		System.out.println();
			
		
	
	}

}
