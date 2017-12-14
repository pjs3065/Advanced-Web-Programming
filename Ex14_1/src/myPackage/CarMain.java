package myPackage;
 
import org.springframework.context.*;
import org.springframework.context.support.*;
 
public class CarMain {
    public static void main(String[] args) {
    	Car.setCarMap();
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
       for (int i = 1; i <= 4; i ++) {
        	Employee employee = (Employee)context.getBean("employee" + i);
            employee.printInfo();
            System.out.println("------------");
        }
    }
}