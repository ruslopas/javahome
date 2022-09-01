package by.itacademy.hw9.task3;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> garage = new ArrayList<>();

	public List<Vehicle> putToGarage(Vehicle... vehicles) {

		garage.add(new Car("Bmw", "Car"));
		garage.add(new Bike("Yamaha", "Bike"));
		return garage;
	}

	public List<Vehicle> putAwayFromGarage(Vehicle... vehicles) {

		garage.remove(0);
		return garage;
	}

	public void observeGarage() {
		if (garage.isEmpty()) {
			System.out.println("Garage is empty\n");
		} else {
			for (Vehicle car1 : garage) {
				System.out.printf("%s %s \n", car1.getType(), car1.getManufacturer());

			}
		}

	}

}
