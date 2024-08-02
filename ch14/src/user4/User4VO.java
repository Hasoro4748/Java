package user4;

public class User4VO {
	private String uid;
	private String name;
	private int age;
	private char gender;
	private String hp;
	private String addr;
	
	
	public User4VO() {
		
	}


	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "User4VO [uid=" + uid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", hp=" + hp
				+ ", addr=" + addr + "]";
	}


	public User4VO(String uid, String name, char gender, int age, String hp, String addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hp = hp;
		this.addr = addr;
	}
	
	
}
