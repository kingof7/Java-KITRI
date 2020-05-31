package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : 조건문 switch~case
 */
public class Exam06 {

	public static void main(String[] args) {
		
		int su = 2;
		
		switch(su) { //정수형, 문자형
		case 1:
			System.out.println("hi");
			break;
		case 2:
			System.out.println("su is 2");
			break;
		case 3:
			System.out.println("hello man");
			break;
		default :
			System.out.println("기타등등 그외");
		}
		
		char a='B';
		
		switch(a) { 	//if(a='W' || a='w') {System.out.println("White");}
		case 'W': case 'w':
			System.out.println("White");
			break;
		case 'Y': case 'y':
			System.out.println("Yellow");
			break;
		
		case 'B' : case 'b':
			System.out.println("Blue");
			break;
		case 'R' : case 'r':
			System.out.println("Red");
			break;
		}
		
		
		
		//if문은 조건에 맞으면 해당블럭만 실행
		//switch문은 조건에 맞는 블럭부터 쭉 실행 --> 그래서 break; 써줘야함

	}

}
