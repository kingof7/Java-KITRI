package api10.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


/**
 * @author : 이종화
 * @date : 2020. 5. 15.
 * @description : Set : 수학에서의 집합 / 중복값 처리 안됨, 저장 순서 유지되지 않는다.
 * 							  Map : Key, Value / 중복값 처리 됨, 중복 키는 안됨, 저장 순서 유지 되지 않는다.
 * 							  List : Index 값 / 중복값 처리, 저장 순서 유지된다.
 */
public class SetEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple"); //중복값 처리 x
		
		set.remove("apple");
	
		set.clear();
		
		System.out.println(set);
		
		HashSet<Object> obj = new HashSet<Object>();
		obj.add(10);
		obj.add(24.5f);
		obj.add("apple");
		System.out.println();
		
		//데이터를 순차접근해서 객체를 리턴하는 클래스 (반복자)
		Iterator<Object> iter = obj.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next() + "\t");
		}
		
	}

}
