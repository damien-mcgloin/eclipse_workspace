/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Pharmacist1 extends Employee1 {

	private int grade;
	private double bonus;
	
	/**
	 * 
	 */
	public Pharmacist1() {
		// TODO Auto-generated constructor stub
	}
	
	public Pharmacist1(String firstName, String lastName, double baseRate, int grade, double bonus) {
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
	
	public double getConsultationFee() {
		return bonus;
	}
	
	public void setConsultationFee(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println((hours*this.getBaseRate()+this.bonus));
		
	}
	
	public void printAll() {
		
	}

}
