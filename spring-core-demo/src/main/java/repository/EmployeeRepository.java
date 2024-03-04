package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	public void removeEmployee(int id) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("delete from employee where emp_id = ?");
		statement.setInt(1, id);
		statement.executeUpdate();
		connection.close();
	}

	public void updateEmployee(Employee employee) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("update employee set name = ? , address = ? , phone = ? , email = ? where emp_id  =?");
		statement.setInt(5, employee.getId());
		statement.setString(1, employee.getName());
		statement.setString(2, employee.getAddress());
		statement.setLong(3, employee.getPhone());
		statement.setString(4, employee.getEmail());
		statement.executeUpdate();
		connection.close();
	}

	public void getEmployee(int id) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from employee where emp_id = ?");
		statement.setInt(1, id);
		ResultSet resultSet =statement.executeQuery();
		while(resultSet.next()) {
			System.out.println("***********************************");
			System.out.println("employee id   :  " + resultSet.getInt(1));
			System.out.println("employee name   :  " + resultSet.getString(2));
			System.out.println("employee address   :  " + resultSet.getString(3));
			System.out.println("employee phone   :  " + resultSet.getLong(4));
			System.out.println("employee email   :  " + resultSet.getString(5));
		}
		connection.close();
	}

	public void getAllEmployees() throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from employee ");
		ResultSet resultSet =statement.executeQuery();
		while(resultSet.next()) {
			System.out.println("***********************************");
			System.out.println("employee id   :  " + resultSet.getInt(1));
			System.out.println("employee name   :  " + resultSet.getString(2));
			System.out.println("employee address   :  " + resultSet.getString(3));
			System.out.println("employee phone   :  " + resultSet.getLong(4));
			System.out.println("employee email   :  " + resultSet.getString(5));
		}
		connection.close();
	}
}
