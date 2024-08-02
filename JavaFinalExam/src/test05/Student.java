package test05;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	public Student(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	public void enrollSubject(Subject sj) {
		System.out.println(name + " - " + sj.getName() + " 과목 신청완료");
		sj.addStudent(this);
		subjects[subjectCount] = sj;
		subjectCount++;
	}
	public void setScore(Subject sj, int sc) {
		for(int i = 0 ; i < subjectCount; i++) {
			if(sj.getName().equals(subjects[i].getName())) {
				scores[i] = sc;
				break;
			}
		}
		System.out.println(getName() + " : " + sj.getName() + " 점수 입력완료");
	}
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		for(int i = 0 ; i < subjectCount; i++) {
			System.out.println(" - " + subjects[i].getName()+":"+scores[i]);
		}
	}
	public String getName(){
		return name;
	}
	
}
