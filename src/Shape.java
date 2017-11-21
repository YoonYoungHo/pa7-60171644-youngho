public abstract class Shape implements Drawable {
	public void draw(String x) {
		System.out.println(x);
	}
	public abstract double area();
	public abstract double perimeter();
	
	
}
