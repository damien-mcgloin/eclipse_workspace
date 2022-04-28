package payroll;

public class Employee {
	
	private String name;
	private String jobTitle;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void calculateWeeklyWages(int hoursWorked) {
		System.out.println("Name "+this.name);
		System.out.println("Job Title "+this.jobTitle);
		System.out.println("Wages "+hoursWorked * 10);
	}

}
