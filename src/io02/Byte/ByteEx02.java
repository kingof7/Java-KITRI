package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteEx02 {

	public static void main(String[] args) {
		
		File file = null;
		FileInputStream fis = null;
		
		try {
			file = new File("C:\\Users\\LJH\\eclipse\\fileupDown\\quiz22.txt");
			fis = new FileInputStream(file);
			
			byte[] data = new byte[65536]; //byte 배열을 일단 최대치로 선언 --> file을 byte에 담음 (FileInput,OutputStream은 byte형태로 주고받기때문)
			int count = fis.read(data); // data의 카운트 수 // 매핑??
			System.out.println(count+"\n"); // 5		
			
			for(int i=0;i<count;i++) {
				System.out.println(i + "\t" + (char) data[i]);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
