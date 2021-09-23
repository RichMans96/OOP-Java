package com.qa.abstraction.vehicles;

public class Boat extends Vehicle {

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
	
	@Override
	public void drive() {
		System.out.println("I sail i don't drive");
		
	}

	@Override
	public void direction() {
		// TODO Auto-generated method stub
		
	}
	
}
