package com.stl.spring;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println(" enter choice    1  add emp  2 remove   3 update   4 get   5  get all 6 stop");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				service.insertEmployee();
				break;
			}
			case 2: {
				service.removeEmployee();
				break;
			}
			case 3: {
				service.updateEmployee();
				break;
			}
			case 4: {
				service.getEmployee();
				break;
			}
			case 5: {
				service.getAllEmployee();
				break;
			}
			case 6: {
				System.exit(0);
			}
			}
		}
	}
}
