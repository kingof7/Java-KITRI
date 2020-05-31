package api09.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapEx01 {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("spring","봄");
		map.put("summer", "여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
				
		System.out.println(map.get("fall"));
		//인덱스가 없기에 for문을 못쓰니까 이터레이터써야됨
		//key값을 추출해서 Set에 저장
		Set<String> set = map.keySet();
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { //넘어온게 있니?
			//System.out.println(iter.next()); //프린트
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println();
		
		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
		hashMap.put(10, 55.5);
		hashMap.put(20, 66.6);
		hashMap.put(30, 77.7);
		System.out.println(hashMap);
		
		Set<Integer> s = hashMap.keySet();
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			double su = hashMap.get(iterator.next());
			System.out.print(su + "\t");
		}
		
		//추가
		hashMap.put(40, 88.8);
				
		//교체
		hashMap.replace(10, 1000.0);
		
		//삭제
		hashMap.remove(20);
		
		System.out.println(hashMap);
						
	}

}
