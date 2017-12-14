package myPackage;

import java.util.HashMap;

public class Car {
private String model;
	private int year;
	private String maker;
	
	private static HashMap<String, String> MakerList;
	
	public Car(){}
	
	public Car(String model, int year, String maker){
		this.model = model;
		this.year = year;
		this.maker = maker;
	}
	
	
	
	public void printInfo(){
		System.out.println("------car-----");
		System.out.println("model : " + this.model);
		System.out.println("year : " + this.year);
		System.out.println("maker : " + this.maker);
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
	
	
	
	public static void setCarMap(){
		MakerList = new HashMap<String, String>();
		MakerList.put("Sonata", "Hyundai");
		MakerList.put("Avante", "Hyundai");
		MakerList.put("Grandeur", "Hyundai");
		MakerList.put("Aslan", "Hyundai");
		MakerList.put("Ioniq", "Hyundai");
		MakerList.put("Accent", "Hyundai");
		MakerList.put("i40", "Hyundai");
		MakerList.put("i30", "Hyundai");
		MakerList.put("Santafe", "Hyundai");
		MakerList.put("Starex", "Hyundai");
		MakerList.put("Tuscan", "Hyundai");
		MakerList.put("K5", "KIA");
		MakerList.put("K7", "KIA");
		MakerList.put("K9", "KIA");
		MakerList.put("Stinger", "KIA");
		MakerList.put("K3", "KIA");
		MakerList.put("Pride", "KIA");
		MakerList.put("Morning", "KIA");
		MakerList.put("Ray", "KIA");
		MakerList.put("Sorento", "KIA");
		MakerList.put("Soul", "KIA");
		MakerList.put("Carnival", "KIA");
		MakerList.put("Spark", "Chevrolet");
		MakerList.put("Camaro SS", "Chevrolet");
		MakerList.put("A-Class", "Mercedes-Benz");
		MakerList.put("B-Class", "Mercedes-Benz");
		MakerList.put("C-Class", "Mercedes-Benz");
		MakerList.put("E-Class", "Mercedes-Benz");
		MakerList.put("S-Class", "Mercedes-Benz");
		MakerList.put("X-Class", "Mercedes-Benz");
		MakerList.put("Mercedes-AMG", "Mercedes-Benz");
	}
	
	public static String getCarMap(String key){
		return MakerList.get((String)key);
	}

	
	

}
