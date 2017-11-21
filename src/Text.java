public class Text implements Drawable {
	String x;
	
	public Text() {	
	}
	
	public Text(String str) {
		x = str;
	}

	public void draw() {
		System.out.println(x);
	}

}