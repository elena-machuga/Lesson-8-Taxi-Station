package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class Mazda extends Car{
	private String iStop;

	public Mazda() {
		super();
	}

	public Mazda(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, String iStop) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.iStop = iStop;
	}

	public Mazda(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats, String iStop) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.iStop = iStop;
	}

	public Mazda(String model, double cost, Fuel fuel, int yearIssue) {
		super(model, cost, fuel, yearIssue);
	}

	public Mazda(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}

	public String getiStop() {
		return iStop;
	}

	public void setiStop(String iStop) {
		this.iStop = iStop;
	}
	
	public void generateReport(Scoda car) {
		System.out.println(car.toString());
	}
	
	@Override
	public String toString() {
		String restart;
		if (!iStop.isEmpty()) {
			restart = "has system of engine restart version " + iStop;
		} else {
			restart = "doesn't have system of engine restart";
		}
		return "Mazda, model: " + getModel() + " cost: " + getCost()
				+ ", year of issue: " + getYearIssue() + ", fuel type: " + getFuel() + ", fuel consumption: "
				+ getFuelConsumption() + ", max speed: " + getMaxSpeed() + ", number of seats: " + getNumberSeats()
				+ restart + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = super.hashCode();
		result = prime * result + ((iStop == null) ? 0 : iStop.hashCode());
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
		if (!(obj instanceof Mazda)) {
			return false;
		}
		Mazda other = (Mazda) obj;
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
		if (iStop == null) {
			if (other.iStop != null) {
				return false;
			}
		} else if (!iStop.equals(other.iStop)) {
			return false;
		}
		return true;
	}
	
	

}
