package ex4;

import java.util.LinkedList;

public class Main {		
  
  public static void addPatient(Person p, LinkedList<Person> user){
    if (!(user.contains(p)))
      user.addLast(p);
  } 

  public static void PrintInContact(LinkedList<Person> user){ 
    System.out.println("IDs of people in quarantine: ");
    for (int i = 0; i<user.size(); i++){
      if (user.get(i).status.equals("yellow")){
        System.out.println(user.get(i).ID);
      }
    }
  } 

  public static void PrintTestedPositive(LinkedList<Person> user){
    System.out.println("IDs of people who tested positive: ");
    for (int i = 0; i<user.size(); i++){
      if (user.get(i).status.equals("red")){
        System.out.println(user.get(i).ID);
      }
    } 
  } 

  public static void PrintCovidFree(LinkedList<Person> user){
    System.out.println("IDs of people out of quarantine: ");
    for (int i = 0; i<user.size(); i++){
      if (user.get(i).status.equals("green")){
        System.out.println(user.get(i).ID);
      }
    } 
  } 
  public static void GetNumQuarantine(LinkedList<Person> user){
    System.out.print("Number of people in quarantine: ");
    int isolated = 0;
    for (int i = 0; i<user.size(); i++){
      if ((user.get(i).status.equals("yellow"))||(user.get(i).status.equals("red"))){
        isolated++;
      }
    }
    System.out.println(isolated);
  } 
  public static void GetNumPositive(LinkedList<Person> user){
    System.out.print("Number of people tested positive: ");
    int testedPositive = 0;
    for (int i = 0; i<user.size(); i++){
      if (user.get(i).status.equals("red")){
        testedPositive++;
      }
    } 
    System.out.println(testedPositive);
  } 

  public static void IsHealthy(Person p){
    p.status = "green";
  }

  public static void HasCovid(Person p){
    p.status = "red";
  }

	public static void main(String[] args) {
		// adding people that should be in quarantine
        Person Patient1 = new Person(100001, "yellow");
        Person Patient2 = new Person(100002, "yellow");
        Person Patient3 = new Person(100003, "yellow");
        Person Patient4 = new Person(100004, "yellow");
        Person Patient5 = new Person(100005, "yellow");

        // Creating a collection of people who should be isolated
            LinkedList<Person> users = new LinkedList<Person>();
    
        // adding patients to the System
        addPatient(Patient1, users);
        addPatient(Patient2, users);
        addPatient(Patient2, users); //should not include same person twice! This is a test! 
        addPatient(Patient3, users);
        addPatient(Patient4, users);
        addPatient(Patient5, users);

        // Patient3 was identified as a contact, but apparently is vaccinated
        IsHealthy(Patient3);

        // Patient 4 tested positive
        HasCovid(Patient4);

        // print all in quarantine
        PrintInContact(users);

        // print yellow group
        PrintInContact(users); 
        
        // print red group
        PrintTestedPositive(users);

        // print green group
        PrintCovidFree(users); 

        // print number of people in quarantine
        GetNumQuarantine(users); 

        // print number of positive
        GetNumPositive(users); 

	}
}
