package api06.Quiz;

public class Quiz28 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk.1,5\\work\\PathSeparateTest.java";
		//코드 작성
		int index = fullPath.indexOf("Path");
		System.out.println(fullPath.substring(index));
	}

}
