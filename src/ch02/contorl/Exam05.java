package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : 제어문 - 조건문(if, if~else, if~else if, switch~case)
 * 						반복문(for, 다중 for, while, do~while)
 */
public class Exam05 {

	//디버깅 하는법
	//라인 왼쪽 더블클릭해서 시작점 만들기
	//Debug as -> java application 실행 -> F6으로실행 -> F8종료 후 XX버튼 누름
	public static void main(String[] args) {
		int x=20;
		
		if(x>10) {
			System.out.println("10보다 큰 수 입니다.");
		}
		
		int y = 30;
		if(y>0 && y<100) {
			y+=200;
		}
		else {
			y*=200;
		}
		System.out.println("y:" + y);

		int score=90;
		if(score>=90) {
			System.out.println("A등급");
		}
		else if(score >= 90) {
			System.out.println("B등급");

		}
		else if(score >= 70) {
			System.out.println("C등급");
		}
		else
			System.out.println("F등급");
		
		System.out.println();
		
		String grade="";
		
		if(score >= 90) { //96
			if(score>=97) {
				grade="A+";
			}
			else if(score>=94) {
				grade="A0";
			}
			else if(score>=90) {
				grade="A-";
			}
		}
		else if(score >= 80) {
			if(score>=87) {
				grade="B+";
			}
			else if(score>=84) {
				grade="B0";
			}
			else if(score>=80) {
				grade="B-";
			}			
		}
		
	}
	
}
