package entities;

public class PersonneAnonyme {
	
	String name;
	int birth;
	
	public PersonneAnonyme() {
		super();
	}

	public PersonneAnonyme(String name, int birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	public void seSoigner() {
		System.out.println("personnage se soigne");
	}
	
	


}
