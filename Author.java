package majorProgam1;
//This class is to create an author object
public class Author { 
	//declaration of variables
	private String firstName;
	private String lastName;
	
	//constructor that takes in first and last name
	public Author(String firstName, String lastName) {
		this.firstName = firstName;   
		this.lastName = lastName;
	}
	public Author() {
		firstName = "";
		lastName = "";
	}
	public void setFirstName(String firstName) { 
		this.firstName = firstName;	
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "Author's name: " + firstName + " " + lastName;
	}

}
