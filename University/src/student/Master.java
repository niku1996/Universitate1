package student;

public class Master implements StudentInterface {
	String name;           // numele studentului
	String departament;    // facultatea
	String wlanguage;       // limba vorbita
	String rlanguage;                  //limba scrisa
	int age;               // virsta
	int bursa;        // suma bursei acordate
	public Master(String name, String departament, int age, String wlanguage, String rlanguage, int bursa) {
		this.name = name;
		this.age = age;
		this.departament = departament;
		this.wlanguage = wlanguage;
		this.rlanguage = rlanguage;
		this.bursa = bursa;
	}

	@Override
	public String read() {
		return rlanguage;
	}
	@Override
	public String write() {
		return wlanguage;
	}
	public int bursa() {
		return bursa;
	}
	
	@Override
	public String speak() {
		return "Salut ma numesc: " + name + " sunt MASTER la facultatea: " + departament + " am " + age + " ani. \n" +
				"Citesc fluent in limba: " + read() + "\n" +
				"Scriu corect in limba: " + write() + "\n" +
				"Obtin bursa in suma de: " + bursa();
		
	}
	

}
