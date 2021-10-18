package demo.shape;

public class DemoShape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;

		Shape s = r;

		System.out.println(s.area());

	}

}
