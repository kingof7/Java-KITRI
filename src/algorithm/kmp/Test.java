package algorithm.kmp;

import java.util.Scanner;

public class Test {

	static void KMP(int[] table, String parent, String pattern) {
			
		
		for(int i = 0, j = 0; i < parent.length();i++) {
			
			while(j > 0 && parent.charAt(i) != pattern.charAt(j)) {
				j = table[j - 1];
				
			}
			
			if(parent.charAt(i) == pattern.charAt(j)) {
				if(j == pattern.length() - 1) { // all matched
					System.out.printf("At %d, we found it", i - pattern.length() + 2);
					System.out.println();
					j = table[j]; //jump -> aba--aba, from c, we could compare, so j=3
				}
				else
					j++; // Not all matched
			}
			
			
		}	
		
	}
	
	static void PatternOutput(int[] table, String pattern) {
					
		for(int i = 1, j = 0; i<pattern.length();i++) {
			while(j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
				j = table[j - 1];
			}
			if(pattern.charAt(i) == pattern.charAt(j)) {
				table[i] = ++j;
			}
				
				
			}
		
			for(int i = 0;i<table.length;i++)
					System.out.printf("%d ", table[i]);
			System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
	
		
		String parent = "ababacabacaabacaaba";
		String pattern = "abacaaba";
		int[] table = new int[pattern.length()];
		
		PatternOutput(table, pattern);
		KMP(table, parent, pattern);
		
			
		}
	
			
}

