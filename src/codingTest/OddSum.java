package codingTest;

public class OddSum {

	public static void main(String[] args) {
		//1~100까지 수 중에 3의 배수만 빼고 다더하시오
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		//1~100까지의 합
		for(int i=1;i<=100;i++)
			sum1 += i;
		System.out.println("1~100까지의 합: "+sum1);
		
		
		//3의 배수만 합
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("3의 배수만 합: " + sum2);
		
		//3의 배수를 제외하고 합
		for(int i=1;i<=100;i++) {
			if(i % 3 != 0) {
				sum3 += i;
			}			
		}
		System.out.println("3의 배수만빼고 1~100합: "+sum3);
		
		if((sum1 - sum2) == sum3)
			System.out.println("모두 맞다.");
	}

}
