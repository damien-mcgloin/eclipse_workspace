package practical3;

public class Surgeon extends Employee {

	private String specialistArea;
	private double consultationFee;
	
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	public Surgeon(String firstName, String lastName, double baseRate,
			String specialistArea, double consultationFee) {
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
		System.out.printf(this.getFirstName()+" "+this.getLastName()+"'s weekly salary is %.2f\n",(hours*this.getBaseRate())+this.consultationFee);
	}

	@Override
	public void printAll() {
		System.out.println("Surgeon");
		super.printAll();
		System.out.println("Specialist Area : "+this.specialistArea);
		System.out.printf("Consultation Fee : %.2f\n",this.consultationFee);
	}

}
