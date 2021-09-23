package com.qa.abstraction;

import com.qa.inteheritance.garage.Garage;
import com.qa.inteheritance.vehicles.Boat;
import com.qa.inteheritance.vehicles.Car;
import com.qa.inteheritance.vehicles.Truck;
import com.qa.inteheritance.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		
		Vehicle ferrari = new Car(4, "Ferrari", "Spyder", "Red", 9);
		Vehicle ford = new Car(4, "Ford", "Fiesta", "Blue", 1);
		Vehicle bigTruck = new Truck(16, "Volvo", "Truck", true);
		Vehicle boat = new Boat("Yacht", 0, "Super", "Duper");
		
		
		garage.add(boat);
		garage.add(ferrari);
		garage.add(ford);
		garage.add(bigTruck);
		
		garage.allBills();
		
		garage.fix(ferrari);
	}

}
