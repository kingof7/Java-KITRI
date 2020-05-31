package api01.Object;

public class Member {
	
	private String id;	//abc123, pw123, kim
	private String pwd;
	
		public Member(String id, String pwd) {
			this.id = id; // 
			this.pwd = pwd;
		}
		
		//커스터마이징
		@Override
		public boolean equals(Object obj) {	// lee abc123, pw123	//재정의
			if(obj instanceof Member) {
				Member lee = (Member) obj; //다운캐스팅
					//System.out.println(lee.id);
					if(this.id.equals(lee.id) && pwd.equals(lee.pwd)) { 
						//this.id는 kim의 id이고, lee.id는 인스턴스화한 lee의 id이다.
						return true;
					}
			}
			
			return false;
			
		}

		@Override
		public String toString() {
			return "Member [id=" + id + ", pwd=" + pwd + "]";
		}	
	
	

}
