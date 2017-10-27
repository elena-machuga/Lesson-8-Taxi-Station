package by.htp.taxistation.employees;

import by.htp.taxistation.TaxiStation;
import by.htp.taxistation.carpark.Car;

public class Accountant extends Person {
	private String electronicSignature;

	public Accountant() {
		super();
	}

	public Accountant(String name, double salary) {
		super(name, salary);
	}
	
	public Accountant(String name, double salary, String electronicSignature) {
		super(name, salary);
		this.electronicSignature = electronicSignature;
	}

	public String getElectronicSignature() {
		return electronicSignature;
	}

	public void setElectronicSignature(String electronicSignature) {
		this.electronicSignature = electronicSignature;
	}
	
	public void countCost(Car[] park) {
		double cost = 0;
		for (int i = 0; i < TaxiStation.getNumCars(); i++) {
			cost += park[i].getCost();
		}
		System.out.println("Total cost of cars " + cost);
	}
		
}
