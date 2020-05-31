package api03.String;

import java.io.UnsupportedEncodingException;

public class String03 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요";
		byte[] array = str.getBytes(); // 인코딩 한다.
		
		for (int i : array) { //foreach
			System.out.print(i + "\t"); // 이런식의 형태를 갖고 소켓으로 넘어간다.
		}
		System.out.println();
		
		//디코딩
		String value = new String(array); // 간단하게 인코딩된 값을 받을 수 있다.
		System.out.println(value);
		
		//charset 있는경우
		String string = "반가워";
		byte[] byArr = string.getBytes("utf-8"); // euc-kr, iso-8859-1 // 인코딩
		String byStr = new String(byArr, "utf-8");	//디코딩
		System.out.println(byStr);
	}
}
