package main;

import student.Master;
import student.Student;

public class UniversityAPP {

	public static void main(String[] args) {
		Student student1 = new Student("VASILII PUKANOV", "TELECOMUNICATii", 85, "Engleza", "Turco - Tataro - Mongola");
		System.out.println(student1.speak());
		System.out.println("---------------------------------------------------------------------------------------------");

		Master master1 = new Master("IVAN SUSANIN", "ELECTROTEHNICA", 125, "CHINEZA", "JAPONEZA", 6258);
		System.out.println(master1.speak());
		System.out.println("---------------------------------------------------------------------------------------------");
	}

}


