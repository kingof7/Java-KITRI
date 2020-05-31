package algorithm.mergeSort;

public class Test {

	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);
	}
	
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start<end) { //시작이 끝보다 작은경우에만 재귀호출
			int mid = (start + end) / 2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid+1, end);
			merge(arr,tmp,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		//순서에 맞게 병합해주는 함수
		for(int i = start;i<=end;i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		while(part1<=mid && part2<=end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}
			else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for(int i = 0; i<=mid - part1;i++) { //앞쪽 배열에 데이터가 남은경우
			arr[index + i] = tmp[part1 + i]; //part1은 올라간상태에서 안넣어졌으니까 이렇게써줌
		}
		//뒤쪽배열 데이터 남는 건 신경 x
		
		
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.printf(data + ", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}

}
