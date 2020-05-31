package jdbcUtil;

public class DriverProvider {
	public void getDriver() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
