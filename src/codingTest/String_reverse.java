package codingTest;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		System.out.print("문자열을 입력해주세요 히힛: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = "";
		String str3 = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
			str2 += str1.charAt(i);			
		}
		str3 += str1;
		System.out.println("거꾸로!: "+str2);
		System.out.println(str3);
	}

}
