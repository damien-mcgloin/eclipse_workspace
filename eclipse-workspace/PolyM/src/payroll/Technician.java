package payroll;

public class Technician extends Employee {

	private String qualification;
	
	/**
	 * @return the hobby
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param hobby the hobby to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public void calculateWages(int hoursWorked) {
		System.out.println("Name : "+this.getName());
		System.out.println("Job title : "+this.getJobTitle());
		System.out.println("Qualification : "+this.qualification);
		System.out.println("Pay : "+(hoursWorked * 10 * 3));
	}
}
