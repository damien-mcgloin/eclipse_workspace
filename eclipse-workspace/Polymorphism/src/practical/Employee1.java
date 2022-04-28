/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public abstract class Employee1 {

	private String firstName;
	private String lastName;
	private double baseRate;
	
	/**
	 * 
	 */
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee1(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
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
	
	public double getBaseRate() {
		return baseRate;
	}
	
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	public abstract void calculateWeeklySalary(double hours);
	
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f","Employee",this.firstName, this.lastName, this.baseRate);
	}

}
