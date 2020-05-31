package thread01.Basic;

import javax.swing.JOptionPane;

/**
 * @author : 이종화
 * @date : 2020. 5. 20.
 * @description : 쓰레드 클래스를 상속받고 run 메서드를 오버라이딩 해야함
 */
public class InputThread extends Thread {
	
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("10초안에 값을 입력하세요");    //외부에서 받는 건 다 스트링타입
		
		if(input != null) {
			SubThread.inputCheck=true;			
			System.out.println("입력하신 값은 " + input + "입니다." );
		}
		
	}

}
