package practical;

public class Footballer1 {
	
	private String firstName;
	private String lastName;
	private int squadNumber;
	private int employeeNumber;
	
	/**
	 * default constructor
	 */
	public Footballer1() {
		System.out.println("About to create a footballer class");
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param squadNumber
	 * @param employeeNumber
	 */
	public Footballer1(String firstName, String lastName, int squadNumber, int employeeNumber) {
		System.out.println("Creating the footballer with details");
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = squadNumber;
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public Footballer1(String firstName, String lastName, int employeeNumber) {
		System.out.println("Creating the footballer with details");
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.setSquadNumber(squadNumber);
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
	/**
	 * @return the squadNumber
	 */
	public int getSquadNumber() {
		return squadNumber;
	}
	/**
	 * Sets the squad number
	 * @param squadNumber the squadNumber to set limited to 1 - 30 (inclusive)
	 */
	public void setSquadNumber(int squadNumber) {
		if (squadNumber>0 && squadNumber<31) {
			this.squadNumber = squadNumber;
		} else {
			System.out.println("Sorry number outside range - set later");
			this.squadNumber=-999;
		}
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
		return "Footballer1 [firstName=" + firstName + ", lastName=" + lastName + ", squadNumber=" + squadNumber
				+ ", employeeNumber=" + employeeNumber + "]";
	}
	
	

}
