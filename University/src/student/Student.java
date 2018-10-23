package student;

public class Student implements StudentInterface {
	String name;           // numele studentului
	String departament;    // facultatea
	String wlanguage;       // limba vorbita
	String rlanguage;                  //limba scrisa
	int age;               // virsta
	
	public Student(String name, String departament, int age, String wlanguage, String rlanguage ) {
		this.name = name;
		this.age = age;
		this.departament = departament;
		this.wlanguage = wlanguage;
		this.rlanguage = rlanguage;
	}
	@Override
	public String read() {
		return rlanguage;
	}
	@Override
	public String write() {
		return wlanguage;
	}
	@Override
	public String speak() {
		return "Salut ma numesc: " + name + " sunt STUDENT la facultatea: " + departament + " am " + age + " ani. \n" +
				"Citesc fluent in limba: " + read() + "\n" +
				"Scriu corect in limba: " + write();
	}
	
	

}

