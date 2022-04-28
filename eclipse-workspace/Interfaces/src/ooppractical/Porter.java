package ooppractical;

public class Porter extends Employee {
	
	private String site;
	
	public Porter() {
		
	}
	
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}
	
	public String getSite() {
		return site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s $%.2f Site : %s","Porter", this.getFirstName(),
		this.getLastName(), this.getBaseRate(), this.site);
	}
	
	/**
	 * calculates weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * $%.2f = $%.2f ",
				this.getFirstName(), this.getLastName(), "Porter", hours,
				this.getBaseRate(),
				(hours * this.getBaseRate()));	
	}

}
