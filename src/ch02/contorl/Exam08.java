package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : 
 */
public class Exam08 {
	
	public static void main(String[] args) {

		//반복문은 초기, 증감, 조건값
		int i=1; //초기값
		while(i<=10) { //조건
			System.out.println("hello"+i);
			++i;
		}
		
		int hap = 0;
		i = 0;
		while(i<=10){
			hap +=i ;
			++i;
			
		}
		
		int j=1;
		do {
			System.out.println(j + " hahaha");
			++j;
		
		}while(j <= 10);
		
		hap=0;
		i=0;
		do {
			hap += i;
			++i;
		}while(i<=10);
		System.out.println("hap");
		

	}
	
}
