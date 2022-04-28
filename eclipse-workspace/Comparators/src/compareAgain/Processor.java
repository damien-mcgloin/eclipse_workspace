package compareAgain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Processor extends Employee {

	public static void main(String[] args) {
		
		/*
		Integer a,b;
		a = 999;
		b = 11111;
		System.out.println(a.compareTo(b));
		*/
		
		Employee e1 = new Employee("Claire", 25, "FT");
		Employee e2 = new Employee("Una", 20, "FT");
		Employee e3 = new Employee("Niamh", 40, "PT");

		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		Collections.sort(employees, new CompareByName());
		
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
	}

}
