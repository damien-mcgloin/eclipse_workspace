package payroll;

public class PayrollManager {

	public static void main(String[] args) {
		
		// get all employees
		Employee e1 = new Employee();
		e1.setName("Employee 1");
		e1.setJobTitle("General worker");
		
		Lecturer l1 = new Lecturer();
		l1.setJobTitle("Lecturer");
		l1.setName("Aidan");
		l1.setSchool("EEECS");
		
		Reader r1 = new Reader();
		r1.setJobTitle("Reader");
		r1.setName("Reader Rob");
		
		Janitor j1 = new Janitor();
		j1.setName("John");
		j1.setJobTitle("Janitor");
		j1.setQualification("Cleaning cert");
		
		Employee[] employees = new Employee[4];
		employees[0] = e1;
		employees[1] = l1;
		employees[2] = r1;
		employees[3] = j1;
		
		payAll(employees);

	}
	
	public static void payAll(Employee[] employees) {
		for (Employee employee : employees) {
			employee.calculateWeeklyWages(40);
		}
	}

}
