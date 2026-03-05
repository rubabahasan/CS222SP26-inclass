package oop;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
