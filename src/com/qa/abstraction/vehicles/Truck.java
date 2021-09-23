package com.qa.abstraction.vehicles;

public class Truck extends Vehicle implements HasWheels {
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
	
	
	@Override
	public void drive() {
		System.out.println("I drive like a truck");
		
	}

	@Override
	public void changeWheels() {
		System.out.println("blhal bhafisujdhfoiuah");
		
	}

	@Override
	public void direction() {
		// TODO Auto-generated method stub
		
	}

}
