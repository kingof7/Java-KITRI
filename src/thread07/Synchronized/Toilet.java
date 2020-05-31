package thread07.Synchronized;

public class Toilet { 		// 공유 클래스
	
	public void openDoor(String name) {	// 임의 영역, 단 하나의 쓰레드만 사용가능하다.
		
		synchronized (this) {			// 동기화 블럭. 하나의 쓰레드가 이 블럭을 쓸 때까지 다른 쓰레드는 기다린다.
			System.out.println(name + " 입장");
			for (int i=0; i<100000; i++) {
				if (i > 1000 && i < 1010) System.out.println(name + " ~ 끄응 시원하다");
			}
			System.out.println(name + " 퇴장 \n");
		}								 
	}
}
