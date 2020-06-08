package io03.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharEx03 {

	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null; //출력을 돕는 프린트 보조 스트림 // PrintWriter(문자방식), PrintStream(바이트방식)
		Scanner sc = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {			
			//출력
			System.out.println("문자열을 입력하세요.");
			sc = new Scanner(System.in);
			
			file = new File("C:\\Users\\LJH\\eclipse\\fileupDown\\outputcharEx01.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);
			pw = new PrintWriter(bw);
			
			while(true) {
				String msg = sc.nextLine();
				
				if(msg.equalsIgnoreCase("q"))	 break;
				
				//bw.write(msg + "\r\n"); //줄바꿀때마다 엔터를 넣어라?
				
				pw.println(msg);
				pw.flush();
			}
			System.out.println("\n출력완료\n");
			
			// 입력
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) break;
				System.out.println(msg);
			}								
		
			
			//입력			
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(sc != null) sc.close();
				
				if(fr != null) fr.close();
				if(br != null) br.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			//프로세서란? 컴퓨터의 분야에서 무엇인가를 처리 · 가공하는 기능을 가진 하드웨어 · 소프트웨어. CPU(중앙처리장치)는 하드웨어 프로세서의 대표적인 것인데, 컴퓨터 시스템 전체를 하나의 프로세서라 부를 수도 있다.
			//컴파일러 등을 언어 프로세서라 부르는 것처럼, 어떤 특정의 기능 · 처리를 하는 소프트웨어도 프로세서라 부른다.
			
			//프로그램(응용프로그램)을 싨행하면 프로세서가1개올라감( 즉, 카카오톡키면 1개의 프로세서가올라감) 
			
			//카카오톡안에서 채팅기능을 사용(스레드) : 프로세서를 구성하는 하나의 작업단위 : 작업순서가 없이 번갈아가면서 실행 됨
			//네이트온안에서 채팅하면서 음악듣기(멀티스레드)
			
			//문자방식: read write
			//바이너리:..?
			
		}
		
		
	}

}
