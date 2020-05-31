package ch06.phoneinterface;

public class iPhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("5G입니다.");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 미탑재입니다.");
		
	}

}
