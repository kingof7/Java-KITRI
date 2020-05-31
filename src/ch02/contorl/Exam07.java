package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : 반복문
 */
public class Exam07 {

	public static void main(String[] args) { // 내용반복
		for (int i = 1; i < 10; i++) {
			System.out.println("How are you?");
		}

		for (int i = 1; i <= 10; i++) { // 수치반복
			System.out.print(i + "\t");
		}

		// 레코드단위 while, do while
		// while은 screensaver (행위반복)

		/*
		 * for(int i=0;;i++) { System.out.print(i+ " "); if(i == 15) break; }
		 */
		System.out.println();

		for (int i = 10; i >= 0; i -= 3) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

		System.out.println();

		int hap = 0;
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}

		System.out.println(hap);
		
		//심화개념 ?
		//배열 : 인덱스에 값을 담아준다
		//ArrayList : 객체를 담아준다
		//배열의 문제점 : 크기가 변하지 않는다. 정적할당 --> 해결: 링크드리스트 (다중포인터에서 발전한 것) 
		//다중 포인터 : 1 -> 2 <- 3 // 2삭제 1->3
		//객체지향의 핵심, 자바의 최소단위 : 레코드가 단위
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i + " " + j);
			}
			System.out.println();
		}
	}

}
