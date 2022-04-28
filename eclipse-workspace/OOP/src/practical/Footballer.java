/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Footballer {
	
	// instance vars
	private String firstName;
	private String lastName;
	private int squadNumber;
	private int employeeNumber;
	
	// constructors
	
	/**
	 * default constructor 
	 */
	public Footballer() {
		System.out.println("About to create a football via the default constructor");
	}
	
	/**
	 * Creates a footballer with passed in details
	 * @param firstName
	 * @param lastName
	 * @param squadNumber
	 * @param employeeNumber
	 */
	public Footballer(String firstName, String lastName, int squadNumber, int employeeNumber) {
		System.out.println("Creating the footballer with the details...");
		this.firstName = firstName;
		this.lastName = lastName;
		this.squadNumber = squadNumber;
		this.employeeNumber = employeeNumber;
	}
	
	// methods
	
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
	/**
	 * @return the squadNumber
	 */
	public int getSquadNumber() {
		return squadNumber;
	}
	/**
	 * @param squadNumber the squadNumber to set
	 */
	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	}
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", lastName=" + lastName + ", squadNumber=" + squadNumber
				+ ", employeeNumber=" + employeeNumber + "]";
	}
	
	

}
