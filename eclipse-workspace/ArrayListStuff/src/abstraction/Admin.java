package abstraction;

public class Admin {

	
	public static void main(String[] args) {

		//Employee employee = new Employee("Any", "Employee");
		//employee.calculateSalary(20, 5);
		
		Lecturer lecturer = new Lecturer("Aidan", "McG", "EEECS");
		lecturer.calculateSalary(20, 5);
		
		Reader reader = new Reader("Any", "Reader", "ML");
		reader.calculateSalary(20, 5);
		
	}

}
