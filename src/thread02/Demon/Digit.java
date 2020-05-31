package thread02.Demon;

public class Digit extends Thread{ //스레드를 사용하려면 상속받아야함
	public void run() {
		System.out.println(getName());
		
		for(char i=1;i<=50;i++) {
			 System.out.print(i + "\t");
			 
			 try {
				 sleep(1000);				 
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 }	 			 
		}		
		System.out.println(); //10의 배수마다 줄바꿈
	}
}
