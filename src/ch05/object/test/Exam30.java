package ch05.object.test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class ZZ {
	private String name;
	private int don;
	private static float iyul; // static은 class안에 멤버변수로만 사용가능
	
	public ZZ() {
		// TODO Auto-generated constructor stub
	}
	
	public ZZ(String name, int don, float iyul) {
		this.name = name;
		this.don = don;
		ZZ.iyul=iyul;
	}
	
	public void disp() {
		System.out.println(name + "\t" + don + "\t" + iyul);
	}
	
	public static void output() { //static 함수는 static변수만 가져다 쓸 수 있음
		//static 함수는 static 변수만 사용가능
		
		//System.out.println(name);	ERROR
		//System.out.println(don);	ERROR
		
		System.out.println(iyul);
	}
	
}
public class Exam30 {
	
	public static void main(String[] args) {
		
		ZZ z = new ZZ("홍길동", 100000, 0.07f);
		z.disp();
		
		ZZ.output();
		double pi = Math.PI;
		
		PrintStream out = System.out;
		out.println(10);		//System.out.println(10);
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is); //Scanner sc = new Scanner(System.in);
		//https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
		//https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/InputStream.html
		
		int su = Math.abs(-20);
		System.out.println(su);
	
	}
	
} // 프로그램 종료



