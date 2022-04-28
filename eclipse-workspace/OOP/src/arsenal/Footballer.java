package arsenal;

public class Footballer {

	// vars
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private int squadNumber;

	// const
	public Footballer() {
		System.out.println("about to create a baller");
	}

	public Footballer(String firstName, String lastName, int employeeNumber, int squadNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = squadNumber;
	}

	/**
	 * constructor sets all but squad number
	 * 
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public Footballer(String firstName, String lastName, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = 999;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getSquadNumber() {
		return squadNumber;
	}

	public void setSquadNumber(int squadNumber) {
		
		if (squadNumber >= 30 && squadNumber <= 100) {
			this.squadNumber = squadNumber;
		} else {
			System.out.println("Problem with range suggested for squad number");
			this.squadNumber = -1;
		}

	}
	
	public void displayDetails() {
		System.out.println("Footballer __________");
		System.out.println("First name : "+this.firstName);
		System.out.println("Last name : "+this.lastName);
		System.out.println("Squad number : "+this.squadNumber);
		System.out.println("Employee : "+this.employeeNumber);
	}
	
	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", squadNumber=" + squadNumber + "]";
	}

	// methods

}
