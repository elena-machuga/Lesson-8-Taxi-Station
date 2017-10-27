package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class BMW extends Car {
	private boolean liftBack;

	public BMW() {
		super();
	}

	public BMW(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, boolean liftBack) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.liftBack = liftBack;
	}

	public BMW(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel, int numberSeats,
			boolean liftBack) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.liftBack = liftBack;
	}

	public BMW(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public BMW(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public boolean isLiftBack() {
		return liftBack;
	}

	public void setLiftBack(boolean liftBack) {
		this.liftBack = liftBack;
	}

	public void generateReport(BMW car) {
		System.out.println(car.toString());
	}

	@Override
	public String toString() {
		String lift;
		if (isLiftBack() == true) {
			lift = "has";
		} else {
			lift = "no";
		}
		return "BMW, model: " + getModel() + lift + " Lift Back option, " + " cost: " + getCost()
				+ ", year of issue: " + getYearIssue() + ", fuel type: " + getFuel() + ", fuel consumption: "
				+ getFuelConsumption() + ", max speed: " + getMaxSpeed() + ", number of seats: " + getNumberSeats()
				+ ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (liftBack ? 1231 : 1237);
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
		if (!(obj instanceof BMW)) {
			return false;
		}
		BMW other = (BMW) obj;
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
		if (liftBack != other.liftBack) {
			return false;
		}
		return true;
	}

}
