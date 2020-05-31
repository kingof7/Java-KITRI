package thread07.Synchronized;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 21.
 * @Description :  동기화 작업, 같은 객체를 멀티쓰레드가 이용시 데이터의 무결성이 보장 되지 않는다
 * 					그럴때 사용하는게 동기화 작업이다.
 *
 */
public class ToiletEx {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();  //공유 객체
		
		Family father = new Family(toilet);
		father.setName("아빠");
		father.start();
		
		Family mother = new Family(toilet);
		mother.setName("엄마");
		mother.start();
		
		Family sister = new Family(toilet);
		sister.setName("누나");
		sister.start();
		
		Family brother = new Family(toilet);
		brother.setName("형");
		brother.start();
		
		Family me = new Family(toilet);
		me.setName("나");
		me.start();
	}
}
