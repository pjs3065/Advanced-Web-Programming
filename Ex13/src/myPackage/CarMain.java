package myPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Car car1 = (Car) context.getBean("car1");
		printInfo(car1);
		Car car2 = (Car) context.getBean("car2");
		printInfo(car2);
	}
	
	public static void printInfo(Car car)
	{
		car.printInfo();
	}

}
