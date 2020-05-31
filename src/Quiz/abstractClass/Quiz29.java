package Quiz.abstractClass;

class Student {
	protected int hakbunho;
	protected String name;
	protected String major;
}

class StudentAddress extends Student {
	private String phone;
	private String addr;
	
	public StudentAddress() {	}
	
	public StudentAddress(int hakbunho, String name, String major, String phone, String addr) {
		super.hakbunho = hakbunho;
		super.name = name;
		super.major = major;
		this.phone = phone;
		this.addr = addr;
	}
	public void disp() {
		System.out.println("학번:"+this.hakbunho);
		System.out.println("이름:"+name);
		System.out.println("학과:"+super.major);
		System.out.println("전화번호:"+phone);
		System.out.println("주소:"+addr);
	}
	
}

public class Quiz29 {
	
	public static void main(String[] args) {
		StudentAddress s = new StudentAddress(123456, "홍길동", "소프트웨어", "010-123-1234", "서울시강남구");
		s.disp();
	}

}
