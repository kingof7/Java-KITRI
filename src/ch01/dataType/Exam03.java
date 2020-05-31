package ch01.dataType;

/**
 * @author : 이종화
 * @date : 2020. 4. 27.
 * @description : 단항 연산자
 */
public class Exam03 {
	
	public static void main(String[] args) {
		int x = 10;
		++x;
		x++;
		System.out.println(x);
		
		--x;
		x--;
		System.out.println(x);
		
		int y = 10;
		int z = ++y;
		System.out.println(x + "\t" + z);
	
		int a=10;
		int b=a++; 
		//10을 b에 던져주고 a가 11이된다
		System.out.println(a + " " + b);
	
	}

}
