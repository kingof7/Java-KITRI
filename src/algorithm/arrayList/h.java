package arrayList;

import java.util.ArrayList;

public class h {
	//dayList는 배열이다 
	public static void main(String[] args) {
		int[] a = new int[4]; //단점: 뒤에 값을 무조건 줘야함 즉, 크기가 정해져있어서
	//그래서 dayList가 나옴
	//dayList<클래스> 객체명 = new dayList<클래스>(); -->인스턴스화

		ArrayList<Integer> d = new ArrayList<>();
		d.add(1);	//index 0
		d.add(100); //index 1
		d.add(51); //index 2
		System.out.println("배열의 사이즈는="+d.size());
		for(int e : d)
			System.out.println(e);
		d.set(1, 120); //인덱스 1에 있는 값을 120으로 수정하겠다
		for(int e : d)
			System.out.println(e);
		d.remove(2); // 인덱스 2에있는 값 제거
		//d.remove(3) 하면 에러남 ( 인덱스 초과 )
		for(int e : d) // foreach의 메모리할당 방법이 어떻게 되지?
			System.out.println(e);
		d.clear();
		for(int e : d) 
			System.out.println("e");
		
			System.out.println("null");
			
		
	}

}
//dayList는 저장공간을 따로 줄 필요가 없다. 내가 쓰는 만큼 알아서 저장공간이 생긴다.
//배열은 무조건 저장공간을 선언하고 사용해야된다

