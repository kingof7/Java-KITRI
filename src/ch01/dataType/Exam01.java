package ch01.dataType;

//preference - code templates - types
//shift + alt + j
/**
 * @author : 이종화
 * @date : 2020. 4. 27.
 * @description : 자바 자료형 
 */

public class Exam01 {

	public static void main(String[] args) {
		//#include <stdio.h> --> System.out.print (stdinput = 키보드 , stdout = 화면)
		//char = 1byte --> char = 2byte
		//char *p --> String p
		
		System.out.println("안녕하세요");
		System.out.println("ㅎㅎㅎ");
		System.out.print("호호호");
		System.out.println("월요일\n\n");
		System.out.println("화요일\t수요일\n");
		
		//숫자(정수,실수)
		//정수 - byte, short, int, long
		byte a = 10;	//? byte = 1byte -128~127
		short b = 129;	//short = 2byte -32768 ~ 32767
		int c = 1000;	//int = 4byte -2147483648 ~ 2147483647
		long d = 6580L; //long = 8byte -2^63 ~ 2^63 - 1 
		//최소 표현 단위 = 1byte = 8bit
		//1byte 표현수 = -128 ~ 127 (-2^7 ~ 2^7-1)
		//실수 - float, double
		//? 자바의 메모리주소는 해쉬코드라서 찍어볼수가없다
		//? int c = -10; //메모리공간 | 1111 1111	| 1111 1111 | 1111 1111	| 0000 1010 | <---1111는 부호비트
		
		
		System.out.println("a:"+ a); //? 실행시에만 RAM에올라갔다가 종료되면 하드로 다시내려옴
		System.out.println("b:"+ b);
		System.out.println("c:"+ c);
		System.out.println("d:"+ d);
		System.out.println("\n");

		
		//실수 - float, double
		//? float형은 f가 들어가야함
		float e = 45.5f;	//4byte 1.4 E-45 ~ 3.408 E38
		double f = 123.40;	//8byte 4.92 E-324 ~ 1.8 E308
		
		System.out.println("e: "+ e);
		System.out.println("f: "+ f);

		//문자(문자,문자열)
		char ch = 'A'; // 아스키코드값    |	|A		| ch --> |0100|0000| ?(A-> 65(0100 0001), a->97)
		char h = '가'; //  문자셋            |	|가		| h  --? |
					  // 가 - UTF-8 문자셋
		System.out.println("g:"+ ch);
		System.out.println("h:"+ h);

		//문자열 (2byte 이상 참조형 자료형) 무한참조형(값이아닌 주소를 참조) - 마지막 널값포함
		String str1 = "Hello java";  // 10byte
		String str2 = "안녕하세요. 자바"; // 14+2(. )=16byte
		String str3 = "how are you"; // 11byte
		
		/*
		 * String a = "sksksksk"; String b = a; //? a의 값이아닌 a의 주소값을 공유함(문자가 메모리를 많이차지하기
		 * 때문에)
		 */
		
		//String은 int, char 와 다르게 자료형이라기 보다는 클래스다
		//String a는 스택영역, new String("hi")는 힙영역
		//
		
		String str4 = "Hello java"; //스택 영역
		if(str1 == str4) //주소가 같니? ->주소가 달라도  str4와 같은 값을 찾는다->str1의 시작주소를 공유
			System.out.println("T"); //? T가 나옴 str1과 str4가 같은 시작주소를 공유하므로
		else
			System.out.println("F");
		
		if(str1.equals(str4)) //값이 같니?
			System.out.println("T"); // 값이 같으므로
		else
			System.out.println("F");
		
		
		String aa = new String("hi"); //스택영역 = 힙 영역(인스턴스화) -->힙영역은 100% 참조(주소)
		String bb = new String("hi"); //힙에 서로다른 공간이 할당 됨
		if(aa==bb) //주소가 같니?
			System.out.println("T");
		else
			System.out.println("F"); //? F가 나옴 aa와 bb의 주소가 다르므로
		
		
		if(aa.equals(bb))
			System.out.println("T"); //aa와 bb안에 있는 값을 비교함
		else
			System.out.println("F");
		
		//|		H|		e|		l|		l|		o|		|		j|		a|		v|		a|	 \0|
		
		
		//논리형 자료형 T(1),F(0) 1byte
		
		boolean b1 = true;
		boolean c1 = false;
		if(c1)
			System.out.println(b1);
		else
			System.out.println(c1);
		
		
		
		
	}

}
