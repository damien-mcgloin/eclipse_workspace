package payroll;

public class Reader extends Employee {
	
	@Override
	public void calculateWages(int hoursWorked) {
		System.out.println("Name : "+this.getName());
		System.out.println("Job title : "+this.getJobTitle());
		System.out.println("Pay : "+(hoursWorked * 10 * 3));
	}

}
