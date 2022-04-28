package practical;

public class Pharmacist extends Employee implements IAdministerDrugs {

	private int grade;
	private double bonus;
	
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void calculateWeeklyHours(double hours) {
		System.out.println((hours*this.getBaseRate())+this.bonus);

	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Grade : "+this.grade);
		System.out.printf("Bonus : %.2f\n",this.bonus);
	}

	@Override
	public boolean adminControlledDrug() {
		return true;
	}

	@Override
	public boolean adminNonControlledDrug() {
		return true;
	}

}
