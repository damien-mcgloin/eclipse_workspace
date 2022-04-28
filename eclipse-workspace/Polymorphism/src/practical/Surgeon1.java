/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Surgeon1 extends Employee1 {

	private String specialistArea;
	private double consultationFee;
	
	/**
	 * 
	 */
	public Surgeon1() {
		// TODO Auto-generated constructor stub
	}
	
	public Surgeon1(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
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
		System.out.println((hours*this.getBaseRate()+this.consultationFee));
		
	}
	
	public void printAll() {
		
	}
	
}
