package member.file;

public class MemberVO {
	private int age;
	private String name;
	private String tel;
	private String email;
	private String nation;

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String name, int age, String tel, String email, String nation) {
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.nation = nation;
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
	//해당 포맷으로 데이터가 저장되므로 제대로 작성해야함 
	//구분자 "," , 문장 끝에 newline 사용 
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name + ", tel=" + tel + ", email=" + email + ", nation=" + nation
				+ "\n";	
	}
}
