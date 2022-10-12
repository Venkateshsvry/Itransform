package Collections;

public class Contact {
	
	@Override
	public String toString() {
		return  Name+ phoneNumber + Email;
	}
	public Contact(Long phoneNumber, String name, String email, Gender values) {
		this.phoneNumber = phoneNumber;
		Name = name;
		Email = email;
		
	}
	Long phoneNumber;
	String Name;
	String Email;
	public enum Gender{female,male};
	

}
