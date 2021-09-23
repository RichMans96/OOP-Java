package com.qa.abstraction.vehicles;

public class Car extends Vehicle implements HasWheels {

	private String colour;
	private float engineSize;
	
	public Car() {}

	public Car(int numOfWheels, String make, String model, String colour, float engineSize) {
		super(numOfWheels, make, model);
		this.colour = colour;
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [make= " + super.getMake() + " model= " + super.getModel() + " colour= " + colour + ", engineSize= " + engineSize + "]";
	}

	@Override
	public void drive() {
		System.out.println("I drive like a car");
		
	}

	@Override
	public void changeWheels() {
		System.out.println("Change wheels for a car");
		
	}

	@Override
	public void direction() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
