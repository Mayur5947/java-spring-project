package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Employee;
import service.ConnectionService;

public class EmployeeRepository {
	
	public EmployeeRepository() {

	}

	Connection connection = ConnectionService.getConnection();

	public void insertEmployee(Employee employee) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("insert into employee values (?,?,?,?,?)");
		statement.setInt(1, employee.getId());
		statement.setString(2, employee.getName());
		statement.setString(3, employee.getAddress());
		statement.setLong(4, employee.getPhone());
		statement.setString(5, employee.getEmail());
		statement.executeUpdate();
		connection.close();
	}

	public void removeEmployee(int id) {

	}

	public void updateEmployee(Employee employee) {

	}

	public void getEmployee(int id) {

	}

	public void getAllEmployees() {

	}
}
