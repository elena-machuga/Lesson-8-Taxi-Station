package by.htp.taxistation.carpark;

import by.htp.taxistation.DoorType;
import by.htp.taxistation.Fuel;

public class Scoda extends Car{
	private DoorType doorOpenMethod;

	public Scoda() {
		super();
	}

	public Scoda(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, DoorType doorOpenMethod) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.doorOpenMethod = doorOpenMethod;
	}

	public Scoda(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats, DoorType doorOpenMethod) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.doorOpenMethod = doorOpenMethod;
	}

	public Scoda(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public Scoda(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public DoorType getDoorOpenMethod() {
		return doorOpenMethod;
	}

	public void setDoorOpenMethod(DoorType doorOpenMethod) {
		this.doorOpenMethod = doorOpenMethod;
	}
	public void generateReport(Scoda car) {
		System.out.println(car.toString());
	}
	
	@Override
	public String toString() {
		return "Scoda, model: " + getModel() + " cost: " + getCost()
				+ ", year of issue: " + getYearIssue() + ", fuel type: " + getFuel() + ", fuel consumption: "
				+ getFuelConsumption() + ", max speed: " + getMaxSpeed() + ", number of seats: " + getNumberSeats()
				+ ", door type: " + doorOpenMethod + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = super.hashCode();
		result = prime * result + ((doorOpenMethod == null) ? 0 : doorOpenMethod.hashCode());
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
		if (!(obj instanceof Scoda)) {
			return false;
		}
		Scoda other = (Scoda) obj;
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
		if (doorOpenMethod == null) {
			if (other.doorOpenMethod != null) {
				return false;
			}
		} else if (!doorOpenMethod.equals(other.doorOpenMethod)) {
			return false;
		}
		return true;
	}
	
	
	
}
