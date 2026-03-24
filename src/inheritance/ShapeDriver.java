package inheritance;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(10);
		Circle c = new Circle(5);
		double area = c.area();
		System.out.println(area);
		System.out.println(c);
		s.area();
		s.test();
		c.test();
	}

}
