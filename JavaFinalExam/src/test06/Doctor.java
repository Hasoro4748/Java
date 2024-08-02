package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	public Doctor(String name, String id, String special) {
		super();
		this.name = name;
		this.id = id;
		this.special = special;
		patients = new ArrayList<>();
	}
	public void addPatient(Patient pt){
		patients.add(pt);
	}
	@Override
	public String toString() {
		String tmp =  "의사: " + name +"(ID: "+id+", 전문분야: "+special+")" +"\n" + "담당 환자 목록:\n";
		for(Patient pt : patients) {
			tmp = tmp + pt + "\n";
		}
		return tmp;
	}
}
