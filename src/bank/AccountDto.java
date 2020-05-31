package bank;

/**
 * @author KITRI
 *  MVC
 *  Dto : 변수같은개념
 *  
 */
public class AccountDto {
	private int num;
	private String id;
	private String name;
	private long balance;
	
	public AccountDto() {
		// TODO Auto-generated constructor stub
	}
	public AccountDto(int num, String id, String name, long balance) {
		this.num=num;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDto [num=" + num + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
		
}
