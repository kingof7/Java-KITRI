package ch06.robotAbstract;
/**
 * @author : 이종화
 * @date : 2020. 5. 8.
 * @description : 시나리오
 * 								1) 로봇모양은 팔, 다리, 머리, 몸통으로 구성되어 있다.
 * 								2) 로봇은 기본적으로 걷고, 달릴 수 있어야 합니다.
 * 								3) 로봇 종류에 따라서 날 수 있고, 미사일 쏠 수 있고, 검을 가질 수 있다.
 * 
 * 								4) super 로봇은 날 수 있고, 미사일 쏠 수 있고, 레이저검을 가지고 있다.
 * 								5) standard 로봇은 날 수 없고, 미사일 쏠 수 있고, 목검을 가지고 있다.
 * 								6) low 로봇은 날 수 없고, 미사일 쏠 수 없고, 검도 없다.
 * 								4~6은 추상클래스
 */
public class RobotMain {
	
	public static void main(String[] args) {
		
		/* 객체생성 후 호출로도 가능
		 * LowRobot a = new LowRobot("Low"); a.shape(); a.actionFly();
		 */
		
		Robot[] robotArray = new Robot[3];
		
		robotArray[0] = new LowRobot("LowRobot");
		robotArray[1] = new StandardRobot("StandardRobot");
		robotArray[2] = new SuperRobot("SuperRobot");

		for(int i=0;i<robotArray.length;i++) {
			robotArray[i].shape();
			robotArray[i].actionWalk();
			robotArray[i].actionRun();
			robotArray[i].actionFly();
			robotArray[i].actionMisile();
			robotArray[i].hasSword();
			System.out.println("\n");			
		}
	}

}
