package api09.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapEx02 {
	HashMap<String, Object> map = new HashMap<String, Object>();
	map.put("id", "abc123");
	map.put("pwd", 12345);
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("아이디:");
		String id = sc.next();
		
		System.out.println("비밀번호:");
		int pwd = sc.nextInt();
		
		if(id.equals((String) map.get("id"))){ //다운캐스팅
			
			if(pwd==(Integer) map.get("pwd")) {
				System.out.println("로그인 성공!!!");
				sc.close();
				break;
			}else {
				System.out.println("비밀번호 확인해 주세요");
			}else {
			System.out.println("아이디 확인해 주세요");
			}		
	}
}
}
