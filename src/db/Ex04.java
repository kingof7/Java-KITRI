package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			sc = new Scanner(System.in);
			System.out.println("번호: ");
			int bunho = sc.nextInt();
			
			String sql = "select * from person where bunho = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  bunho);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("정말로 삭제하시겠습니까? (y) : ");
				String value = sc.next();
				
				if(value.equalsIgnoreCase("y")) {
					String sqlDel = "delete from person where bunho = ?";
					if(pstmt != null) pstmt.close(); // 닫아주고 
					pstmt = conn.prepareStatement(sqlDel); //다시실행
					pstmt.setInt(1, bunho);
					
					int check = pstmt.executeUpdate();
					System.out.println("삭제 결과: " + check);
				}
				
				
			} else {
				System.out.println("해당 번호가 존재하지 않습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc != null) sc.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
