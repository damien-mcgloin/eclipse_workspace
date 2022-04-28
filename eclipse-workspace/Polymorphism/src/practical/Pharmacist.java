/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Pharmacist extends Employee {

	private int grade;
	private double bonus;
	
	/**
	 * 
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}
	
	public Pharmacist(String firstName, String lastName, double baseRate,
			int grade, double bonus) {
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
	
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * $%.2f = $%.2f ",
				this.getFirstName(), this.getLastName(), "Porter", hours,
				this.getBaseRate(),
				(hours * this.getBaseRate()+this.bonus));	
	}
	
	
	/**
	 * Displays the Pharmacist's details
	 */
	@Override
	public void printAll() {
		System.out.printf(
				"[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus : £%-20.2f",
				"Pharmacist", this.getFirstName(), this.getLastName(),
				this.getBaseRate(), this.grade, this.bonus);
	}
	
	

}
