package ch06.phoneinterface;

public class LPhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("3G 가능합니다.");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("가능합니다.");
		
	}
	

}
