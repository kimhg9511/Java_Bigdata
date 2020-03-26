package chap14;

public class MemberVO {
	private int idx;
	private int age;
	private String name;
	private String tel;
	private String email;
	private String nation;
	private String regdate;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberVO(int idx, int age, String name, String tel, String email, String nation, String regdate) {
		super();
		this.idx = idx;
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.nation = nation;
		this.regdate = regdate;
	}
	
	public MemberVO(int age, String name, String tel, String email, String nation) {
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.nation = nation;
	}
	
	public MemberVO(int idx, int age, String tel, String email, String nation) {
		this.idx = idx;
		this.age = age;
		this.tel = tel;
		this.email = email;
		this.nation = nation;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String toInsertString() {
		return "MemberVO [age=" + age + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", nation=" + nation + ", regdate=" + regdate + "]";
	}
	@Override
	public String toString() {
		return "MemberVO [idx=" + idx + ", age=" + age + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", nation=" + nation + ", regdate=" + regdate + "]";
	}
	
}
