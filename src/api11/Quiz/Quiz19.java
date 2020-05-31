package api11.Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		HashSet<String> set = new HashSet<String>();	
		System.out.println();
		
		System.out.print("좋아하는 커피를 3가지 입력하세요: ");
		set.add(sc.next());
		System.out.print("좋아하는 커피를 3가지 입력하세요: ");
		set.add(sc.next());
		System.out.print("좋아하는 커피를 3가지 입력하세요: ");
		set.add(sc.next());
		
		System.out.println("입력하신 커피는: " + set.size());
				
		System.out.println();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) 
			System.out.println(i.next() + "\t");
	

	}
}
