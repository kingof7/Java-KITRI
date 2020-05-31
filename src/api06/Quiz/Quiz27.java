package api06.Quiz;

import java.util.Scanner;
//import java.lang.Integer;

public class Quiz27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		String a = sc.next();
		System.out.print("수를 입력하세요:");
		String b = sc.next();	
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.print("sum:"+ sum);
	}

}
