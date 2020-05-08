package com.bigdata.dto;

public class BoardDto {
	private Integer idx;
	private String author;
	private String email;
	private String homepage;
	private String title;
	private String content;
	private String pw;
	private Integer hit;
	private String regdate;
	private Integer group;
	private Integer step;
	private Integer indent;
	
	// constructor
	public BoardDto() {

	}
	public BoardDto(String author, String email, String homepage, String title, String content, String pw, Integer group) {
		super();
		this.author = author;
		this.email = email;
		this.homepage = homepage;
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.group = group;
	}
	public BoardDto(Integer idx, String author, String email, String homepage, String title, String content, String pw,
			Integer hit, String regdate) {
		super();
		this.idx = idx;
		this.author = author;
		this.email = email;
		this.homepage = homepage;
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.hit = hit;
		this.regdate = regdate;
	}
	
	public BoardDto(Integer idx, String author, String email, String homepage, String title, String content, String pw,
			Integer hit, String regdate, Integer group, Integer step, Integer indent) {
		super();
		this.idx = idx;
		this.author = author;
		this.email = email;
		this.homepage = homepage;
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.hit = hit;
		this.regdate = regdate;
		this.group = group;
		this.step = step;
		this.indent = indent;
	}
	
	// getter&setter
	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Integer getHit() {
		return hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public Integer getGroup() {
		return group;
	}
	public void setGroup(Integer group) {
		this.group = group;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Integer getIndent() {
		return indent;
	}
	public void setIndent(Integer indent) {
		this.indent = indent;
	}
	
	@Override
	public String toString() {
		return "BoardDto [idx=" + idx + ", author=" + author + ", email=" + email + ", homepage=" + homepage
				+ ", title=" + title + ", content=" + content + ", pw=" + pw + ", hit=" + hit + ", regdate=" + regdate
				+ ", group=" + group + ", step=" + step + ", indent=" + indent + "]";
	}

}
