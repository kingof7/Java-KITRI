package Quiz.abstractClass;
class Drink {
	
	protected String name;
	protected int price;
	protected int count;
	
	public Drink() {
		// TODO Auto-generated constructor stub
	}
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;			
	}
	
	public static void title() {
		System.out.println("상품"+"\t"+"단위"+"\t"+"수량"+"\t"+"금액");
	}
	
	public void disp() {
		
	}
	
}
class Alcohol extends Drink {
	private float alcper;
	
	public Alcohol() {
		// TODO Auto-generated constructor stub
	}
	
	public Alcohol(String name, int price, int count, float alcper) {			
		// TODO Auto-generated constructor stub
	}
	
	public static void title() {
		System.out.println("상품명(도수"+"\t"+"단위"+"\t"+"수량"+"\t"+"금액");

	}
	
	public void disp() {
		
	}
	
}

public class Quiz33 {
	   
	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 200, 3);
		Drink tea = new Drink("녹차", 150, 2);
		
		Drink.title();
		coffee.disp();
		tea.disp();
		
		Alcohol wine = new Alcohol("와인", 300, 2, 15.0f);
		Alcohol.title();
		wine.disp();
	}

}
