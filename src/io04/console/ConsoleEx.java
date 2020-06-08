package io04.console;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		InputStream is = System.in; //키보드 입력을 스트림객체에 넣은 것임		
		
		try {
			
			byte[] data = new byte[20];
			System.out.println("문자열입력:");			
			int count = is.read(data); //엔터까지 입력되므로 
			System.out.println(count-2); // 문자열길이+2되니까 -2해줌
			
			String str = new String(data, 0, count-2);// enter 제외하기위해 -1 해줌
			System.out.println(str);
			
			byte[] suData = new byte[20];
			
			System.out.println("숫자입력: ");
			int cnt = is.read(suData);
			
			String suStr = new String(suData, 0, cnt-2);
			int value = Integer.parseInt(suStr);
			System.out.println(++value);
			
			System.out.println();
			
			PrintStream ps = System.out; // byte로 출력
			ps.println("출력");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
