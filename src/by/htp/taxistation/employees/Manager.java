package by.htp.taxistation.employees;

import by.htp.taxistation.TaxiStation;
import by.htp.taxistation.carpark.Car;

public class Manager extends Person {
	private Car serviceCar;

	public Manager() {
		super();
	}

	public Manager(String name, double salary) {
		super(name, salary);
	}

	public Manager(String name, double salary, Car serviceCar) {
		super(name, salary);
		this.serviceCar = serviceCar;
	}

	public Car getServiceCar() {
		return serviceCar;
	}

	public void setServiceCar(Car serviceCar) {
		this.serviceCar = serviceCar;
	}
	
	public void sortBySpeed(Car[] park) {

		Car tmp;
		for (int i = 0; i < TaxiStation.getNumCars(); i++) {
			for (int j = 1; j < TaxiStation.getNumCars() - i; j++) {

				if (park[j - 1].getMaxSpeed() > park[j].getMaxSpeed()) {
					tmp = park[j - 1];
					park[j - 1] = park[j];
					park[j] = tmp;
				}
			}
		}
		for (int i = 0; i < TaxiStation.getNumCars(); i++) {
			System.out.println(park[i].toString());
		}
	}

}
