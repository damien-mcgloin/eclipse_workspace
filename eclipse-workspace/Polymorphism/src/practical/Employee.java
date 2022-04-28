/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public abstract class Employee {

	private String firstName;
	private String lastName;
	private double baseRate;

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, double baseRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
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

	/**
	 * 
	 * @return
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * 
	 * @param baseRate
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}

	/**
	 * 
	 * @param hours
	 */
	public abstract void calculateWeeklySalary(double hours);

	/**
	 * Displays the employee's details
	 */
	public void printAll(){
		System.out.printf("[%-10s] %-20s %-20s £%.2f","Employee",this.firstName, this.lastName, this.baseRate);
	}
	

}
