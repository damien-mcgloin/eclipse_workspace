package payroll2;

public class PayRollManager {

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
		
		Technician t1 = new Technician();
		t1.setCertification("fixing");
		t1.setJobTitle("Technician");
		t1.setName("Technician Tom");
		
		Employee[] employees = new Employee[4];
		employees[0] = e1;
		employees[1] = l1;
		employees[2] = r1;
		employees[3] = t1;
		
		payAll(employees);

	}
	
	/**
	 * polymorphic way of paying all employees
	 * @param employees
	 */
	public static void payAll(Employee[] employees) {
		for(Employee employee : employees) {
			System.out.println();
			employee.calculateWages(40);
		}
	}

}
