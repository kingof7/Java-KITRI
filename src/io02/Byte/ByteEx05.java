package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteEx05 {

	public static void main(String[] args) {
		
		File file = null;
		FileOutputStream fos = null;		
		
		FileInputStream fis = null;
		
		try {
			
			//파일 출력
			file = new File("C:\\LJH\\eclipse\\fileupDown\\output\\Ex05.txt"); //파일 생서
			fos = new FileOutputStream(file);
			
			
			//byte 자료형 입출력, 이미지(엑셀, 파워포인트 등) 입출력 했음
			String str = "안녕하세요"; 		//1.문자
			byte[] data = str.getBytes(); //2. bytes로 바꿔서 출력
			fos.write(data);			
			fos.flush();
			
			//파일 입력
			fis = new FileInputStream(file);
			byte[] msg = new byte[65536];
			int count = fis.read(msg); //배열의 수 // bytes를 읽어옴
		
			String inStr = new String(msg, 0, count); // **배열의 마지막 번지		// 문자로 바꾼다.
			System.out.println(inStr);
						
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch(IOException e) { e.printStackTrace(); }
		}
		
	}

}
