package oop;

import java.util.Objects;

public class House {
	// Fields
	public int numDoors;
	public int numWindows;
	public String address;
	public Room[] rooms;
	
	// Methods
	
	//Constructor method
	
	// Default version has no parameters
	House(){
		address = "1";
		numDoors = 1;
		numWindows = 0;
	}
	
	
	House(int numDoors, int numWindows){
		address = "1";
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
//		return "House: doors:" + this.numDoors + ", windows:" + this.numWindows; 
		return "House";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof House))
			return false;
		House other = (House) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		return true;
	}
	
	public boolean equals(House h) {
		if (this.address.equals(h.address))
		{
			return true;
		}
		return false;
	}
	
	
	
}
