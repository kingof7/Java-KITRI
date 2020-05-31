package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbcUtil.ConnectionProvider;
import jdbcUtil.JdbcUtil;

/**
 * @author KITRI
 *  
 */
public class AccountDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = null;
	
	private Scanner sc = null;
	private AccountDto accountDto = null;
	
	public void makAccount() {		// 1.계좌개설
		sc = new Scanner(System.in);
		accountDto = new AccountDto();
		
		System.out.println("계좌번호");
		accountDto.setId(sc.next());
		
		System.out.println("이름");
		accountDto.setName(sc.next());
		
		System.out.println("입금액");
		accountDto.setBalance(sc.nextLong());
		
		System.out.println(accountDto.toString());
		
		try {
			//ConnectionProvider cp = new ConnectionProvider(); 
			conn = ConnectionProvider.getConnection(); // ConnectionProvider 클래스로부터 conn을 리턴받음
			sql = "insert into bank values(bank_num_sql.nextval,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  accountDto.getId()); // DB로들어감
			pstmt.setString(2,  accountDto.getName());
			pstmt.setLong(3,  accountDto.getBalance());			
			
			int check = pstmt.executeUpdate();
			System.out.println("Insert Result:" + check);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {			
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
				//view -> dto -> dao -> db
	}
	
	public void deposit() {
		accountDto = new AccountDto();
		sc = new Scanner(System.in);
		
		System.out.println("계좌번호: ");
		accountDto.setId(sc.next());
		
		try {
			conn = ConnectionProvider.getConnection();
			sql = "select balance from bank where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  accountDto.getId());
		    rs = pstmt.executeQuery();
		    
		    if(rs.next()) { // 튜플이 있으면
		    	//System.out.println(rs.getLong("balance"));
		    	System.out.println("입금액");
		    	long money = sc.nextLong();
		    	
		    	accountDto.setBalance(rs.getLong("balance") + money); // 기존 금액에 더해줌
		    	JdbcUtil.close(pstmt); // 종료
		    	
		    	sql = "update bank set balance =? where id = ?"; // 더한 값을 다시 set시켜주는 쿼리실행
		    	pstmt = conn.prepareStatement(sql);
		    	pstmt.setLong(1, accountDto.getBalance()); // DB로들어감
		    	pstmt.setString(2,  accountDto.getId());
		    	
		    	int check = pstmt.executeUpdate();
		    	System.out.println("deposit Up:" + check);
		    	
		    }else {
		    	System.out.println("계좌번호가 존재하지 않습니다.");
		    }
		    
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void withdraw() {
		accountDto = new AccountDto();
		sc = new Scanner(System.in);
		
		System.out.println("계좌번호: ");
		accountDto.setId(sc.next());
		
		System.out.println("출금액: ");
		long money = sc.nextLong();
		
		try {
			conn = ConnectionProvider.getConnection();
			sql = "select balance from bank where id=? and balance >= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  accountDto.getId()); //첫번째 물음표
			pstmt.setLong(2,  accountDto.getBalance());
			rs=pstmt.executeQuery(); //테이블의 변화가 없으므로 update 안됨
			
			if(rs.next()) {
				accountDto.setBalance(rs.getLong("balance") - money);
				JdbcUtil.close(pstmt);
				
				sql="update bank set balance = ? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, accountDto.getBalance());
				pstmt.setString(2,  accountDto.getId());
				int check = pstmt.executeUpdate();
				System.out.println("Withdraw up" + check);
				
			}else {
				System.out.println("계좌번호 또는 잔액을 확인하세요.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void showData() {	 	//전체 출력
		conn = ConnectionProvider.getConnection();
		ArrayList<AccountDto> list = new ArrayList<>();
		
		try {
			sql="select * from bank order by num asc";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) { //boolean
				accountDto = new AccountDto();
				accountDto.setNum(rs.getInt("num"));
				accountDto.setId(rs.getString("id"));
				accountDto.setName(rs.getString("name"));
				accountDto.setBalance(rs.getLong("balance"));
				
				list.add(accountDto); //한사람 한사람의 데이터
			}
			for(int i=0;i<list.size();i++) {
				AccountDto dto = list.get(i);
				System.out.println(dto.getNum()+"\t"+dto.getId()+"\t"
											+dto.getName() + "\t" + dto.getBalance());
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

	public void inquire() {
		accountDto = new AccountDto();
		sc = new Scanner(System.in);
		
		System.out.println("계좌번호: ");
		accountDto.setId(sc.next());
		
		try {
			conn = ConnectionProvider.getConnection();
			sql = "select balance from bank where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  accountDto.getId()); //첫번째 물음표		
			rs=pstmt.executeQuery(); //테이블의 변화가 없으므로 update 안됨
			
			//System.out.println(accountDto.getBalance());		// setBalance 시키기전에는 0으로 초기화되어있다 (전역변수니까)
			
			if(rs.next()) {
				accountDto.setBalance(rs.getLong("balance"));
				System.out.println(accountDto.getBalance());			
			}else {
				System.out.println("계좌번호를 확인하세요.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}	

