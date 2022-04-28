/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Surgeon extends Employee {

	private String specialistArea;
	private double consultationFee;
	
	/**
	 * 
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}
	
	public Surgeon(String firstName, String lastName, double baseRate,
			String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}
	
	public String getSpecialistArea() {
		return specialistArea;
	}
	
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}
	
	public double getConsultationFee() {
		return consultationFee;
	}
	
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * $%.2f = $%.2f ",
				this.getFirstName(), this.getLastName(), "Porter", hours,
				this.getBaseRate(),
				(hours * this.getBaseRate()+this.consultationFee));	
		
	}

}
