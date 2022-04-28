package payroll;

public class Janitor extends Employee {

	private String qualification;
	
	
	
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}



	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	@Override
	public void calculateWeeklyWages(int hoursWorked) {
		System.out.println("Name "+this.getName());
		System.out.println("Job Title "+this.getJobTitle());
		System.out.println("Qualifications "+this.qualification);
		System.out.println("Wages "+(hoursWorked * 10 * 2.5));
	}
	
}
