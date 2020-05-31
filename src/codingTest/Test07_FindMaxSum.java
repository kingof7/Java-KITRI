package codingTest;	 

	public class Test07_FindMaxSum {

	    private final int TRIM_STD = 5;

	    public void findMaxSum() {


	        /**
	         * 문제 설명
	         *
	         * 길이가 30인 sequence 문자열에서 수치의 합이 가장 높은 5개 연속 구간을 찾는 문제입니다.
	         * 배열 quals 는 순서대로 sequence 각 문자의 수치를 나타냅니다.
	         * quals 에서 연속된 5개 합이 가장 높은 구간의 시작 index를 찾으세요.
	         *
	         * 시작 index 를 찾으면 해당하는 구간이 자동으로 출력됩니다.
	         *
	         * 예시 :
	         *
	         * [ 입력 ]
	         * SEQUENCE : ACACTGTACGCAGTA
	         * QUALSE   : 001204556452100
	         *
	         * [ 출력 ]
	         * max_sum_idx : 6
	         * > 5 5 6 4 5
	         * > TACGC
	         *
	         */

	        String sequence = "ACAGCATCGTACTGTCGATGCAGTCGTCAG";
	        int[] quals = {0,0,0,3,4,1,5,9,9,7,8,4,12,9,4,3,5,7,8,9,3,3,3,3,1,0,1,0,0,0};

	        int max_sum_idx = 0;

	        try {

	            if (sequence.length() > TRIM_STD) {

	                int interval = sequence.length() - TRIM_STD; //25
	                int diff[] = new int[interval + 1]; //26
	                int diff_sum[] = new int[interval + 1]; //26

	                int max_diff = 0;

	                diff[0] = 0;
	                diff_sum[0] = 0;
	                
	                /**
                     * 문제 풀이
                     * TODO: 아래에 코드를 작성하여 max_sum_idx를 찾으면 정답이 출력됩니다.
                     */

	                for (int i = 0; i < interval; i++) { //i = 0~25
	                    for(int j = i ; j < i + 5 ; j++) {
	                    	diff_sum[i] += quals[j]; //5개 원소를 순차적으로 누적	                    	
	                    }
	                    	System.out.println(diff_sum[i]);
	                	    diff[i] = diff_sum[i]; //원소합 입력
	                	    System.out.println(diff[i]);
	           	    }
	                
	                max_diff = diff[0];
	                
	                for(int i = 0 ; i < interval ; i++) // i = 0~24
	                	if(diff[i] < diff[i+1] && max_diff < diff[i+1]) {
	                		max_diff = diff[i+1];
	                		max_sum_idx = i+1;
	                	}
	                	             	                
	 
	                /**
	                 * 정답 출력
	                 */            
	                	                
	                // Max 값 인덱스에서 TRIM_STD 길이만큼 substring
	                sequence = sequence.substring(max_sum_idx, TRIM_STD + max_sum_idx);

	                // Max 값이 시작되는 인덱스
	                System.out.println("max_sum_idx : "+max_sum_idx);

	                // Max 값 구간
	                System.out.printf("> ");
	                for(int j = max_sum_idx; j < max_sum_idx+TRIM_STD; j++){
	                    System.out.printf(quals[j]+" ");
	                }
	                System.out.println("");

	                // Max 값 구간으로 substring 한 sequence
	                System.out.println("> "+sequence);

	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {

	        Test07_FindMaxSum sol = new Test07_FindMaxSum();

	        sol.findMaxSum();

	    }

	   
	} 

	 
