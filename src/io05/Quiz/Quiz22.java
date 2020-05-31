package io05.Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args)  {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null; //출력을 돕는 프린트 보조 스트림 // PrintWriter(문자방식), PrintStream(바이트방식)
		Scanner sc = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		int i = 0;
		
		try {			
			//출력						
			file = new File("C:\\LJH\\eclipse\\fileupDown\\output\\quiz22.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);
			pw = new PrintWriter(bw);
			
			while(i < 6) {
				System.out.print(" ");
				sc = new Scanner(System.in);
				String msg = sc.nextLine();		
								
				bw.write(msg + "\r\n"); //줄바꿀때마다 엔터를 넣어라?
								
				pw.flush();
				i++;
			}			
			
			// 입력
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);			
			i = 0;
			
			while(true) {
				i++;
				String msg = br.readLine();
				if(msg == null) break;
				System.out.println(i+ "\t" +msg);
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
		
	}
	
	}
}


