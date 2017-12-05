package myPackage;

public class Car {

	private String model;
	private int year;
	private String maker;

	public Car() {
	}

	public Car(String model, int year, String maker) {
		setModel(model);
		setYear(year);
		setMaker(maker);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void printInfo() {
		System.out.println("Model : " + getModel() + " Year : " + getYear() + " Maker : " + getMaker());
	}
}
