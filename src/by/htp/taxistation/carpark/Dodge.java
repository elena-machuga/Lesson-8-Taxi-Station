package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class Dodge extends Car {
	private int numAdditionalSeats;
	
	public Dodge() {
		super();
	}

	public Dodge(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, int numAdditionalSeats) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.numAdditionalSeats = numAdditionalSeats;
	}

	public Dodge(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats , int numAdditionalSeats) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.numAdditionalSeats = numAdditionalSeats;
	}

	public Dodge(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public Dodge(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public int getNumAdditionalSeats() {
		return numAdditionalSeats;
	}

	public void setNumAdditionalSeats(int numAdditionalSeats) {
		this.numAdditionalSeats = numAdditionalSeats;
	}
	
	public void generateReport(Dodge car) {
		System.out.println(car.toString());
	}

	@Override
	public String toString() {
		return "Dodge, model: " + getModel()+ " cost: " + getCost()+ ", year of issue: " + getYearIssue() + 
				", fuel type: " + getFuel() + ", fuel consumption: " + getFuelConsumption() + ", max speed: " + 
				getMaxSpeed() + ", number of seats: " + getNumberSeats() + ", possible to add " + numAdditionalSeats + " seats.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numAdditionalSeats;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Dodge)) {
			return false;
		}
		Dodge other = (Dodge) obj;
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
		if (numAdditionalSeats != other.numAdditionalSeats) {
			return false;
		}
		return true;
	}
	
	
}
