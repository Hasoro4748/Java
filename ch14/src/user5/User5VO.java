package user5;

public class User5VO {
	private String seq;
	private String name;
	private char gender;
	private int age;
	private String addr;
	public User5VO() {
		
	}
	public User5VO(String seq, String name, char gender, int age, String addr) {
		super();
		this.seq = seq;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}
	public String getseq() {
		return seq;
	}
	public void setseq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User5VO [seq=" + seq + ", name=" + name + ", gender=" + gender + ", age=" + age + ", addr=" + addr
				+ "]";
	}
	
}
