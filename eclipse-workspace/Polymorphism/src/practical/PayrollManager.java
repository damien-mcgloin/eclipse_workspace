/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class PayrollManager {

	/**
	 * 
	 */

	// Static variable to hold employees
	public static Employee[] employees = new Employee[6];

	public static int HOURS_PER_WEEK = 35;

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
		
		processWeeklyPayroll();
		displayAllEmployees();
		
	}

	public PayrollManager() {
		// TODO Auto-generated constructor stub
	}

	public static void addEmployeeToList(Employee employee) {
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
	}
	
	public static void processWeeklyPayroll() {
		
		for (Employee e: employees) {
			if (e!=null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
			}
		}
		
	}

	public static void displayAllEmployees() {

		for(Employee e: employees) {
			if (e!=null) {
				e.printAll();
			}
		}
		
	}

}
