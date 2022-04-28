package payroll2;

public class Lecturer extends Employee {
	
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void calculateWages(int hoursWorked) {
		System.out.println("Name "+this.getName());
		System.out.println("Job Title "+this.getJobTitle());
		System.out.println("School "+this.school);
		System.out.println("Pay "+hoursWorked * 2);
	}

}
