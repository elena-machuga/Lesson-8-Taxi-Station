package by.htp.taxistation.carpark;

import by.htp.taxistation.Fuel;

public class Tesla extends Car{
	private int oneChargeDistance;
	private int chargingTime;
	public Tesla() {
		super();
	}
	public Tesla(String model, double cost, double fuelConsumption, int maxSpeed, Fuel fuel, int oneChargeDistance, int chargingTime) {
		super(model, cost, fuelConsumption, maxSpeed, fuel);
		this.chargingTime = chargingTime;
		this.oneChargeDistance = oneChargeDistance;
	}
	public Tesla(String model, double cost, double fuelConsumption, int maxSpeed, int yearIssue, Fuel fuel,
			int numberSeats, int oneChargeDistance, int chargingTime) {
		super(model, cost, fuelConsumption, maxSpeed, yearIssue, fuel, numberSeats);
		this.chargingTime = chargingTime;
		this.oneChargeDistance = oneChargeDistance;
	}
	public Tesla(String model, double cost, Fuel fuel, int yearIssue, int oneChargeDistance, int chargingTime) {
		super(model, cost, fuel, yearIssue);
		this.chargingTime = chargingTime;
		this.oneChargeDistance = oneChargeDistance;
	}
	public Tesla(String model, double cost, int yearIssue, int numberSeats) {
		super(model, cost, yearIssue, numberSeats);
	}
	public int getOneChargeDistance() {
		return oneChargeDistance;
	}
	public void setOneChargeDistance(int oneChargeDistance) {
		this.oneChargeDistance = oneChargeDistance;
	}
	public int getChargingTime() {
		return chargingTime;
	}
	public void setChargingTime(int chargingTime) {
		this.chargingTime = chargingTime;
	}
	
	public void generateReport(Tesla car) {
		System.out.println(car.toString());
	}
	
	@Override
	public String toString() {
		return "Tesla, model: " + getModel() + " cost: " + getCost()
				+ ", year of issue: " + getYearIssue() + ", fuel type: " + getFuel() + ", fuel consumption: "
				+ getFuelConsumption() + ", max speed: " + getMaxSpeed() + ", number of seats: " + getNumberSeats()
				+ ", time to charge: " + chargingTime + " distance per one charge: " + oneChargeDistance + ".";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = super.hashCode();
		result = prime * result + chargingTime;
		result = prime * result + oneChargeDistance;
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
		if (!(obj instanceof Tesla)) {
			return false;
		}
		Tesla other = (Tesla) obj;
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
		if (chargingTime != other.chargingTime) {
			return false;
		}
		if (oneChargeDistance != other.oneChargeDistance) {
			return false;
		}
		return true;
	}
}
