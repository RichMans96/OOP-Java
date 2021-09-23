package com.qa.encapsulation.model;

public class Car {
	private int numOfWheels;
	private String make;
	private String model;
	private String colour;
	private boolean hasSunRoof;
	
	
	public Car(int numOfWheels, String make, String model, String colour, boolean hasSunRoof) {
		this.numOfWheels = numOfWheels;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.hasSunRoof = hasSunRoof;
	}

	public Car(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public Car() {
		this.numOfWheels = 4;
	}


	public int getNumOfWheels() {
		return numOfWheels;
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


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean getHasSunRoof() {
		return hasSunRoof;
	}


	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}
	
	
}
