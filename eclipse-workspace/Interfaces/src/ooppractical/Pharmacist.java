/**
 * 
 */
package ooppractical;

/**
 * @author damienmcgloin
 *
 */
public class Pharmacist extends Employee implements IAdministerDrugs {

	private int grade;
	private double bonus;

	/**
	 * 
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
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
		System.out.printf("[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus : £%-20.2f", "Pharmacist", this.getFirstName(),
				this.getLastName(), this.getBaseRate(), this.grade, this.bonus);
	}

	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus : £%-20.2f", "Pharmacist", this.getFirstName(),
				this.getLastName(), this.getBaseRate(), this.grade, this.bonus);
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
