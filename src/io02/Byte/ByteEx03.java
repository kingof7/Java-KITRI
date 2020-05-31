package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx03 {

	public static void main(String[] args) {
		
		try {
			File infile = new File("C:\\LJH\\eclipse\\fileupDown\\input\\bmw.png");
			FileInputStream fis = new FileInputStream(infile);
			
			File outfile = new File("C:\\LJH\\eclipse\\fileupDown\\output\\bmw.png"); //내보낼 경로
			FileOutputStream fos = new FileOutputStream(outfile);
			
			while(true) {
				int count = fis.read();
				//System.out.println("fis의 카운트수: " + count);
				if(count == -1) break; //끝을 넘어가면 -1이됨
				
				fos.write(count);
			}
			fos.flush();
			fos.close();
			fis.close();
			System.out.println("파일 출력");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();

		}
			
		
	}

}
