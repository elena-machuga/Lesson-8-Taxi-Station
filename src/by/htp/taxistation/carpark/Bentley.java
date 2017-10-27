package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class Bentley extends Car {
	private int numUmbrella;

	public Bentley() {
		super();
	}

	public Bentley(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, int numUmbrella) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.numUmbrella = numUmbrella;
	}

	public Bentley(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats, int numUmbrella) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.numUmbrella = numUmbrella;
	}

	public Bentley(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public Bentley(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public int getNumUmbrella() {
		return numUmbrella;
	}

	public void setNumUmbrella(int numUmbrella) {
		this.numUmbrella = numUmbrella;
	}
	
	public void generateReport(Bentley car) {
		System.out.println(car.toString());
	}
	
	@Override
	public String toString() {
		return "Bentley, model: " + getModel() + " cost: " + getCost()
				+ ", year of issue: " + getYearIssue() + ", fuel type: " + getFuel() + ", fuel consumption: "
				+ getFuelConsumption() + ", max speed: " + getMaxSpeed() + ", number of seats: " + getNumberSeats()
				+ ", has " + numUmbrella + " umbrellas for passangers.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = super.hashCode();
		result = prime * result + numUmbrella;
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Bentley)) {
			return false;
		}
		Bentley other = (Bentley) obj;
		if (getCost() != other.getCost()) {
			return false;
		}
		if (getFuel() != other.getFuel()) {
			return false;
		}
		if (Double.doubleToLongBits(getFuelConsumption()) != Double.doubleToLongBits(other.getFuelConsumption())) {
			return false;
		}
		if (getMaxSpeed() != other.getMaxSpeed()) {
			return false;
		}
		if (getModel() == null) {
			if (other.getModel() != null) {
				return false;
			}
		} else if (!getModel().equals(other.getModel())) {
			return false;
		}
		if (getNumberSeats() != other.getNumberSeats()) {
			return false;
		}
		if (getYearIssue() != other.getYearIssue()) {
			return false;
		}
		if (numUmbrella != other.numUmbrella) {
			return false;
		}
		return true;
	}
	

}
