package io01.File;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		File dir = new File("C:/MyDir");
		System.out.println(dir.exists()); //경로 존재하는지 물어보기
		
		if(dir.exists() == false) {
			dir.mkdir(); 	// 디렉토리 생성
			System.out.println("디렉토리가 생성되었습니다.");
		}
		
		File file = new File(dir, "abc.txt"); // dir경로에 abc.txt를 찾는다.
		System.out.println(file.isFile());
		
		try {
			if((dir.exists() == true) && (file.isFile() == false)) {
				file.createNewFile();
				System.out.println("파일이 만들어졌습니다.");			
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n");
		
		if(dir.exists() == true && file.isFile() == true) {
			file.delete(); // 파일 삭제
			dir.delete(); // 디렉토리 삭제
			System.out.println("디렉토리가 삭제되었습니다.");
			System.out.println("파일이 삭제되었습니다.");
		}
	}
}
