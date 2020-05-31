package thread02.Demon;

public class Alphabet extends Thread{
	
	public void run() {		//call back 함수
		System.out.println(getName());
		
		for(char i='A';i<='Z';i++) {
			 System.out.print(i + "\t");
			 
			 try {
				 sleep(1000);				 
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
			 			 
		}		
		System.out.println();
	}
}
