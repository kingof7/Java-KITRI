package io05.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			file = new File("C:\\LJH\\eclipse\\fileupDown\\output\\quiz22.txt"); //이건 파일생성이아님
			fr = new FileReader(file); //읽기
			br = new BufferedReader(fr, 1024);
			sc = new Scanner(System.in);
			
			System.out.print(" ");
			String msg = sc.next();
			while(true) {
				String str = br.readLine();
				if(str.equals(msg)) {
					System.out.println("동일한문자열 존재합니다."+"["+msg+"]");
					break;
				}
		}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("찾는 문자열이 없습니다.");
		}  finally {
			
			try {
				if(file != null) fr.close();
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(sc != null) sc.close();			
					
			} catch(IOException e) {
				e.printStackTrace();
			}		
				
			}
	}

}
