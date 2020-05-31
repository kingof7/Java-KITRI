package thread01.Basic;

public class Alphabet01 extends Thread{
	public void run() {		//call back 함수
		for(char i='A';i<='z';i++) {
			 System.out.print(i + "\t");
			 
			 if(i == 'Z') System.out.println();
			 			 
		}		
		System.out.println();
	}
}
