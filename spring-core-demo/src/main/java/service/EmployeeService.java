package service;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
import repository.EmployeeRepository;

public class EmployeeService {

	// EmployeeRepository repository = new EmployeeRepository();
	Scanner scanner = new Scanner(System.in);

	public void insertEmployee() throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		EmployeeRepository repository = (EmployeeRepository) context.getBean("employeeRepository");
		// Employee employee = new Employee();
		System.out.println("enter employee id ");
		int id = scanner.nextInt();

		System.out.println("enter name ");
		String name = scanner.next();

		System.out.println("enter address");
		String address = scanner.next();

		System.out.println("enter phone");
		long phone = scanner.nextLong();

		System.out.println("enter email");
		String email = scanner.next();

		employee.setId(id);
		employee.setName(name);
		employee.setPhone(phone);
		employee.setAddress(address);
		employee.setEmail(email);
		repository.insertEmployee(employee);
	}

}
