package test;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,8,5,6,7,9};
		int temp = 0;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
