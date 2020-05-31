package ch01.dataType;

/**
 * @author : 이종화
 * @date : 2020. 4. 27.
 * @description : 연산자 우선순위
 *  1) 최우선 연산자: . [] ()
 *  2) 단항연산자 : ! ~ + - ++ --(전위형증감연산자) (cast)/(자료형) 
 *  3) 산술연산자 : * % + -
 *  4) 시프트 연산자 : << >> >>>
 *  5) 비교연산자 : < > <= >= == !=
 *  6) 논리연산자 : & ^ | // && ||
 *  7) 삼항연산자 : 조건식 ? 참 : 거짓
 *  8) 대입연산자 : = *= /= %= += &= ^= ...
 *  9) 
 *  10)
 */
public class Exam02 {

	public static void main(String[] args) {
		boolean a=false;
		boolean b=!a;
		System.out.println(a + "\t" + b);
		
		int c = ~10;	//이진부정 ? -->양수일때는 1개큰 음수가나오고
		// 0(부호비트)000 1010
		// 1111 0101 : -11 (0의자리값을 더해서+1해줌)
		System.out.println(c);
		
		int d = ~-15; //음수니까 1을빼서 14로생각 -->음수일때는 1개 작은 양수가나옴
		//1111 0001
		//0000 1110
		System.out.println(d);
		
		int e = ~20;
		System.out.println(e);
		
		int f = ~-19;
		System.out.println(f);
		
		int x = 100;
		int y = -200;
		System.out.println(x + "\t" + y);
		System.out.println(-x + "\t" + +y);
		
		System.out.println(x + "\t" + y);
		
		int i = 10;
		int j = 20;
		int k = ++i + ++j;
		System.out.println(++k + " " + --i + " " + j++);
		
		System.out.println("CAST(자료형) 연산자");
		byte su = 10;
		byte value = su;	//byte, short, int, long
		System.out.println("value: " + value);
		
		int r=77;
		byte rr=(byte)r;		//
		System.out.println(rr); //? 되긴하는데 int로 선언한 r을 byte로 크기를 줄이면 문제가 생길 수 있다. (반대는 괜찮음)
		
		byte a1=77;
		int aa=(int)a1; //연산할 때 캐스트 연산자를 써줌
		System.out.println(aa);
		
		float su1 = 55.5f;
		int su2 = 66;
		float result = su1 + su2;
		System.out.println(result + "\n");
		
		int result2 = (int)su1 + su2; // 부동소수를 정수로 변환
		System.out.println(result2 + "\n");
		
		int w = 10;
		int q = 3;
		float result3 = w/q; // ? 3.333이 안나옴 -> 정수형 연산이므로
		double result4 = (double)w/q; // 10.3/3 = 3.33...
		System.out.println(result3 + "\t");
		System.out.printf("%.30f\n\n", result4);
		
		//? 심화개념	
		//정수+실수 = 실수
		//문자열+정수 = 문자열
		//문자열+실수 = 문자열	
		System.out.println("W: " + w);
		System.out.println(w + q); // 정수형으로 뿌려짐, 연산된 값
		System.out.println(w + " " + q); // ? **문자형으로 뿌려짐(즉, 문자열을 아무거나 넣어주면 전체값이 문자열이된다.)
		System.out.println("합계 = "+ w+q); // 연산이 아니라 각각 더해짐
		System.out.println("합계 = "+ (w+q)); // ? 괄호 넣으면 연산이 된다.
		
		int p=10;
		System.out.println("p:" + p++);
		
	}

}
