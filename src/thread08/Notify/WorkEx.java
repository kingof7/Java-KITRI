package thread08.Notify;

public class WorkEx {
	public static void main(String[] args) {
		WorkData work = new WorkData();		// 공유 객체 Hong 과 Cho가 나눠쓴다.
		
		Hong a = new Hong(work);
		a.setName("a");
		
		Hong b = new Hong(work);
		b.setName("b");
		
		ChoProducer x = new ChoProducer(work);
		x.setName("x");
		
		ChoProducer y = new ChoProducer(work);
		y.setName("y");
		
		a.start();
		b.start();
		x.start();
		y.start();
	}
}
