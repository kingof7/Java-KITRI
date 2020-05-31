package algorithm;

import java.util.ArrayList;

public class 중복된수제거 {

	public static void main(String[] args) {
		
		/*
		 * int inArr[] = new int[101]; inArr[0] = 1; inArr[1] = 2; inArr[2] = 3;
		 * inArr[3] = 1; inArr[4] = 1; inArr[5] = 2; inArr[6] = 3; inArr[7] = 4;
		 * inArr[8] = 5; inArr[9] = 5; inArr[10] = 7; inArr[11] = 15;
		 */
		
		/*boolean arr[] = new boolean[101];
		 * int inArr[] = {1,2,3,1,1,2,3,4,5,5,7,15};
		 * 
		 * for(int i = 0; i<inArr.length;i++) { arr[inArr[i]] = true; //한번이라도 나왔으면 true를
		 * 부여 }
		 * 
		 * for(int i = 0; i<arr.length;i++) { 
		 * if(arr[i]) // arr배열 안에 true 값만 골라서
		 * System.out.print(i+" "); //arr배열의 인덱스를 출력하는 개념ㄴ }
		 */
		
		int inArr[] = {1,2,3,1,1,4,5,6,6,7};
		boolean[] arr = new boolean[101];

		for(int i = 0; i < inArr.length ; i++){
			arr[inArr[i]] = true;	

		}

		for(int i = 0; i <arr.length ; i++){
			if(arr[i]) //true인 경우만
				System.out.print(i + " "); //인덱스 출력
		}
		
		
		
		
		
	
	}

}


/* 나의 풀이
 * int arr[] = { 1, 2, 3, 1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 10, 10 };
 * 
 * for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
			System.out.println();
				
		System.out.print(arr[0]+" ");
		for (int i = 1; i < arr.length; i++) {
			for(int j = 0; j<i;j++) {
				if(arr[i] == arr[j])
					break;
				else if (j == i - 1) // j == i 면 그냥빠져나오니까 그전에 출력해주기
					System.out.print(arr[i] + " ");
			}
		
		}
		

1출력
2 : 0부터 전까지 모두비교
if 이전값과 같다면 무시
else if 아니라면 출력

반복


3 = 0부터 3이전까지 비교

*/
