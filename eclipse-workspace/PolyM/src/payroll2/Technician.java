package payroll2;

public class Technician extends Employee {
	
	private String certification;
	
	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}	
	
	@Override
	public void calculateWages(int hoursWorked) {
		System.out.println("Name "+this.getName());
		System.out.println("Job Title "+this.getJobTitle());
		System.out.println("Pay "+(hoursWorked * 10 *3));
	}

}
