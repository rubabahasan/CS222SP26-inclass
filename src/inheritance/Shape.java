package inheritance;

public abstract class Shape implements Stretchable{
	public abstract double area();
	public abstract double perimeter();
	// semiperimeter = perimeter/2
	public double semiperimeter() {
		return perimeter()/2;
	}

}
