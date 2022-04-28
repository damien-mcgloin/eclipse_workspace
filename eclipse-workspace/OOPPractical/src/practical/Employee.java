package practical;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double baseRate;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
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
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}
	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	public abstract void calculateWeeklyHours(double hours);
	
	public void printAll() {
		System.out.println("First Name : "+this.firstName);
		System.out.println("Last Name : "+this.lastName);
		System.out.printf("Base Rate : %.2f\n",this.baseRate);
	}

}
