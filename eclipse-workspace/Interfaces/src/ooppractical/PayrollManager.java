/**
 * 
 */
package ooppractical;

/**
 * @author damienmcgloin
 *
 */
public class PayrollManager {

	public static final int HOURS_PER_WEEK = 35;

	public static Employee[] employees = new Employee[6];

	public PayrollManager() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee pharmacist1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);
		
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist1);
		
		displayAllEmployees();
		System.out.println();
		processWeeklyPayroll();
		
				
	}

	public static void addEmployeeToList(Employee employee) {
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
	}

	public static void displayAllEmployees() {
		System.out.println("Display all employees ________________________________");
		int totalEmployees = 0;
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type", "First name", "Last name", "Rate", "Other",
				"Consultation Fee");
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.printAll();
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total employees in system : " + totalEmployees);
		System.out.println("______________________________________________________");
	}

	public static void processWeeklyPayroll() {
		System.out.println("Payroll run..... _____________________________________");
		int totalEmployees = 0;
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total records processed : " + totalEmployees);
		System.out.println("______________________________________________________");
	}

}
