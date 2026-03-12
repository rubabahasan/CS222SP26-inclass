package oop;

public class Point {
	// Fields
	int x;
	int y;
	
	static int  x_0;

	//methods
	public Point() {
		this.x_0 = 0;
		this.x = 0;
		this.y = 0;
	}

	public Point(int a) {
		this.x_0 = 10;
		this.x = a;
		this.y = a;
	}
	
	public Point(int x, int y) {
		this.x_0 = 1000;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	double distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	

}
