package com.qa.inteheritance.vehicles;

public class Truck extends Vehicle {
	private boolean loaded;
	
	
	public Truck() {}
	
	public Truck(int numOfWheels, String make, String model, boolean loaded) {
		super(numOfWheels, make, model);
		this.loaded = loaded;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	@Override
	public String toString() {
		return "Truck [loaded=" + loaded + "]";
	}
	
	
}
