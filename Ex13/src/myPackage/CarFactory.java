package myPackage;

public class CarFactory {

	public static Car makeCar(String model, int year) {
		String maker = "";
		String tempModel = model.toLowerCase();

		if (tempModel.equals("sonata"))
			maker = "Hyundai";

		return new Car(model, year, maker);
	}

	public static Car makeCar(String model, int year, String maker) {
		return new Car(model, year, maker);
	}

}
