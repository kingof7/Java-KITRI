package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx04 {

	public static void main(String[] args) {
		FileInputStream fis = null; // finally 구문에 close를 쓰기위해 전역변수로 선언해줌
		FileOutputStream fos = null;
		
		try {
			File infile = new File("C:\\LJH\\eclipse\\fileupDown\\input\\bmw.png");
			fis = new FileInputStream(infile); //입력 스트림 객체 생성
			
			File outfile = new File("C:\\LJH\\eclipse\\fileupDown\\output\\bmw.png"); //내보낼 경로
			fos = new FileOutputStream(outfile);
			
			while(true) {
				int count = fis.read();
				//System.out.println("fis의 카운트수: " + count);
				if(count == -1) break; //끝을 넘어가면 -1이됨
				
				fos.write(count);
			}
			fos.flush();
			
			System.out.println("파일 출력");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try { // 지역 안에서는 FileInput,OutStream에 대해 선언이 없으니 try-catch 해줘야함
				if(fis != null) fis.close(); // close문이 있으면 try catch 또해줌		
				if(fos != null) fos.close(); //중간에 에러나면 close문을 실행못하니까 finally 구문에 입력						
			} catch(IOException e) {
				e.printStackTrace();
			} 
		}
			
		
	}

}
