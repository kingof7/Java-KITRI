package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex01 {
	public static void main(String[] args) {
		// 1단계 : 데이터 베이스 연결
		
		try {	
			String className = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver.class이름
			Class.forName(className);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2단계 : 연결을 관리하는 객체 생성
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, pass);
			
			// 3단계 : 작업관리 (Query)
			//자바는 쿼리문 인식하지못함
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept");
			ResultSet rs = pstmt.executeQuery(); // 오라클에서 쿼리실행후에 rs객체에 정보담음
			//executeUpdateQuery(); -> INSERT,UPDATE,DELETE (테이블 변화 잇음)
			
			while(rs.next()) { //오라클에서 넘어온게 있니 (한 튜플씩 읽어옴)
				//속성마다 객체로 정의
				int deptNo = rs.getInt("deptno");
				String deptName = rs.getString("dname");
				String loc = rs.getString("loc");
				//뿌려
				System.out.println(deptNo + "\t" + deptName + "\t" + loc);
			}
			
			// 5단계: 종료
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		// 4단계 : 결과처리
		// 5단계 : 종료
		
	}
}
