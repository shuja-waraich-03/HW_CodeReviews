package ex4;

public class Person {
		
    int ID; 	//unique identifying number

    //status can be an enum to make the code typesafe
    String status; // red - tested positive, yellow - identified as a contact, green - out of quarantine 
		
    Person(int ID, String status) {
			this.ID = ID;
      this.status = status;
		}
}