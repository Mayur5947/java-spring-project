package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {

	private static Connection connection;

	public static synchronized Connection getConnection() {
		if (connection == null) {
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/springdb";
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		} else {
			return connection;
		}
	}

}
