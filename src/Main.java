import Car.Car;
import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Bob","Builder","manager",
                "bb123@example.com",12365478,35);
        employee1.workWithTables();




        Car car1=new Car("mustang","Gas engine");
        car1.Start();


    }
}