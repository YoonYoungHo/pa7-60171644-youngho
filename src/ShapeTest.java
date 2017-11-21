public class ShapeTest {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[3];
		Shape sha1;
		Shape sha2;
		Shape sha3;
		sha1 = new Rectangle(10, 20, 30, 40);
		sha2 = new Rectangle(30, 30, 10, 10);
		sha3 = new Circle(50, 20, 30);
		shapes[0] = sha1;
		shapes[1] = sha2;
		shapes[2] = sha3;

		for (Shape s : shapes) {
			System.out.printf("Area : %.1f\n", s.area());
			System.out.printf("Length : %.1f\n", s.perimeter());
		}
		
		Drawable[] drawables = new Drawable[4];
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		
		for (Drawable d : drawables) {
			d.draw();
		}
	}
}
