package codingTest;

import java.util.Scanner;

public class GCD {
	static int a, b;		
		 
	public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);
		        a = scan.nextInt();
		        b = scan.nextInt();
		        if (b > a) {
		            int temp = b;
		            b = a;
		            a = temp;
		        }
		        int result = gcd(a, b);
		        System.out.println(result);
		        System.out.println(a * b / result);
		    }	 
		

	private static int gcd(int a, int b) {
		   if (a % b == 0)
	            return b;
		   
	       return gcd(b, a % b);	
	}
		
}

