package ch03.array;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description : array2
 * 			 	    힙과 스택
 */
public class Exam14 {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5};
		int a = array[2];
		System.out.println(a);
		
		int[] b = array; //array의 값은 이미 주소다 그래서 그 주소를 b에도 넘겨주면서 스택에 생성된다
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");			
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] + "\t");
		}
		/*
		 * heap		     |		stack
		 *  1 0x300	     	0000 0001 0x100   array
		 *  2 0x304	     	3		          a
		 *  3 0x308		    0x300 	          array (주소를 값으로 갖는다.) - 이게왜 1바이트씩임? --힙영역의 주소를참조
		 *  4 0x312		    0x300 	          b	    (array에서 받았기 때문에 주소를 받음)
		 *  5 0x316		    0x300             c
		 */
		//stack영역의 변수가 모두 null값을 가질때, 힙을 참조하는 변수가 없으니 가비지컬렉터가 힙영역의 자원을 반환한다.
	
		array=null;
		b=null;
		
		
		{
			int value=20;
			System.out.println(value);
		}
	}

}
