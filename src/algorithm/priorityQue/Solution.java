package algorithm.priorityQue;

import java.util.PriorityQueue;

class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int e : scoville) { //e라는 새로운 변수를 이용해서 큐안에 스코빌 배열의 값들을 모두 넣는다.
            heap.add(e); //heap.offer도 가능
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) { //큐안에 데이터가 한개뿐이고, K보다 작으면
                return -1; // 큐안에 모든 원소가 K보다 클 수없기에 -1반환
            }
            int a = heap.poll(); //가장 작은값
            int b = heap.poll(); //그다음 작은값


            int result = a + (b * 2);

            heap.add(result); //다시 큐에 넣어줌
            answer ++; // 반복횟수 증가 
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	int scoville[] = {0,0,0,0,0,1};
    	int K = 7;
    	int answer = solution(scoville, K);
    	System.out.print(answer);
    }
}


