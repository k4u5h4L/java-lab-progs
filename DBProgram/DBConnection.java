package DBProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public Connection getDBconnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Registered successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/EMP?user=root&password=");
			System.out.println("Connection successfull\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}