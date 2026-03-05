package oop;

public class House {
	// Fields
	public int numDoors;
	private int numWindows;
	
	// Methods
	
	//Constructor method
	
	// Default version has no parameters
	House(){
		numDoors = 1;
		numWindows = 0;
	}
	
	
	House(int numDoors, int numWindows){
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}
	
	int getNumDoors(){
		return this.numDoors;
	}
	
	int getNumWindows(){
		return this.numWindows;
	}
	
	void setNumDoors(int doors){
		this.numDoors =  doors;
	}
	
//	returnType name(parameters)
	boolean isBig(){
		return true;
	}
	
	public String toString() {
		return "House: doors:" + this.numDoors + ", windows:" + this.numWindows; 
//		return "House";
	}
}
