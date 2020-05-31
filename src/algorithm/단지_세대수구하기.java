package algorithm;

import java.util.Scanner;

public class 단지_세대수구하기 {
	static int[][] a = new int[5][5]; // 입력 배열
	static int[][] d = new int[5][5]; // 저장할 배열

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		int se = 0;

		System.out.println("5x5 행렬을 입력하시오(0 또는 1만)");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		/*
		 * d[0][0] = a[0][0]; d[0][1] = a[0][1]; d[0][2] = a[0][2]; d[0][3] = a[0][3];
		 * d[0][4] = a[0][4]; for (int i = 1; i < 5; i++) { for (int j = 0; j < 5; j++)
		 * {
		 * 
		 * } }
		 */
		if(a[0][0] == a[0][1])
			dan++;
		for(int i = 1;i<1;i++) {
			if(a[0][i] == a[0][i+1])
				continue;
			else
				dan++;
		}
			
	}

}
