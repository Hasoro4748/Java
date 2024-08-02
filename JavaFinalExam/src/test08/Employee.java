package test08;

public class Employee extends Person{

	public Employee(String name, String birth, String employeedId, String dept, int salary) {
		super(name, birth);
		this.employeedId = employeedId;
		this.dept = dept;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	private String employeedId;
	private String dept;
	private int salary;
	
	public void raiseSalary(int a) {
		System.out.println("급여 인상");
		salary = salary + a;
	}
	public void changeDepartment(String dp) {
		System.out.println("부서 변경");
		this.dept = dp;
	}
	
	public void printEmployeeInfo() {
		// TODO Auto-generated method stub
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + employeedId);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
	}
}
