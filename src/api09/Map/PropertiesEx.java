package api09.Map;

import java.io.FileReader;
import java.util.Properties;
import java.util.Iterator;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		// ~ class가 위치한 곳에서 가져와라
		String path = PropertiesEx.class.getResource("data.properties").getPath();
		System.out.println(path);
		
		Properties pro = new Properties();
		pro.load(new FileReader(path));
		
		Iterator<Object> iterator = pro.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(pro.get((String) iterator.next()));
			String key = (String) iterator.next();
			System.out.println(pro.get(key));
		}
		
		
	}

}
