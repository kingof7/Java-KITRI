//project명 : java
package hashmap;

/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
*/
import java.util.*;
import java.lang.*;

public class Chap01 {
//ArrayList<> 이름
//HashMap<key, value> 이름 = new HashMap<>();
//카페 이름, 메뉴 + 가격까지적어줄수있는게 해쉬맵이다
//hashmap이란 key와 value값으로 데이터를 저장하는 형태
//map이란 key와 value값을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스
//즉, key와 value값으로 저장하는 List형태의 조상임
//
	
	//HashMap의 함수
	//객체 .put .remove .get .containskey .containsValue
	//Set 객체명1 = 객체명2.entrySet
	
	public static void main(String[] args) {
		HashMap<String, Integer> cafe = new HashMap<>(); //ArrayList와 같은 느낌, 배열형태로 저장하는 공간
		//key값은 아메리카노니까 중복이 안되고 value값은 가격이니까 같을 수 있다
		//cafe.put(arg0, arg1);
		cafe.put("아메리카노", 2000);
		cafe.put("카페라떼", 2500);
		cafe.put("사과주스", 3000);
		
		//Set 클래스
		Set cafeMenu = cafe.entrySet(); // Set을 통해 배열형태로 모두 저장
		System.out.println(cafeMenu);
		
	
		// for(int e : cafe) { //HashMap은 배열이아니기에 foreach문 사용불가
		
		//이터레이터
		Iterator i = cafeMenu.iterator(); //각각의 구성요소들을 따로따로 가져놀고 싶다
		while(i.hasNext()) {
			System.out.println(i.next()); //구성요소 하나씩 출력
		}
		
		System.out.println(cafe); // HashMap을 통해 배열형태로 모두 출력
		System.out.println();
		
		//컨테인즈키, 컨테인즈밸류
		if(cafe.containsKey("아메리카노")) //cafe안에 키로 포함되어있냐? true/false 반환
			System.out.println("아메리카노가 존재합니다.");
			System.out.println();
			
		if(cafe.containsValue(2000)) // value값 찾기
			System.out.println("2000원짜리줘");
		
	
		System.out.println(cafe.get("아메리카노")); //하나씩 출력
		System.out.println(cafe.get("카페라떼")); //하나씩 출력
		System.out.println(cafe.get("사과주스")); //하나씩 출력
		cafe.put("아메리카노", 4000);
		System.out.println(cafe.get("아메리카노")); //하나씩 출력
		System.out.println(cafe.get("카페라떼")); //하나씩 출력
		System.out.println(cafe.get("사과주스")); //하나씩 출력
		
		

	}

}
