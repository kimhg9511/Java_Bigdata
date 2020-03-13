package chap11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

class User implements Serializable{
	private String id;
	private String passwd;
	private String name;
	private String dong;
	private int age;

	public User(String id, String passwd, String name, String dong, int age) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.dong = dong;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passwd=" + passwd + ", name=" + name + ", dong=" + dong + ", age=" + age + "]";
	}
}

public class InputStreamReaderTest {

	InputStreamReader isr = null;
	BufferedReader bfr = null;

	public static void main(String[] args) {
		InputStreamReaderTest isrt = new InputStreamReaderTest();
		User user = isrt.getUserInfo();
		System.out.println(user);
	}

	private User getUserInfo() {
		User user = null;
		isr = new InputStreamReader(System.in);
		bfr = new BufferedReader(isr);
		try {
			System.out.println("USER INFO");
			System.out.println("=========");
			System.out.print("ID : ");
			String id = bfr.readLine();
			System.out.print("Password : ");
			String passwd = bfr.readLine();
			System.out.print("Name : ");
			String name = bfr.readLine();
			System.out.print("Dong : ");
			String dong = bfr.readLine();
			System.out.print("Age : ");
			int age = Integer.parseInt(bfr.readLine());
			user = new User(id, passwd, name, dong, age);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}
}
