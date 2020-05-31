package api05.Math;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		System.out.println("절대값: " + Math.abs(-10));
		System.out.println("최대값: " + Math.max(10, 30));
		System.out.println("최소값: " + Math.min(1.5, 1.3));
		System.out.println("2의 3승: " + Math.pow(2, 3));
		
		int r = (int) (Math.random() * 10); // 0~10
		System.out.println("0~1: " + r + "\n\n");
		
		String[] array = new String[] 
				{"김경은", "지명관", "최정윤", "최경민", "임정민", "유승아", "진영수"};
		int index = (int) (Math.random() * array.length);	// 0~length
		System.out.println("사다리: " + array[index] + "\n\n");
		
		int num = (int) (Math.random() * 6) + 1; // 1~6
		System.out.println("주사위 눈: " + num);
		
		// 1~45 6개
		int[] selectNumber = new int[6];
		for(int i =0;i<selectNumber.length;i++) {
			selectNumber[i] = (int) (Math.random() * 45) + 1;
		}
		for(int i=0;i<selectNumber.length;i++) {
			System.out.println(selectNumber[i] + "\t");
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
		
	}
	
}
