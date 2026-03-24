package inheritance;

public class Circle extends Shape{
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}
	
	public double stretch(int factor) {
		this.radius = this.radius * factor;
		return this.radius;
	}
	
	public void test() {
		
	}

}
