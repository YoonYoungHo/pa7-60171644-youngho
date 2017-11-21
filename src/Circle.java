public class Circle extends Shape {
	private int a;
	private int b;
	private double radius;
	final double pi = Math.PI;
	
	public Circle() {
	}
	
	public Circle(int a, int b, double radius) {
		this.a = a;
		this.b = b;
		this.radius = radius;
	}
	
	public double area() {
		return pi*Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2*pi*radius;
	}
	
	public void draw() {
		System.out.println("Circle center(" + a + ", " + b + ")-radius(" + radius + ")");
		
	}
}
