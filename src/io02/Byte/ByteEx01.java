package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 이종화
 * @date : 2020. 5. 18.
 * @description : 파일 입출력 : 그림, 멀티미디어, 문자 종류의 데이터를 보낼 수 있다.
 * 												  바이트기반, 문자기반 스트림으로 나눈다.
 * 												  바이트 기반 : 그림, 멀티미디어, 문자의 모든 종류 데이터를 보내고 받을 수 있다.
 * 												  
 */
public class ByteEx01 {

	public static void main(String[] args) {
		byte[] data = new byte[] {'a','p','p','l','e'}; //스트림 객체에 들어가는것인가..?
		
		try {
			File file = new File("C:\\LJH\\eclipse\\fileupDown\\ex01.txt"); 
			FileOutputStream fos = new FileOutputStream(file); // data를 stream 객체를 통해서 ex01.txt에 내보낼 것이다.
			
			for(int i=0;i<data.length;i++) {
				fos.write(data[i]); 	// 스트림 객체에 입력
			}
			
			fos.flush(); 					// 버퍼에 잔류하고 있는 데이터를 강제로 출력
			
			fos.close();					// 시스템 자원을 반납, 출력 스트림을 닫는다.
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
