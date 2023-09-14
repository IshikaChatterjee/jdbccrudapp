package javacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection con;
	
	public static Connection createC() throws SQLException {
		
		//load driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//create connection
			
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/student";
			con = DriverManager.getConnection(url, user, password);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Connection) con;


	}

}