package payroll;

public class Lecturer extends Employee {
	
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public void calculateWages(int hoursWorked) {
		System.out.println("Name : "+this.getName());
		System.out.println("Job title : "+this.getJobTitle());
		System.out.println("School : "+this.school);
		System.out.println("Pay : "+(hoursWorked * 10 * 2));
	}

}
