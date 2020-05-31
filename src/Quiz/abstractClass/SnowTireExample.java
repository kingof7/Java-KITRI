package Quiz.abstractClass;
/**
 * @author : 이종화
 * @date : 2020. 5. 8.
 * @description : Test 27
 */
class Tire{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
class SnowTire extends Tire{
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = new SnowTire();
		snowTire.run();
		tire.run();
		

	}

}
