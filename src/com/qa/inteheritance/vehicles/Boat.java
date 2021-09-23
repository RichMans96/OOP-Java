package com.qa.inteheritance.vehicles;

public class Boat extends Vehicle{

	private String typeOfBoat;
	
	public Boat() {
		
	}
	
	public Boat(String typeOfBoat, int numOfWheels, String make, String model) {
		super(numOfWheels, make, model);
		this.typeOfBoat = typeOfBoat;
	}

	public String getTypeOfBoat() {
		return typeOfBoat;
	}

	public void setTypeOfBoat(String typeOfBoat) {
		this.typeOfBoat = typeOfBoat;
	}

	@Override
	public String toString() {
		return "Boat [typeOfBoat=" + typeOfBoat + "]";
	}
	
	
	
}
