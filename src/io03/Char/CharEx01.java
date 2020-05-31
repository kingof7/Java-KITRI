package io03.Char;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author : 이종화
 * @date : 2020. 5. 19.
 * @description :   .java 파일만들고 텍스트 입력하기
 * 								채팅은 Char방식(끊키지않게, 라인으로 들어감), 나머지는 Binary방식으로 이해하기
 * 								데이터 이동 : 입력->출력->소켓->네트워크...
 * 								문자 입출력 - Read & Writer
 * 								
 */
public class CharEx01 {

	public static void main(String[] args) {
		
		File file = null;
		FileWriter fw = null; // 파일에 내용쓰기
		BufferedWriter bw = null;
		Scanner sc = null;
		
		try {
			file = new File("C:\\LJH\\eclipse\\fileupDown\\output\\charEx01.txt");
			fw = new FileWriter(file); // 파일에 내용입력하는 객체생성 //줄바꿈 오케이~
			bw = new BufferedWriter(fw, 1024);
			
			System.out.println("문자열을 입력하세요");
			sc = new Scanner(System.in);
			
			while(true) {				
				
				String msg = sc.nextLine(); // 한 줄 씩 읽어옴
				if(msg.equalsIgnoreCase("q")) {
					System.out.println("종료되었습니다.");
					break;
				}
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
			System.out.println("내용이 출력되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { 
				
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if( sc != null) sc.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
	}

}
