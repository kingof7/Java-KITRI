package api03.String;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 13.
 * @Description :  
 *
 */
public class StringBuffer02 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("** JAVA");
		System.out.println(str);
		
		str.insert(1, "Good");
		System.out.println(str);
		
		str.setCharAt(5, '#');
		System.out.println(str);
		
		str.replace(7, 11, "Love");
		System.out.println(str);
		
		str.deleteCharAt(0);
		System.out.println(str);
		
		str.delete(0, 6);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
	}
}
