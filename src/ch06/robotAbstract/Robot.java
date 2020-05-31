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
 * 								5) low 로봇은 날 수 없고, 미사일 쏠 수 없고, 검도 없다.
 */
public abstract class Robot {
	protected String kind; // super, standard, low
	
	protected void shape() {
		System.out.println(kind + "는 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	protected void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	
	protected void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}
	
	protected abstract void actionFly();
	protected abstract void actionMisile();
	protected abstract void hasSword();
	
}
