package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : while, do~while
 */
public class Exam10 {
	

	public static void main(String[] args) {
		
		int i = 0;
		
		/* ? Infinite Loop
		 * while(i<=10) {
		 * 
		 * if(i==5) continue;
		 * 
		 * System.out.println(i); ++i; }
		 */
		
		while(i<=10) {
			++i;
			if(i==5)
				continue;
			
			System.out.println(i);
			
		}
		System.out.println();
		
		int j = 0;
		
		while(j<=10) {
			++j;
			if(j==5) continue;
			
			System.out.println(j);
		}
		
		System.out.println();
		int k=0;
		do {
			++k;
			
			if(k==5) continue;			
			System.out.println(k);
		}while(k<=10);

	}

}
