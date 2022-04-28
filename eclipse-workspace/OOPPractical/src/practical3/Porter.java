/**
 * 
 */
package practical3;

/**
 * @author damienmcgloin
 *
 */
public class Porter extends Employee {

	private String site;
	
	/**
	 * 
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(this.getFirstName()+" "+this.getLastName()+"'s weekly salary is %.2f\n",hours*this.getBaseRate());
	}

	@Override
	public void printAll() {
		System.out.println("Porter");
		super.printAll();
		System.out.println("Site : "+this.site);
	}

}
