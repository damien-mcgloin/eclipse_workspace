package practical2;

public class Pharmacist extends Employee {

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
	public void calculateWeeklyHours(double hours) {
		System.out.println("Salary : "+this.bonus + hours * this.getBaseRate());
	}

	@Override
	public void printAll() {
		System.out.println("Pharmacist");
		super.printAll();
		System.out.println("Grade : " + this.grade);
		System.out.printf("Bonus : %2.f",this.bonus);
	}

}
