/**
 * 
 */
package staffadmin;

/**
 * @author damienmcgloin
 *
 */
public class Lecturer extends Employee implements IPayable {

	private String school;
	
	/**
	 * 
	 */
	public Lecturer() {
		
	}

	/**
	 * @param employeeNumber
	 * @param name
	 */
	public Lecturer(String employeeNumber, String name, String school) {
		super(employeeNumber, name);
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

	@Override
	public void CalculateWages(double hrsWorked, double payRate) {
		System.out.println(hrsWorked*payRate);
	}

}
