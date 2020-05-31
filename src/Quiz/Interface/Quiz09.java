package Quiz.Interface;

interface  DataAccessObject {
	public String select();
	public String insert();
	public String update();
	public String delete();
	
}

class OracleDao implements DataAccessObject {

	@Override
	public String select() {
		// TODO Auto-generated method stub
		return "OracleDao 검색";
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "OracleDao 삽입";
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "OracleDao 수정";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "OracleDao 삭제";
	}
	
}

class MySqlDao implements DataAccessObject {

	@Override
	public String select() {
		// TODO Auto-generated method stub
		return "MySqlDao 삭제";
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "MySqlDao 삭제";
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "MySqlDao 삭제";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "MySqlDao 삭제";
	}

}

public class Quiz09 {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}
	
	public static void dbWork(DataAccessObject dao) {
		System.out.println(dao.select());
		System.out.println(dao.insert());
		System.out.println(dao.update());
		System.out.println(dao.delete());
		System.out.println();
		
	}

}
