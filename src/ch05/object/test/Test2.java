package ch05.object.test;
class Person {
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void disp() {
		System.out.println(age);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person(17);
		a.disp();		
		
	}
}


