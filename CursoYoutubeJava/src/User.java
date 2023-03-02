
public class User {
	private String firstName;
	private String lastName;
	
	 //Construtor.
	public User(String firsName, String lastName) {
		this.firstName = firsName.toUpperCase();
		this.lastName = lastName.toUpperCase();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}
	
	
	
}
