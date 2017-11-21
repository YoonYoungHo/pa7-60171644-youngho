public class Rectangle extends Shape {
	private int a;
	private int b;
	private double width, length;
	
	public Rectangle() {
	}
	public Rectangle(int a, int b, double width, double length) {
		this.a = a;
		this.b = b;
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width*length;
	}
	
	public double perimeter() {
		return 2*(width+length);
	}
	
	public void draw() {
		System.out.println("Rectangle (" + (double)a + ", " + (double)b + ") - (" + (double)width + ", " + (double)length+ ")");
	
	}
}
