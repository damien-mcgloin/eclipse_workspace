package staffadmin;

public class Employee {
	
	private String employeeNumber;
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(String employeeNumber, String name) {
		this.employeeNumber = employeeNumber;
		this.name = name;
	}
	
	/**
	 * @return the employeeNumber
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
