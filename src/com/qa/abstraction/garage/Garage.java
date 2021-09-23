package com.qa.abstraction.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.inteheritance.vehicles.Boat;
import com.qa.inteheritance.vehicles.Car;
import com.qa.inteheritance.vehicles.Truck;
import com.qa.inteheritance.vehicles.Vehicle;

public class Garage {
	List<Vehicle> garage = new ArrayList<>();
	
	public void allBills() {
		for(Vehicle vehicle : garage) {
			bill(vehicle);
		}
	}
	
	public List<Vehicle> findByType(String type) {
		List<Vehicle> vehiclesOfType = new ArrayList<>();
		for(Vehicle vehicle : garage) {
			if(vehicle.getClass().getSimpleName().equals(type)) {
				vehiclesOfType.add(vehicle);
			}
		}
		return vehiclesOfType;
	}
	
	public void fix(Vehicle vehicle) {
		bill(vehicle);
	}
	
	public void add(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public void empty() {
		garage.clear();
	}
	
	public static void bill(Vehicle vehicle) {
		double baseRate = 20.25;
		if(vehicle instanceof Car) {
			System.out.println("As you have a car, your bill is " + (baseRate * 10));
		} else if(vehicle instanceof Truck) {
			System.out.println("As you have a truck, your bill is " + (baseRate * 100));
		} else if(vehicle instanceof Boat) {
			System.out.println("As you have a boat, your bill is " + (baseRate * 200));
		}
	}
}
