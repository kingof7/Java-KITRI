package api08.Collection;

import java.util.ArrayList;
/**
 * @author : 이종화
 * @date : 2020. 5. 14.
 * @description : 컬렉션은 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
 * 							  java.util 패키지에 관련된 인터페이스와 클래스를 포함시켜 놓았다. 이를 총칭해서 컬렉션
 * 							  프레임워크라고 부른다.
 * 
 * 							  1) List : ArrayList, Vector, LinkedList, Stack, Queue
 * 							  2) Set : HashSet, TreeSet
 * 							  3) Map : HashMap, HashTable, TreeMap, Properties
 */
public class ArrayList01 {

	public static void main(String[] args) {
		// List : 순서를 가지고 있다. (예측이 가능)
		// 상속 : AbstractCollection - AbstractList - ArrayList
		String a = "apple";
		String b = "banana";
		
		ArrayList<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add("JSP");
		list.add("Oracle");
		
		System.out.println("저장갯수: " + list.size());
		System.out.println("2번지 객체 얻기: " + list.get(2));
		System.out.println();
		for(String e : list) 
			System.out.println(e);
		System.out.println("\n");		
		list.add("사과");
		list.add(1, "바나나");
		
		for(String e : list) 
			System.out.println(e);
		System.out.println();
		
		// 교체
		list.set(3, "안녕하세요"); 
		System.out.println(list);
		
		System.out.println();
		
		//삭제
		list.remove(0);
		System.out.println(list);
		System.out.println();
		
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(10);				//10정수 autoBoxing		 Integer a = new Integer(10);
		arr.add(20);
		arr.add(200);
		System.out.println(arr);
		System.out.println();
		
		for(String e : list) 
			System.out.println(e);
		
		//모든 형태의 데이터가 add될 수 있음
		ArrayList<Object> brr = new ArrayList<Object>(); //***인터페이스가 많이들어감
		brr.add(22.2);
		brr.add(10);
		brr.add("apple");
		brr.add('A');
		System.out.println(brr);
		
	}

}
