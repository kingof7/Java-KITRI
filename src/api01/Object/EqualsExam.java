package api01.Object;

public class EqualsExam {

	public static void main(String[] args) {
		String a = "hi";
		String b = "hi";		
		
		if(a == b) { // hi가아니라 주소가 같다는 뜻
			System.out.println("주소값 비교, T");
		}
		if(a.equals(b)) { //데이터 비교
			System.out.println("데이터 비교, T");
		}
		
		String x = new String("hi"); //인스턴스화할때는 주소가 각각 할당 됨
		String y = new String("hi");
		
		if(x == y) {		//주소값 비교
			System.out.println("주소값 비교");
		}
		else
			System.out.println("주소가 다름");
		
		if(x.equals(y)) {
			System.out.println("데이터 비교, T");
		}
		
		System.out.println("-----------------------------");
		
		Member kim = new Member("abc123", "pw123");
		Member lee = new Member("abc123", "pw123");
				
		if (kim == lee) {
			System.out.println("주소값 같음");
		}
		else {
			System.out.println("주소값 같지 않음");
		}
		if(kim.equals(lee)) //인스턴스화된 kim과 lee가 Member.java로넘어감
			System.out.println("문자열 같음");
				
	}

}
