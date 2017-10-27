package by.htp.taxistation;

import by.htp.taxistation.carpark.Car;

public class TaxiStation {

	// private List<Car> taxiPark;
	private Car[] taxiPark;
	private static int numCars = 0;

	// public TaxiStation() {
	// taxiPark = new ArrayList<>();
	// }

	public TaxiStation() {

		taxiPark = new Car[50];
	}

	public static int getNumCars() {
		return numCars;
	}
	
	

	// public void addCar(Car car) {
	// taxiPark.add(car);
	// }
	//
	// public void removeCar(Car car) {
	// taxiPark.remove(car);
	// }

	public Car[] getTaxiPark() {
		return taxiPark;
	}

	public void addCar(Car car) {
		if (numCars < taxiPark.length) {
			taxiPark[numCars] = car;
			numCars++;
		} else {
			System.out.println("The park is full.");
		}
	}
	
	// public void generateReport() {
	// System.out.println("Park report");
	// System.out.println("Total number of cars in the park " + numCars);
	// for (int i = 0; i < numCars; i++) {
	// System.out.println("Car: " + taxiPark.get(i).toString());
	// }
	// }

	public void generateReport() {
		System.out.println("Park report");
		System.out.println("Total number of cars in the park " + numCars);
		for (int i = 0; i < numCars; i++) {
			System.out.println("Car: " + taxiPark[i].toString());
		}
	}

}
