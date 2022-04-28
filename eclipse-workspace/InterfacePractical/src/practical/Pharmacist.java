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

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println(hours*(this.getBaseRate()+this.bonus));
		super.calculateWeeklySalary(hours);
	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Grade : "+this.grade+" Bonus : "+this.bonus);
	}

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

}
