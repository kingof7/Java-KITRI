package api04.Wapper;

public class RoundEx {

	public static void main(String[] args) {
		double x = 123.5672;
		double y = 456.4675;
		
		int a = (int) Math.round(x); //round()가 long 반환이지만 int로 캐스팅
		System.out.println("반올림: " + a);
		int b = (int) Math.ceil(x); // 그냥 올림
		System.out.println("올림: " + b);
		int c = (int) Math.floor(x);
		System.out.println("내림: " + c);
		
		//소수 둘째자리 반올림해서 첫재짜리 출력
		double temp = x*10;
		System.out.println(temp);
		int imsi = (int) Math.round(temp);
		double r = imsi/10.0;
		System.out.println("\n" + x + "\t" + temp + "\t" + imsi + "\t" + r);
		//float k = imsi/10.0f;
		
		//System.out.println(x + "\t" + temp + "\t" + imsi);
		
		double t = Math.round(x*10)/10.0;
		System.out.println(t);
		
		double e = Math.round(x*100)/100.0;
		System.out.println(e);
		
		double m = Math.round(x*1000)/1000.0;
		System.out.println(m);
		
		double ce = Math.ceil(x*100)/100.0;
		System.out.println("소수 셋째자리 올림 둘째자리까지 출력: " + ce);
		
		double f = Math.floor(x*1000)/1000.0;
		System.out.println("소수 네째자리 버림 셋째자리까지 출력: " + f);

	}

}
