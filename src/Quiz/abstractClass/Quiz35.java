package Quiz.abstractClass;

abstract class Figure {
	public abstract void area();
	public abstract void around();
}

class Rectangular extends Figure {
	private double garo;
	private double sero;
	
	public Rectangular() {	}
	
	public Rectangular(double garo, double sero) {	
		this.garo = garo;
		this.sero = sero;
	}

	@Override
	public void area() {
		System.out.println("직사각형의 면적: "+ (garo*sero));
	}

	@Override
	public void around() {
		System.out.println("직사각형의 둘레: "+ (2*(garo+sero)));		
	}
}

class Circle extends Figure {
	private double radius;
	
	public Circle() {	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("원의 면적: "+ Math.PI*radius*radius);				
	}

	@Override
	public void around() {
		System.out.println("원의 둘레: "+ 2*Math.PI*radius);					
	}
}

public class Quiz35 {

	public static void main(String[] args) {
		Figure f = new Rectangular(2.3, 3.7);
		f.area();
		f.around();
		
		Figure i = new Circle(3.6);
		i.area();
		i.around();
	}

}
