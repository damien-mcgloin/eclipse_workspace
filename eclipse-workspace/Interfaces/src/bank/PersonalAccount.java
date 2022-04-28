/**
 * 
 */
package bank;

/**
 * @author damienmcgloin
 *
 */
public class PersonalAccount extends BankAccount {
	
	private String firstName;
	private String lastName;
	
	public PersonalAccount() {
		
	}
	
	public PersonalAccount(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("First name "+this.firstName);
		System.out.println("Last name "+this.lastName);
	}
	
	

}

