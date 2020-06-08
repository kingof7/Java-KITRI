package codingTest;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args){
		String str1 = "abcd";
		String str2 = "AbCd";
		
		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		String str1_ = String.valueOf(char1);
		String str2_ = String.valueOf(char2);
	
		
		if(str1_.equals(str2_))
			System.out.println("아나그램");
		else
			System.out.println("아나그램 x");
		
		
	}
}