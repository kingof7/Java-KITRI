package ch02.contorl;

import java.util.Scanner;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : Scanner
 */
public class Exam11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // System.in = standard input(키보드)
		System.out.println("문자열입력:"); //한글입력시 커서이동필요
		String a = sc.next();		
		System.out.println(a);
		 
		
		System.out.println("정수입력:");
		int x = sc.nextInt();
		System.out.println("x:" + ++x);
		
		System.out.println("실수입력:");
		float y = sc.nextFloat();
		System.out.println("y:" + ++y);
		
		System.out.println("문자입력:");
		String str = sc.next();
		char ch = str.charAt(0);
		
		sc.close();
		
	}

}
