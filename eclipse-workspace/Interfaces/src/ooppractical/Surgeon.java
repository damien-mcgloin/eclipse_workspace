/**
 * 
 */
package ooppractical;

/**
 * @author damienmcgloin
 *
 */
public class Surgeon extends Employee implements IAdministerDrugs {

	private String specialistArea;
	private double consultationFee;

	/**
	 * 
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f ", this.getFirstName(),
				this.getLastName(), "Surgeon", hours, this.getBaseRate(), this.consultationFee,
				(hours * this.getBaseRate() + this.consultationFee));
	}

	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Specialist Area : %s, Consultation Fee :£%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getSpecialistArea(),
				this.getConsultationFee());
	}

	/**
	 * 
	 */
	@Override
	public boolean adminControlledDrug() {
		
		return false;
	}

	/**
	 * 
	 */
	@Override
	public boolean adminNonControlledDrug() {
		
		return true;
	}


}
