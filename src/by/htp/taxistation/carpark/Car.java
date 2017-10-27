package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public abstract class Car {
	private String model;
	private double cost;
	private Fuel fuel;
	private double fuelConsumption;
	private int maxSpeed;
	private int yearIssue;
	private int numberSeats;
	private static int carCount;

	public Car() {
		carCount++;
	}

	public Car(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats) {
		this.model = model;
		this.cost = cost;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
		this.yearIssue = yearIssue;
		this.fuel = fuel;
		this.numberSeats = numberSeats;
		carCount++;
	}

	public Car(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel) {
		this.model = model;
		this.cost = cost;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
		this.fuel = fuel;
		carCount++;
	}

	public Car(String model, double cost, int yearIssue, int numberSeats) {
		this.model = model;
		this.cost = cost;
		this.yearIssue = yearIssue;
		this.numberSeats = numberSeats;
		carCount++;
	}

	public Car(String model, double cost, Fuel fuel, int yearIssue) {
		this.model = model;
		this.cost = cost;
		this.fuel = fuel;
		this.yearIssue = yearIssue;
		carCount++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getYearIssue() {
		return yearIssue;
	}

	public void setYearIssue(int yearIssue) {
		this.yearIssue = yearIssue;
	}

	public int getNumberSeats() {
		return numberSeats;
	}

	public void setNumberSeats(int numberSeats) {
		this.numberSeats = numberSeats;
	}

	public static int getCarCount() {
		return carCount;
	}

	public void startEngine() {
		System.out.println("Let's go!");
	}
	
	public void stopEngine() {
		System.out.println("Stop.");
	}
		
	public void generateReport(Car car) {
		System.out.println("Total number of cars " + carCount);
		System.out.println(car.toString());
	}
	
	@Override
	public String toString() {
		return "Car model: " + model + ", cost: " + cost + ", fuel: " + fuel + ", fuel consumption: " + fuelConsumption
				+ ", max speed: " + maxSpeed + ", year of issue: " + yearIssue + ", number of seats: " + numberSeats + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
		result = prime * result + cost;
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + maxSpeed;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberSeats;
		result = prime * result + yearIssue;
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (cost != other.cost) {
			return false;
		}
		if (fuel != other.fuel) {
			return false;
		}
		if (Double.doubleToLongBits(fuelConsumption) != Double.doubleToLongBits(other.fuelConsumption)) {
			return false;
		}
		if (maxSpeed != other.maxSpeed) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
			return false;
		}
		if (numberSeats != other.numberSeats) {
			return false;
		}
		if (yearIssue != other.yearIssue) {
			return false;
		}
		return true;
	}
	
	
	
	

}
