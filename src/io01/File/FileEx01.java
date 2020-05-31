package io01.File;

import java.io.File;
/**
 * @author : 이종화
 * @date : 2020. 5. 18.
 * @description : 입력 : 키보드, 파일(다운로드), 네트워크(채팅)
 * 							  출력 : 화면, 파일(업로드), 네트워크(채팅)
 */
public class FileEx01 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		
		for(int i=0;i<roots.length;i++) { //드라이브 수 :C,D,E,F..
			System.out.println(roots[i]); 	// 운영체제 시스템의 루트 디렉터리를 반환한다.
		}
		// \t 서식사용이 되기 떄문에 경로 변경시 \\또는 /
		File file = new File("C:/LJH/eclipse/workspace/pro03/src/api13/Exception"); //					 /를 \\로 대체해도됨
		
		if(file.exists()) { //디렉토리 존재
			String[] str = file.list(); 
			
			for(int i=0;i<str.length;i++) { // File경로의 파일 수
				System.out.println(str[i]);
			}
		}
		
		File temp = new File(file, "Ex04.java");
		System.out.println("디렉토리 존재: " + temp.exists());
		System.out.println("파일존재: " + temp.isFile());
		
		if(temp.exists() && temp.isFile()) {
			System.out.println("파일명: " + temp.getName()); // String 반환
			System.out.println("경로명: " + temp.getParent());
			System.out.println("파일 & 경로명: " + temp.getAbsolutePath()); // 많이쓰니까 꼭암기 **
			System.out.println("쓰기가능: " + temp.canWrite());
			System.out.println("파일크기: " + temp.length() + "byte");
		}
	}

}
