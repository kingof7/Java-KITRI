package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 이종화
 * @date : 2020. 5. 19.
 * @description : BufferedInputStream - 보조스트림 : 일정바이트 모아서 입출력
 */
public class ByteEx06 {

	public static void main(String[] args) {
		File inFIle = null;
		FileInputStream fis = null;
		BufferedInputStream bis =null; //버퍼를 통해서 데이터를 원하는만큼의 byte로 묶어서 뿌림
			
		File outFile = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos =null;
		
		try {
			inFIle = new File("C:\\LJH\\eclipse\\fileupDown\\input\\Class Diagram.txt"); //이건 파일생성이아님
			/*
			 * 파일생성법
			 * File file = new File(dir, "abc.txt"); // dir경로에 abc.txt를 만들어라	 
			 * file.createNewFile(); System.out.println("파일이 만들어졌습니다.");
			 */
			fis = new FileInputStream(inFIle); //읽기
			bis = new BufferedInputStream(fis, 1024); //일반 파일업로드일때는 1024(max) 바이트씩 모아서 처리  // 네트워크통신에서는 512바이트가 max
			
			outFile = new File("C:\\LJH\\eclipse\\fileupDown\\output\\Class Diagram.txt");
			fos = new FileOutputStream(outFile);
			bos = new BufferedOutputStream(fos, 1024);
			
			byte[] data = new byte[65535]; //최대 크기
			
			while(true) { //1024바이트씩 돈다 (bis)
				//int count = fis.read(data); //4바이트씩 읽어서 data 배열에 넣어줌
				int count = bis.read(data); 
				if(count == -1) break;
				//fos.write(count);
				bos.write(count);
			}
			//fos.flush();
			bos.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				if(bos != null) fos.close();
				if(bis != null) fos.close();
				
			} catch(Exception e2) {
				
			}
		}
	}

}
