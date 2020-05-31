package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

		public static Connection getConnection() { // Connection타입의 conn객체를 리턴
			Connection conn = null;
			try {
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "java";
				String pass = "1234";
				
				conn = DriverManager.getConnection(url, id, pass);
						
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
		}
}
