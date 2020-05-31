package api03.String;

import java.util.Date;
import java.util.Scanner;

/**
 * @author : 이종화
 * @date : 2020. 5. 12.
 * @description : 
 */
public class String02 {
	
	public static void main(String[] args) {
		
		String a = "apple";
		String b = "Apple";
		System.out.println("대소문자구분 " + a.equals(b));
		System.out.println("대소문자구분안함 " + a.equalsIgnoreCase(b));
		
		String subject = "Java Programming";
		System.out.println("소문자: " + subject.toLowerCase());
		System.out.println("대문자: " + subject.toUpperCase());
		System.out.println("과목명: " + subject);
		System.out.println();
		
		String oldStr = "자바는 객체지향적 언어입니다.";	
		String newStr = oldStr.replace("자바", "JAVA"); //문자열 치환		
		System.out.println("문자열 치환: " + newStr);
		System.out.println("원본 데이터: " + oldStr);
		
		String str = "How are you?";		
		System.out.println("문자열 잘라내기: " + str.substring(2));
		System.out.println("문자열 잘라내기: " + str.substring(2, 9)); //2~8까지
		
		String t = "			자바			프로그램			";
		System.out.println("앞뒤 공백문자 제거: " + t.trim());
		System.out.println();
		
		// 문자 --> 숫자, 날짜
		String value = "10";
		
		Scanner sc = new Scanner(value);
		System.out.println(sc.next());
		sc.close();
		
		Scanner sc2 = new Scanner(value);
		int r = sc2.nextInt();
		System.out.println(++r);
		sc2.close();
		
		int x = Integer.parseInt(value);
		System.out.println(++x);
		
		byte y = Byte.parseByte(value);
		Double.parseDouble(value);
		
	
		
		System.out.println(++x);
		System.out.println(--x);

		
		// 숫자 --> 문자로, 날짜 --> 문자로 : String.valueOf()
		//단, 클래스를 문자열로 바꿔주는 함수 : toString()
		System.out.println("기본타입 자료형은 문자열로 변환");
		
		String ivar = String.valueOf(10);
		String fvar = String.valueOf(24.5f);
		String bvar = String.valueOf(true);
	
		System.out.println(ivar + "\t" + fvar + "\t" + bvar);
		
		Date date = new Date()	;
		System.out.println(date.toString());
		System.out.println(date);  // Date클래스안에 toString() 찾음
		
		//**? 기본 자료형을 문자열로 바꿔주는 함수 : valueOf()
		//모든 자바 API는 toString()이 구현되어있다
		//그러나 내가 만든 코딩에서는 toString()을 오버라이딩 해줘야 객체가 toString()을 찾는다.
		
		// 숫자, 날짜 --> 문자
		
		System.out.println(Integer.parseInt(value));
	
	}
}
