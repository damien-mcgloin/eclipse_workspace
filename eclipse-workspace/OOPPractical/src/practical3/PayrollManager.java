package practical3;

import java.util.ArrayList;

public class PayrollManager {
	
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public static final int HOURS_PER_WEEK = 35;
	
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
		
		processWeeklyPayroll();

	}
	
	public static void addEmployeeToList(Employee employee) {
		
		employees.add(employee);
		
	}
	
	
	public static void displayAllEmployees() {
		System.out.println("Display all employees__________________________________");
		System.out.println("[Type     ]  First name        Last name       Rate          Other");
		for(Employee e : employees) {
				e.printAll();			
		}
		System.out.println("_______________________________________________________");
		
	}
	
	public static void processWeeklyPayroll() {
		
		System.out.println("Payroll run..... ______________________________________");
		for(Employee e: employees) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);		
		}
		System.out.println("_______________________________________________________");
	}

}
