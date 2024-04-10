package ex3;

public class Person {

	private String name;
    private int id;
	private static int uniqueid = 0; 
	
	public Person(String name) {
		this.name = name;
        id = uniqueid;
		uniqueid++;
		//System.out.println("this person's id is" + this.id);
	}
	
	public int getid() {
		return id;
	}

    public String toString() {
        return "Person " + name + " with id " + id;
    }
	
	public static void main(String[] args) {
		Person Jim= new Person("Jim");
		Person Sarah= new Person("Sarah");
		Person Rachel= new Person("Rachel");
		Quarantine Galesburg= new Quarantine();
		Quarantine Iowa= new Quarantine();
		Galesburg.addPerson(Jim); //adds Jim once to city
		Iowa.addPerson(Jim); //adds Jim to state
		Iowa.addPerson(Rachel);//adds Rachel to state
		Galesburg.addPerson(Jim);//add Jim again to Galesburg
		System.out.println(Galesburg);//prints out Jim only once and does not repeat
		System.out.println(Iowa);
	}

}
