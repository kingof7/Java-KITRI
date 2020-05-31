package ch06.inheritance;

class Shape extends Object{						// 부모클래스(슈퍼클래스) // class Shape extends Object가 생략된것이나 마찬가지... 
	public void draw() {								    // Overriding
		System.out.println("Shape");
	}
}

class Line extends Shape { 		//	자식클래스(서브클래스)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class JExam {

	public static void main(String[] args) {
		Shape[] array = new Shape[3]; // Object[] array = new Shape[3]; 도 가능하지만...
		array[0] = new Rect();
		array[1] = new Line();
		array[2] = new Circle();
		
		for(int i=0;i<array.length;i++) {
			array[i].draw(); // Object는 draw();가 없음 // 근데 toString();로는 가능
		}
		

	}

}
