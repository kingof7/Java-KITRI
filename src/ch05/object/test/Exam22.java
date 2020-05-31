package ch05.object.test;

class Birthday{ //구역 클래스
	private int year;
	private int month;
	private int day;
	private String name;
		
	public Birthday(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	
	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
	}
}

public class Exam22 { //실행 클래스
	
	public static void main(String[] args) {
		Birthday b = new Birthday(2010, 12, 25, "홍길동"); //? 함수와 다르게 호출되지 않아도, 값이 초기화 됨(넘어감) 
}
	
}
