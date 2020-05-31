package api03.String;

/**
 * 
 * @Author : 김현수
 * @Date : 2020. 5. 13.
 * @Description :  StringBuffer는 속도가 빠르고, 문자열의 추가 삭제 삽입 작업이 가능하다.
 *
 */
public class StringBuffer01 {
	public static void main(String[] args) {
		String s1 = "새천년";
		String s2 = "대한민국";
		String s3 = s1;
		System.out.println("s1 hashcode : " + s1.hashCode()); // 주소값에 대한 해시코
		System.out.println("s2 hashcode : " + s2.hashCode());
		System.out.println("s3 hashcode : " + s3.hashCode());
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 hashcode : " + s1.hashCode()); //해시코드가 달라진다.
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("우리나라");
		StringBuffer sb2 = new StringBuffer("대한민국");
		System.out.println("sb1 hash code : " + sb1.hashCode());
		System.out.println("sb2 hash code : " + sb2.hashCode());
		
		sb1.append(sb2);
		sb1.append("좋은나라");
		System.out.println(sb1);
		System.out.println("sb1 hasb code : " + sb1.hashCode());
		
		StringBuffer str = new StringBuffer("apple");
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("문자열 용량(byte): " + str.capacity()); // StringBuffer는 기존문자열의 +16을 해준다.
	}
}
