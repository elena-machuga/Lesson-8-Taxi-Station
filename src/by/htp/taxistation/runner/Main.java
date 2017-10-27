package by.htp.taxistation.runner;

import by.htp.taxistation.DoorType;
import by.htp.taxistation.Fuel;
import by.htp.taxistation.TaxiStation;
import by.htp.taxistation.carpark.BMW;
import by.htp.taxistation.carpark.Bentley;
import by.htp.taxistation.carpark.Car;
import by.htp.taxistation.carpark.Dodge;
import by.htp.taxistation.carpark.Mazda;
import by.htp.taxistation.carpark.Scoda;
import by.htp.taxistation.carpark.Tesla;
import by.htp.taxistation.carpark.Toyota;
import by.htp.taxistation.employees.Accountant;
import by.htp.taxistation.employees.Dispatcher;
import by.htp.taxistation.employees.Manager;

public class Main {

	public static void main(String[] args) {

		Car bentley = new Bentley("SR40", 150000, 3.0, 350, Fuel.DISEL, 4);
		Car toyota = new Toyota("Camry", 25000, 2.0, 300, Fuel.PETROL, true);
		Car tesla = new Tesla("Model X", 50000, 1500, 400, Fuel.ELECTRICITY, 300, 6);
		Car scoda = new Scoda("Octavia", 14500, 1.4, 300, Fuel.PETROL, DoorType.WINGS);
		Car mazda = new Mazda("6", 16000, 1.6, 350, Fuel.GAS, "2.0");
		Car dodge = new Dodge("Caravan", 30000, 2.2, 400, Fuel.PETROL, 3);
		Car bmw = new BMW("X5", 40000, 3.0, 400, Fuel.PETROL, true);

		TaxiStation taxiStation = new TaxiStation();
		taxiStation.addCar(toyota);
		taxiStation.addCar(tesla);
		taxiStation.addCar(scoda);
		taxiStation.addCar(mazda);
		taxiStation.addCar(bmw);
		taxiStation.addCar(dodge);

		taxiStation.generateReport();
		System.out.println();

		Manager manager = new Manager("Peter", 2000, bentley);

		manager.sortBySpeed(taxiStation.getTaxiPark());
		System.out.println();

		Accountant accountant = new Accountant("Vasilij", 1000);

		accountant.countCost(taxiStation.getTaxiPark());
		System.out.println();

		Dispatcher dispatcher = new Dispatcher("Vova", 300);

		dispatcher.findBySpeed(200, 300, taxiStation.getTaxiPark());

	}

}
