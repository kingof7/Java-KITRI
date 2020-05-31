package io05.Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null; //출력을 돕는 프린트 보조 스트림 // PrintWriter(문자방식), PrintStream(바이트방식)
		Scanner sc = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		File dir = new File("C:\\LJH\\eclipse\\fileupDown\\output");
		//System.out.println(dir.exists()); //경로 존재하는지 물어보기
		
		if(dir.exists() == false) {
			dir.mkdir(); 	// 디렉토리 생성
			System.out.println("디렉토리가 생성되었습니다.");
		}
		
		
		try {	
					
			file = new File(dir, "quiz26.txt"); // dir경로에 abc.txt를 만들어라
			//System.out.println(file.isFile());
					
			if((dir.exists() == true) && (file.isFile() == false)) {
					file.createNewFile();
					System.out.println("파일이 만들어졌습니다.");			
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			System.out.println("데이터를 입력해 주세요. (종료:Q)");
			
			while(true) {				
				String msg = sc.nextLine(); // 한 줄 씩 읽어옴
				if(msg.equalsIgnoreCase("Q")) {
					System.out.println("종료되었습니다.");
					break;
				}
				bw.write(msg + "\r\n"); //값을 스트림에 기록(파일이 아닌)
				bw.flush(); //스트림의 값을 목적지 파일로 분출
			}
			
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);		
			
			while(true) {			
				String msg = br.readLine();
				if(msg == null) break;
				System.out.println(msg);
			}
			
		} catch(Exception e) {
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


