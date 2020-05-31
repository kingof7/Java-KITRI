package algorithm.heapSpicier;

public class Test {

	public static int solution(int[] scoville, int K) {
		int i;
		int len = scoville.length;
		int answer = 0;
		int tmp1 = 9999, tmp2 = 9999;
		boolean flag = true;

		for (i = 0; i < len; i++) {
			if (scoville[i] < K) {
				flag = false;
				answer++;

				for (i = 0; i < len; i++)
					if (tmp1 > scoville[i])
						tmp1 = scoville[i];

				for (i = 0; i < len; i++)
					if (tmp2 > scoville[i] && tmp1 < scoville[i])
						tmp2 = scoville[i];

				int[] tmp = new int[len - 1]; // 1개 작은 tmp 배열 생성
				
				tmp[0] = tmp1 + 2*tmp2; // 1번째, 2번째 작은 값
				
				for (i = 1; i < tmp.length; i++) // 나머지 템프 공간에 스코빌 모두 대입
					tmp[i] = scoville[i + 1];
				solution(tmp, K);
			}
			else if(len == 1 && scoville[0] < K) {
				
				return -1;
			}
		}
		
		return answer+1;
		
	
	}

	public static void main(String[] args) {

		int scoville[] = { 0, 0, 0, 0, 0, 1 };
		int K = 5;
		int answer = solution(scoville, K);

		System.out.println(answer);

	}

}
