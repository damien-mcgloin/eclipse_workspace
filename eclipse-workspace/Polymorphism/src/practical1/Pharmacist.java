/**
 * 
 */
package practical1;

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
	public void calculateWeeklySalary(double hours) {
		System.out.println(hours*(this.getBaseRate()+this.bonus));

	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
	}

}
