package api09.Map;

import java.util.HashMap;
import java.util.Iterator;

import api08.Collection.Data;

public class HashMapEx03 {

	public static void main(String[] args) {
		Data a = new Data(1, 2);
		Data b = new Data(3, 4);
		Data c = new Data(5, 6);
		
		HashMap<String, Data> map = new HashMap<String, Data>();
		map.put("one",a);
		map.put("two",b);
		map.put("three", c);
		
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()) {
			api08.Collection.Data data = map.get(iter.next());
			data.yonsan();
			data.disp();
		}
		
		map.put("four", new Data(77,88));
		map.replace("two", new Data(100,200));
		map.remove("one");
		System.out.println(map);
		
		iter=map.keySet().iterator();
		while(iter.hasNext()) {
			Data data = map.get(iter.next());
			data.yonsan();
			data.disp();
		}				

	}

}
