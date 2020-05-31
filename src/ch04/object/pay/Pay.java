package ch04.object.pay;

public class Pay {
	public String name;
	public int bonbong;
	public int tex;
	public int silsu;
	
	public void input(String n, int b) {
		name = n;
		bonbong = b;
	}
	public void yonsan() {
		tex = (int)(bonbong * 0.045 + 0.5);
		silsu = bonbong - tex;
	}
	
	public void output() {
		System.out.println(name + " " + bonbong + " " + tex + " " + silsu);
	}
}
