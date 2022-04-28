package practical;

public class PayrollManager {

	public static Employee[] employees = new Employee[6];

	public static final int HOURS_PER_WEEK = 35;

	public static void main(String[] args) {
		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Surgeon surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Pharmacist pharmacist1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);
		
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist1);
		
		//processWeeklyPayroll();
		
		displayAllEmployees();
		
		System.out.println("Surgeon : admin controlled drug : "+surgeon1.adminControlledDrug());
		System.out.println("Surgeon : admin controlled drug : "+surgeon1.adminNonControlledDrug());
		
		System.out.println("Pharmacist : admin controlled drug : "+pharmacist1.adminControlledDrug());
		System.out.println("Pharmacist : admin controlled drug : "+pharmacist1.adminControlledDrug());

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

		for (Employee e : employees) {
			if (e != null) {
				e.calculateWeeklyHours(HOURS_PER_WEEK);
			}
		}
	}

	public static void displayAllEmployees() {
		for (Employee e : employees) {
			if (e != null) {
				System.out.println();
				e.printAll();
			}
		}

	}
}
