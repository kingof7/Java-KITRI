package ch01.dataType;

/**
 * @author : 이종화
 * @date : 2020. 4. 27.
 * @description : 3) 산술연산자 : * % + - 
 * 				  4) 시프트 연산자 : << >> >>>
 * 				  5) 비교연산자 : < > <= >= == !=              
 *                6) 논리연산자 : & ^ | && ||
 *                7) 삼항연산자 : 조건식 ? 참 : 거짓
 *                8) 대입연산자 : = *= /= %= += &= ^= ...

 */
public class Exam04 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int sum = x + y;
		int cha = x - y;
		int mul = x * y;
		float div = (float) x / y; // 10.0/20
		int rest = x % 3;

		System.out.println("합" + sum);
		System.out.println("차" + cha);
		System.out.println("곱" + mul);
		System.out.println("나누기" + div);
		System.out.println("나머지" + rest + "\n\n");
		
		int a = 10;
		int b = 20;
		
		boolean c = a > b;
		boolean d = a < b;
		boolean e = a >= b;
		boolean f = a <= b;
		boolean g = a == b;
		boolean h = a != b;
		System.out.println("관계연산자");
		System.out.println(c + "\t" + d + "\t" + e);
		System.out.println(f + "\t" + g + "\t" + h);

		byte i = 10;
		byte j = 2;
		
		//?
		//0000 1010 & 0000 0010 = 0000 0010 (둘 다 참일때만 참)
		//-----------------------
		//0000 1000 ^: 8 //다르면 1 같으면 0 (XOR)
		//0000 1010 |: 10
		//0000 0010 &: 2
		
		System.out.println("논리연산자");
		System.out.println("i & j:" + (i&j));
		System.out.println("i | j:" + (i|j));
		System.out.println("i ^ j:" + (i^j) + "\n\n");


		int su = 15;
		boolean r=su > 10 && su < 20; // <> -> && -> = 
		boolean rr=su==10 || su==15;
		System.out.println("&: " + r); 
		System.out.println("|: " + rr);

		int q=10;
		int w=20;
		// ?
		int value = (q!=w) ? q : w;
		System.out.println("삼항연산자");
		System.out.println();
		System.out.println(value);
		System.out.println(q==30?"참":"거짓");
		System.out.println("\n\n");
		
		q += 10; // q=q+10
		System.out.println(q);
		q *= 200;
		System.out.println(q);
		
		int ii = 10, jj = 20, kk = 30;
		System.out.println(ii + "\t" + jj + "\t" + kk); 
	}
}
