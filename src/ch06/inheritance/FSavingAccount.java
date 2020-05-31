package ch06.inheritance;

public class FSavingAccount extends FAccumulator {		//값입력, 출력
	
	public FSavingAccount() { }
	
	public FSavingAccount(int initValue) {
		super(initValue);
	}
	
	public void saveMoney(int money) {
		setAccumulator(money);		
	}

	public void showMoney() {
		System.out.println("개인별 누적금액: " + getAccumulator());
		
	}

}
