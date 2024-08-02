package test08;

public class Developer extends Employee{

	public Developer(String name, String birth, String employeedId, String dept, int salary, String field) {
		super(name, birth, employeedId, dept, salary);
		this.field = field;
		// TODO Auto-generated constructor stub
	}
	private String field;
	
	public void changeField(String fl) {
		System.out.println("개발 분야 변경");
		this.field = fl;
	}
	
	public void printDeveloperInfo() {
		super.printEmployeeInfo();
		System.out.println("개발분야 : " + field);
	}

}
