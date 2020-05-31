package api06.Quiz;

public class Quiz29 {

	public static void main(String[] args) {
		String str = "1!2@3^4~5";
		String sb;
		String delStr = "!@^~";
		
		int index1 = str.indexOf("!"); // 1
		int index2 = str.indexOf("@"); // 3
		int index3 = str.indexOf("^"); // 5
		int index4 = str.indexOf("~"); // 7
		
		String st1 = String.valueOf(str.charAt(index1));
		String st2 = String.valueOf(str.charAt(index2));
		String st3 = String.valueOf(str.charAt(index3));
		String st4 = String.valueOf(str.charAt(index4));
		
		str = str.replace(st1, "");
		str = str.replace(st2, "");			
		str = str.replace(st3, "");
		sb = str.replace(st4, "");
		
		//여기서 코드 작성
		System.out.println(sb.toString());
	}

}
