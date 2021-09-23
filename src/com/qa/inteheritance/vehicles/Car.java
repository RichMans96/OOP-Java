package com.qa.inteheritance.vehicles;

public class Car extends Vehicle {

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
	
	public void vroom() {
		System.out.println("Vroom");
	}
	
	@Override
	public String toString() {
		return "Car [make= " + super.getMake() + " model= " + super.getModel() + " colour= " + colour + ", engineSize= " + engineSize + "]";
	}
	
	
	
	
}
