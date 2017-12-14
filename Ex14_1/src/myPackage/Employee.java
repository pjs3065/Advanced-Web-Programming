package myPackage;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Car> cars;
	

	public Employee(){ }
	public Employee(int id, String name){ 
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, List<Car> cars){ 
		this.id = id;
		this.name = name;
		this.cars = cars;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void printInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		for(Car c : this.cars) c.printInfo();
		}
}
