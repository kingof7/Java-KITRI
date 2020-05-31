package api06.Quiz;
class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		// 여기서 코드 작성
				
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
	
}
public class Quiz22 {

	public static void main(String[] args) {
			Member member = new Member("blue", "이파란");
			System.out.println(member.toString());			
	}

}
