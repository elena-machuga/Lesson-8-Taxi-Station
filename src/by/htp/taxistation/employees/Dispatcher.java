package by.htp.taxistation.employees;

import java.util.ArrayList;
import java.util.List;

import by.htp.taxistation.TaxiStation;
import by.htp.taxistation.carpark.Car;

public class Dispatcher extends Person{
	private String multilinePhone;

	public Dispatcher() {
		super();
	}

	public Dispatcher(String name, double salary) {
		super(name, salary);
	}
	
	public Dispatcher(String name, double salary, String multilinePhone) {
		super(name, salary);
		this.multilinePhone = multilinePhone;
	}

	public String getMultilinePhone() {
		return multilinePhone;
	}

	public void setMultilinePhone(String multilinePhone) {
		this.multilinePhone = multilinePhone;
	}
	
	public void findBySpeed(int min, int max, Car[] park) {
		List<Car> result = new ArrayList<>();
		for (int i = 0; i < TaxiStation.getNumCars(); i++) {
			if (park[i].getMaxSpeed() >= min && park[i].getMaxSpeed() <= max) {
				result.add(park[i]);
			}
		}
		for (Car car : result) {
			System.out.println(car.toString());
		}
	}
}
