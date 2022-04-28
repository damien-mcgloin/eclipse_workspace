package arrayexamples;

public class StaffMember {

	private String firstName;
	private String lastName;
	
	public StaffMember() {
		
	}
	
	
	public StaffMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "StaffMember [FirstName : " + firstName + ", Surname : " + lastName + "]";
	}
	

}
