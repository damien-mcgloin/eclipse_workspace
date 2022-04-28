package payroll;

public class Reader extends Employee {
	
	@Override
	public void calculateWeeklyWages(int hoursWorked) {
		System.out.println("Name "+this.getName());
		System.out.println("Job Title "+this.getJobTitle());
		System.out.println("Wages "+(hoursWorked * 10 * 3));
	}

}
