package Quiz.Interface;

interface Soundable{
	public String sound();
}
//Cat 작성
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
	
}
//Dog 작성
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멈머";
	}
	
}

public class Quiz08 {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
