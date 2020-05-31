package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author KITRI Person Table : Update
 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = null;

		// DB연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 연결 관리
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 작업관리 - PreparedStatement, 결과처리 - ResultSet / int, 종료 - 각각의 close()

		try { // 데이터가 있는지 확인
			sc = new Scanner(System.in);
			System.out.print("번호: ");
			int bunho = sc.nextInt();

			String sql = "select * from person where bunho = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);

			// 레코드(select)로 넘어오면 ResultSet으로
			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getInt("bunho") + "\t" + rs.getString("name") + "\t" + rs.getFloat("ki"));

				System.out.println("키 수정: ");
				float ki = sc.nextFloat();

				String sqlUp = "update person set ki=? where bunho = ?";
				pstmt = conn.prepareStatement(sqlUp);
				pstmt.setFloat(1, ki);
				pstmt.setInt(2, bunho);

				int check = pstmt.executeUpdate();
				System.out.println("수정 확인" + check);

			} else {
				System.out.println("해당 번호가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (sc != null)
					sc.close();
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
