package practical;

public class Surgeon extends Employee implements IAdministerDrugs {

	private String specialistArea;
	private double consultationFee;
	
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

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
		System.out.println(hours*(this.getBaseRate()+this.consultationFee));
		super.calculateWeeklySalary(hours);
	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Specialist Area : "+this.specialistArea+" Consultation Fee : "+this.consultationFee);
	}

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

}
