package algorithm;

import java.util.Scanner;

public class RGB거리 { //백준 1149 RGB거리
	
	static int[][] rgb = new int[1002][4];	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int temp = 1001;
		int tempj = 1001;
		int i, j;
		
		int answer = 0;
		
		int N = sc.nextInt();		
				
		for(i = 0;i < N;i++) {
			for(j = 0;j < 3;j++) {
				rgb[i][j] = sc.nextInt();
	
			}
		}				
		
		for(i = 0;i < N;i++) {
			for(j = 0;j < 3;j++) {
				if((temp > rgb[i][j]) && (tempj != j)) {
						temp = rgb[i][j];
						tempj = j;						
					}
				}
				answer += temp;
				temp = 1001;
			
			}					
		
		System.out.print(answer);
		
		
	}

}
