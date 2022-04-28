package practical1;

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
	public void calculateWeeklySalary(double hours) {
		System.out.println(hours*this.getBaseRate());
	}

	@Override
	public void printAll() {
		
	}

	
	
	

}
