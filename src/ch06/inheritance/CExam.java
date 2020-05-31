package ch06.inheritance;

public class CExam {

	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV(true, 11, true);
		ctv.channelUP();
		ctv.display("캡처화면을 보여줍니다.");
		
		CaptionTV ct = new CaptionTV(true, 7, false);
		ct.channelDown();
		ct.display("캡처화면을 보여줍니다.");
		
		CaptionTV.su = 77;
		System.out.println(CaptionTV.su);
		System.out.println(++CTV.su);
	}
}
