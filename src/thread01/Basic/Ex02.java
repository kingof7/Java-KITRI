package thread01.Basic;

/**
 * @author : 이종화
 * @date : 2020. 5. 20.
 * @description : 멀티스레드의 예시: 워드 작업 중 저장, 네이트온에서 채팅하면서 음악듣기, 10초안에 입력없으면 창 종료 등등..
 */
public class Ex02 {
	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.start();
		
		InputThread it = new InputThread();
		it.start();		
		
	}
}
