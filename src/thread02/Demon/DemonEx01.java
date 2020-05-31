package thread02.Demon;

public class DemonEx01 {	
		
	public static void main(String[] args) {
		
		Alphabet alpha = new Alphabet();
		alpha.setName("알파벳 쓰레드");
		alpha.setDaemon(true); 	// 종속 쓰레드 (메인 끝나면 같이 끝난다)
		alpha.start();
		
		Digit digit = new Digit();
		digit.setName("디지털 쓰레드");
		digit.setDaemon(true);     // 종속 쓰레드 (메인 끝나면 같이 끝난다)
		digit.start();
		
		for(char i=65;i<=70;i++) {
			 System.out.print(i + "\t");
			 
			 try {
				 Thread.sleep(1000);				 
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 }	 			 
		}		

	}

}
