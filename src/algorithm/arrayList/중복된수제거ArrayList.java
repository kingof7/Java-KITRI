package algorithm;

import java.util.ArrayList;

public class 중복된수제거ArrayList {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 10, 10 };
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
			System.out.println();
				
		System.out.print(arr[0]+" ");
		for (int i = 1; i < arr.length; i++) {
			for(int j = 0; j<i;j++) {
				if(arr[i] == arr[j])
					break;
				else if (j == i - 1) // j == i 면 그냥빠져나오니까 그전에 출력해주기
					temp.add(arr[i]);
					
			}
		
		}
		
		for(int e : temp)
			System.out.print(e + " ");

	}

}
