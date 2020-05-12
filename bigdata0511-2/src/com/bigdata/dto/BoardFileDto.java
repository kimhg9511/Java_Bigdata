package com.bigdata.dto;

public class BoardFileDto {
	int idx;
	String name;
	String email;
	String homepage;
	String title;
	String content;
	String pw;
	int hit;
	String regdate;
	int group;
	int step;
	int indent;
	String filename;

	public BoardFileDto() {
	}

	// select 용
	public BoardFileDto(int idx, String name, String email, String homepage, String title, String content, String pw,
			int hit, String regdate, int group, int step, int indent, String filename) {
		super();
		this.idx = idx;
		this.name = name;
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
		this.filename = filename;
	}

	// insert 용
	public BoardFileDto(String name, String email, String homepage, String title, String content, String pw, String filename) {
		super();
		this.name = name;
		this.email = email;
		this.homepage = homepage;
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.filename = filename;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
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

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "BoardFileDto [idx=" + idx + ", name=" + name + ", email=" + email + ", homepage=" + homepage
				+ ", title=" + title + ", content=" + content + ", pw=" + pw + ", hit=" + hit + ", regdate=" + regdate
				+ ", group=" + group + ", step=" + step + ", indent=" + indent + ", filename=" + filename + "]";
	}
	
	



}
