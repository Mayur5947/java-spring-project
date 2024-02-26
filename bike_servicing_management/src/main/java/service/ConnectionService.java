package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
	
	private static Connection connection;
	
	public static synchronized   Connection getConnection() {
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/bike_service_management";
		if(connection==null) {
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
		else {
			return connection;
		}
	}
}
