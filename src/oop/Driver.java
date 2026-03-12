package oop;

public class Driver {

	void houseTest(){
		House smallHouse = new House(10, 100);
		House h1, h2, h3;
		h1 = new House();
		

		System.out.println("Windows: "+ smallHouse.numWindows);
		System.out.println("Doors: "+ smallHouse.numDoors);
		
		smallHouse.numDoors = 3;
		smallHouse.numWindows = 10;
		
		System.out.println("Windows: "+ smallHouse.numWindows);
		System.out.println("Doors: "+ smallHouse.getNumDoors());
		
		System.out.println(smallHouse.isBig());
		
		System.out.println("h1 Windows: "+ h1.numWindows);
		System.out.println("h1 Doors: "+ h1.numDoors);
		
		System.out.println(smallHouse);
		
	}
	public static void main(String[] args) {
		System.out.println(Point.x_0);
		// TODO Auto-generated method stub
		Point a, b, c;
//		System.out.println(a.x); 
		a = new Point();
		System.out.println(a.x_0);
//		System.out.println(b.x_0);
//		System.out.println(c.x_0);
		
		b = new Point(0);
		System.out.println(a.x_0);
		System.out.println(b.x_0);
//		System.out.println(c.x_0);
		
		c = new Point(0, 0);
		System.out.println(a.x_0);
		System.out.println(b.x_0);
		System.out.println(c.x_0);
		
		System.out.println(b.distance());
		
		if (a.equals(b))
		{
			System.out.println("a and b equal");
		}
		else {
			System.out.println("a and b unequal");
		}
		
		System.out.println(Point.x_0);

		
	}

}
