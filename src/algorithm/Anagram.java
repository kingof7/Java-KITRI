package algorithm;	  

	public class Anagram { 

	    private final int SUM_COUNT = 5;


	    public void findIdxSum() {
     
		/*
		 * * [ 입력 ]
		 * 
		 * seq : ACTGCGCATCGCAAG
		 * 
		 * QUALSE : 001204556452100
		 *
		 * 
		 * 
		 * [ 출력 ]
		 * 
		 * max_idx : 6
		 * 
		 * > 5 5 6 4 5
		 * 
		 * > CATCG
		 */     

	        String seq = "CAGTCATCGTACGATTCATGCAACTGTCAG";

	        int[] quals = {0,1,0,3,4,1,5,9,7,7,8,4,10,9,4,3,5,7,8,9,3,11,10,3,1,7,1,0,12,0};
 
	        int max_idx = 0;
 
	        try {
 
	            if (seq.length() > SUM_COUNT) {

 
	                int intval = seq.length() - SUM_COUNT; //25

	                int sum_arr[] = new int[intval + 1]; //26

	                int sum[] = new int[intval + 1]; //26
 

	                int max_sum = 0;

	                sum_arr[0] = 0;

	                sum[0] = 0;
                

	                for (int i = 0; i < intval; i++) { //i = 0~25

	                    for(int j = i ; j < i + 5 ; j++) {

	                    	sum[i] += quals[j]; //5개 원소를 순차적으로 누적	                    	

	                    }

	                    	//System.out.print(sum[i] + " ");

	                	    sum_arr[i] = sum[i]; //원소합 입력

	                	    //System.out.print(sum_arr[i] + " ");

	           	    }

	                
	                max_sum = sum_arr[0];

	                
	                for(int i = 0 ; i < intval ; i++) // i = 0~24

	                	if(sum_arr[i] < sum_arr[i+1] && max_sum < sum_arr[i+1]) {

	                		max_sum = sum_arr[i+1];

	                		max_idx = i+1;

	                	}                    	                
             	                                

	                seq = seq.substring(max_idx, SUM_COUNT + max_idx);
      

	                System.out.println("max_idx : "+ max_idx);

 
	                System.out.printf("> ");

	                for(int j = max_idx; j < max_idx+SUM_COUNT; j++){

	                    System.out.printf(quals[j]+" ");

	                }

	                System.out.println("");

 	                System.out.println("> "+seq);

 	            }

 
	        } catch (Exception e) {

	            e.printStackTrace();

	        }

	    }
 

	    public static void main(String[] args) {
 
	        Anagram sol = new Anagram();
 
	        sol.findIdxSum();
 
	    }
 	   
	} 