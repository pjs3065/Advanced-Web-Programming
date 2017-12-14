package myPackage;

import java.util.List;

public class CarFactory {
	
	public static Car makeCar(String model, int year){
		return new Car(model, year, Car.getCarMap(model));
	}
	
	public static List<Car> makeCar(List<Car> cars){
		for(Car c : cars){
			if(c.getMaker() == null)
				c.setMaker(Car.getCarMap((String)c.getModel()));
		}
		return cars;
		
	}
}
