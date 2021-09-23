package com.qa.abstraction.vehicles;

public abstract class Vehicle implements SatNav {
	private int numOfWheels;
	private String make;
	private String model;
	
	
	public Vehicle() {}
	
	
	public Vehicle(int numOfWheels, String make, String model) {
		this.numOfWheels = numOfWheels;
		this.make = make;
		this.model = model;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public abstract void drive();
	
	
}
