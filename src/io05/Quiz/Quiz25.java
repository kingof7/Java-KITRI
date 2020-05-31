package io05.Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quiz25 {	
	
	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;		
		int i = 0;
		
		try {
			
			file = new File("C:\\LJH\\eclipse\\fileupDown\\output\\quiz25.txt");				
			fr = new FileReader(file); //읽기
			br = new BufferedReader(fr, 1024);			
						
			while(true) {
				
				int sum = 0;
				String b = br.readLine();	
				if(b == null) break;
				String[] strArr = b.split(" ");				
								
				for(i=0;i<strArr.length;i++) {
					sum += Integer.parseInt(strArr[i]);
						// (int) strArr[i] ??
					/*
					 * String a = "1";
					 * String b = "2";
					 * int sum = (int) (a+b);
					 * */
				}
				System.out.println("합은:"+sum);											
			}	
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();		
		}  finally {
			
			try {				
				if(fr != null) fr.close();
				if(br != null) br.close();					
					
			} catch(IOException e) {
				e.printStackTrace();
			}		
				
			}
		
	}

}
