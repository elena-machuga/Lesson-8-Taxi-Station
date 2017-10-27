package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class Toyota extends Car {
	private boolean hibridEngine;

	public Toyota() {
		super();
	}

	public Toyota(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, boolean hibridEngine) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.hibridEngine = hibridEngine;
	}

	public Toyota(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats , boolean hibridEngine) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.hibridEngine = hibridEngine;
	}

	public Toyota(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public Toyota(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public boolean isHibridEngine() {
		return hibridEngine;
	}

	public void setHibridEngine(boolean hibridEngine) {
		this.hibridEngine = hibridEngine;
	}
	
	public void generateReport(Toyota car) {
		System.out.println(car.toString());
	}

	@Override
	public String toString() {
		String engine;
		if (isHibridEngine() == true) {
			engine = "has";
		} else {
			engine = "no";
		}
		return "Toyota, model: " + getModel()+ engine + " Hibrid Engine, "  + " cost: " + getCost()+ ", year of issue: " + getYearIssue() 
				+ ", fuel type: " + getFuel() + ", fuel consumption: " + getFuelConsumption() + ", max speed: "
				+ getMaxSpeed() + ", number of seats: " + getNumberSeats() + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = super.hashCode();
		result = prime * result + (hibridEngine ? 1231 : 1237);
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
		if (!(obj instanceof Toyota)) {
			return false;
		}
		Toyota other = (Toyota) obj;
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
		if (hibridEngine != other.hibridEngine) {
			return false;
		}
		return true;
	}

	

	
}
