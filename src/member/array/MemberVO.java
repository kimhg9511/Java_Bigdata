//MemberVO.java
package member.array;

public class MemberVO {        // Value Object 정의
    // 속성
    private int age;
    private String name;
    private String tel;
    private String email;
    private String nation;
    // 생성자
    public MemberVO() {
        // TODO Auto-generated constructor stub
    }

    public MemberVO(int age, String name, String tel, String email, String nation) {
        this.age = age;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.nation = nation;
    }
    // getter(), setter()
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
    //toString()
    @Override
    public String toString() {
        return "MemberVO [age=" + age + ", name=" + name + ", tel=" + tel + ", email=" + email + ", nation=" + nation
                + "]";
    }


}