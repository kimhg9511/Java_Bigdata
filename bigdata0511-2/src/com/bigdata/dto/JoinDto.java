package com.bigdata.dto;

public class JoinDto {
	private int idx;
	private String id;
	private String pw;
	private String name;
	private String nickname;
	private String email;
	private String regdate;
	
	public JoinDto() {
	}
	
	// insert 용 생성자
	public JoinDto(String id, String pw, String name, String nickname, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
	}
	
	// select 용 생성자
	public JoinDto(int idx, String id, String pw, String name, String nickname, String email, String regdate) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.regdate = regdate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	@Override
	public String toString() {
		return "JoinDto [idx=" + idx + ", id=" + id + ", pw=" + pw + ", name=" + name + ", nickname=" + nickname
				+ ", email=" + email + ", regdate=" + regdate + "]";
	}
	
	
}
