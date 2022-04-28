package practical2;

public class Porter extends Employee {

	private String site;

	public Porter() {
		// TODO Auto-generated constructor stub
	}

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
	public void calculateWeeklyHours(double hours) {
		double salary = hours * this.getBaseRate();
		System.out.println("Salary : " + salary);
	}

	@Override
	public void printAll() {
		System.out.println("Porter");
		super.printAll();
		System.out.println("Site : " + this.site);
	}

}
