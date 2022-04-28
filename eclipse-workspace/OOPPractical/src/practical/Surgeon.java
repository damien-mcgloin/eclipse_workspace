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
	public void calculateWeeklyHours(double hours) {
		System.out.println((hours*this.getBaseRate())+this.consultationFee);
	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Specialist Area : "+this.specialistArea);
		System.out.printf("Consultation Fee : %.2f\n",this.consultationFee);
	}

	@Override
	public boolean adminControlledDrug() {
		return false;
	}

	@Override
	public boolean adminNonControlledDrug() {
		return true;
	}

}
