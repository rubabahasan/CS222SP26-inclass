package inheritance;

import java.util.ArrayList;

public class GenericsDriver {

	public static void main(String[] args) {
		Box<Circle> b = new Box<>();
		Circle c = new Circle(5);
		b.setItem(c);
		
		Box<Shape> bb = new Box<>();
		
		ArrayList<Box<Circle>> a = new ArrayList<>();
		
		System.out.println(b.getItem());
	}

}
