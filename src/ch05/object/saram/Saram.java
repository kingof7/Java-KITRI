package ch05.object.saram;
/**
 * 
 * @Author : 김현수
 * @Date : 2020. 4. 29.
 * @Description :  
 *
 */
public class Saram {
	private String name;
	public String address;
	public String phoneNumber;
	public String juminBunho;


	public void input(String n, String a, String p, String j) {
		name = n;
		address = a;
		phoneNumber = p;
		juminBunho = j;
	}
	
	public void output() {
		System.out.println(name + "\t" + address + "\t" + phoneNumber + "\t" + juminBunho);
	}
	
	
	
}