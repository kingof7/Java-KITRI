package ch03.array;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : DS에서 heap의 데이터는 stack이 참조하고 있으면 소멸되지 않는다.
 * 				  stack은 블럭단위로 데이터가 생성, 소멸된다.
 */
public class Exam15 {

	public static void main(String[] args) {
		int su = 10;
	
		{ 
			int value=20;
			System.out.println(su);
			System.out.println(value);
		} // 이 블럭을 나가는순간 스택안에 있는 value값이 없어짐 (주체:블럭)
						
		System.out.println(su); //su는 살아있다
		//System.out.println(value); 메모리에서 없어져서 못씀 (스택은 블럭단위로 출입)
		
		//int su=20; 이미 존재하고 있기에 불가
		int value;
		
		//배열 선언 방법
		
		char[] a = new char[] {'A','B','C'};
		char[] b = new char[] {'A','B','C'};
		char[] c = {'A','B','C'};
		char[] d = new char[5];
		
		//char[] d = new char[]; ERROR : new char[5], 배열 공간의 크기를 정해야함
		
	}

}


