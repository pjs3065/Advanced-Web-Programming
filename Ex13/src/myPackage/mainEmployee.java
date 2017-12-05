package myPackage;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class mainEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
		printInfo(employee1);
		Employee employee2 = (Employee) context.getBean("employee2");
		printInfo(employee2);
	}

	public static void printInfo(Employee employee) {
		System.out.printf("ID : %d, Name : %s ", employee.getId(), employee.getName());
	}
}
