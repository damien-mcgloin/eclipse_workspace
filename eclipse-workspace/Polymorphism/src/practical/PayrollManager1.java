/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class PayrollManager1 {

	public static Employee1[] employees = new Employee1[6];
	
	public static int HOURS_PER_WEEK = 35;
	
	public static void addEmployeeToList(Employee1 employee) {
		for(int loop = 0; loop<employees.length; loop++) {
			if(employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
		
	}
	
	public static void displayAllEmployees() {
		
		for(Employee1 e: employees) {
			if(e!=null) {
				e.printAll();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Employee1 Porter1 = new Porter1("Ivana", "Patient", 10.50, "Royal");
		Employee1 Porter2 = new Porter1("Amanda", "Pushabed", 10.50, "BCH");
		Employee1 Surgeon1 = new Surgeon1("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee1 Surgeon2 = new Surgeon1("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee1 Pharmacist1 = new Pharmacist1("Poppy", "Pill", 30.50, 7, 750.00);
		
		addEmployeeToList(Porter1);
		addEmployeeToList(Porter2);
		addEmployeeToList(Surgeon1);
		addEmployeeToList(Surgeon2);
		addEmployeeToList(Pharmacist1);
		
		displayAllEmployees();
		processWeeklyPayroll();
		
		}	
	
	public static void processWeeklyPayroll() {
		
		for(Employee1 e: employees) {
			if(e!=null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
			}
		}
		
	}

}
