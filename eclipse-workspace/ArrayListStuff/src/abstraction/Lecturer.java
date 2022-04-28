package abstraction;

public class Lecturer extends Employee {
	
	private String school;
	
	/**
	 * 
	 */
	public Lecturer() {
		
	}
	
	
	/**
	 * Construct with args
	 * @param firstName
	 * @param lastName
	 * @param school 
	 */
	public Lecturer(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.school = school;
	}



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
	
	/**
	 * 
	 */
	@Override
	public void calculateSalary(double hours, double rate) {
		System.out.println("Lecturer salary : "+(hours*rate*8));
	}
	

}
