package algorithm.heapsort;

public class Test {

	static void maxHeap(int[] heap, int number) {
		
	//먼저 전체 트리 구조를 최대 힙 구조로 바꿉니다 (루트가 가장 큰)
		//for문으로 아래서부터 시작했다가 while문으로 다시 쭉쭉 올라가면서 최대힙 만듬
		for(int i = 1; i < number ; i++) {
			int c = i;
			while(c > 0) {
				int root = (c - 1) / 2;
				if(heap[root] < heap[c]) {
					int tmp = heap[root];
					heap[root] = heap[c];
					heap[c] = tmp;
				}
				c = root; //자식이 부모로 이동(위로올라감)
			}
		}
	}
	

	static void heapifySort(int[] heap, int number) {
		
		//노드 크기를 줄여가며 반복적으로 힙을 구성
			for(int i = number - 1; i >= 0; i--) {
				int tmp = heap[0];
				heap[0] = heap[i];
				heap[i] = tmp; // 마지막 노드와 첫번째 노드(MAX값)를 교환
			
				maxHeap(heap, i); // 다시 최대힙 구성, i가 줄어들테니, 마지막노드를 제외하고 계속돌림
			}
				
				for(int i = 0;i < heap.length;i++) {
					System.out.printf("%d ", heap[i]);
				}
		
	}
			
	public static void main(String[] args) {
		int number = 9;
		int heap[] = {10,6,7,8,3,5,9,1,6};
		
		maxHeap(heap, number);
		heapifySort(heap, number);
				
	}

}
