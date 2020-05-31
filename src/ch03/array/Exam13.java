package ch03.array;

import java.util.Scanner;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : array1
 * 				    변수는 한개의 데이터만 저장하지만, 배열은 같은 타입의 데이터를
 * 				    연속된 공간에 저장하므로 속도면에서 좋다.(주소가인접해서그런가?) 각 데이터는 인덱스를
 * 				    부여한다. 
 */
public class Exam13 {
	
	public static void main(String[] args) {
		
		char[] ch = new char[] {'A','B','C'}; //? 인스턴스화 시켜주면서 초기화 가능 (6byte)
		
		for(int i=0;i<3;i++) {
			System.out.print(ch[i]+ " ");
		}
		
		System.out.println(ch.length);
		
		int[] array = new int[] {1,2,3,4,5};
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	
		System.out.println();
		
		int[] b = new int[5];	//20byte
		int su;
		
		//System.out.println(su); ERROR : 초기화가 안되있으므로
		System.out.println(b[1]); //배열은 인스턴스화 될때, 모든 원소가 0으로 초기화되기에 가능
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			System.out.print("정수형 입력: ");
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++) 
			System.out.printf("a[%d] = %d, ", i, b[i]);
		
		
		sc.close();
	}
	
}
