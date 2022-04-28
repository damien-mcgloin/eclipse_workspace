package practical2;

public class Surgeon extends Employee {

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
	public void calculateWeeklyHours(double hours) {
		double salary = (hours * this.getBaseRate()) + this.consultationFee;
		System.out.println("Salary : " + salary);
	}

	@Override
	public void printAll() {
		System.out.println("Surgeon");
		super.printAll();
		System.out.println("Specialist Area : " + this.specialistArea);
		System.out.println("Consultation Fee : " + this.consultationFee);
	}

}
