package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author KITRI
 * 정적쿼리 : 쿼리문안에 자바변수가 들어가있을 경우 DB가 인식하지 못하기 때문에 특수문자 ", ' 를이용해서 인식시켜줌 ->잘안쓴다
 * 동적쿼리 : 쿼리를 먼저 넘겨준 이후에, 자바에서 변수를 따로 정의해서 속성값을 삽입, 조작해주는 것 -> 동적쿼리만 기억
 */
public class Ex02 {
	public static void main(String[] args) {
		// 1단계 : 데이터 베이스 연결
		try {				
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
		// 2단계 : 연결을 관리하는 객체 생성	
			Connection conn = DriverManager.getConnection(url, id, pass);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("번호:");
			int bunho = sc.nextInt();
			
			System.out.println("이름:");
			String name = sc.next();
			
			System.out.println("키");
			float ki = sc.nextFloat();
			
			String sql = "insert into person values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1, bunho);
			pstmt.setString(2, name);
			pstmt.setFloat(3, ki);
			
			//executeUpdateQuery(); -> INSERT,UPDATE,DELETE (테이블 변화 잇음)
			
			int check = pstmt.executeUpdate();
			if(check > 0) System.out.println("데이터 추가 성공");
			else System.out.println("데이터 추가 실패");
			
			pstmt.close();
			conn.close();
			sc.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
