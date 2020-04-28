package bigdata;

public class MembersDto {
	private String uid;
	private String upw;
	private String nick;
	private String name;
	private String email;
	private String regdate;
	
	public MembersDto() {
		// TODO Auto-generated constructor stub
	}

	public MembersDto(String uid, String upw, String nick, String name, String email) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.nick = nick;
		this.name = name;
		this.email = email;
	}
	
	public MembersDto(String uid, String upw, String nick, String name, String email, String regdate) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.nick = nick;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
