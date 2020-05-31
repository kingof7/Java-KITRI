package thread01.Basic;

public class Digit01 extends Thread{ //스레드를 사용하려면 상속받아야함
	public void run() {
		for(char i=1;i<=100;i++) {
			 System.out.print(i + "\t");
			 
			 if(i % 10 == 0) System.out.println();			 			 
		}		
		System.out.println(); //10의 배수마다 줄바꿈
	}
}
