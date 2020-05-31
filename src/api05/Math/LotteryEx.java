package api05.Math;

import java.util.Arrays;

public class LotteryEx {

	public static void main(String[] args) {
		
		while(true) {
			
			int[] selectNumber = new int[6];
			for(int i=0;i<selectNumber.length;i++) {
				selectNumber[i] = (int) (Math.random() * 45)	 + 1;
			}
			int[] machineNumber = new int[6];
			for(int i=0;i<machineNumber.length;i++) {
				machineNumber[i] = (int) (Math.random() * 45)	 + 1;
			}
			boolean result = Arrays.equals(selectNumber, machineNumber);
			if(result) {
				Arrays.sort(selectNumber);
				System.out.println(Arrays.toString(selectNumber));
				break;
			}
		}
	}

}
