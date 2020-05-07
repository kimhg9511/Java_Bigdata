package com.bigdata.dto;

public class MembersDto {
	private String id;
	private String password;
	private String nickname;
	private String name;
	private String email;
	private String date;
	
	public MembersDto() {
		// TODO Auto-generated constructor stub
	}

	public MembersDto(String id, String password, String nickname, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
	}

	public MembersDto(String id, String password, String nickname, String name, String email, String date) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MembersDto [id=" + id + ", password=" + password + ", nickname=" + nickname + ", name=" + name
				+ ", email=" + email + ", date=" + date + "]";
	}
	
}
