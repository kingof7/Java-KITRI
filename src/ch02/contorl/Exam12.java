package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : 구구단을 입력받아서 출력(계속입력할지 체크, N 중지)
 */

import java.util.Scanner;
public class Exam12 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		do {
			System.out.println("구구단을 입력하세요:");
			int dan = sc.nextInt();
			
			for(int i=1;i<=9;i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			System.out.println();
			
			System.out.println("또할래? (중지 N)");
			String str=sc.next();
			ch=str.charAt(0);
		}while(ch !='N');
		
		System.out.println("종료");
		sc.close();
	}

}
