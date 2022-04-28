package maths.examples;

import java.util.ArrayList;

public class EmployeeAdmin {
	
	/**
     * Searches a list of employees by age and returns all found below the specified age
     * @param employees
     * @param age
     * @return
     */
    public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age ) {
        ArrayList<Employee> employeesWithAge = new ArrayList<Employee>();
        
        for (Employee employee : employees) {
            if (employee.getAge()<=age) {
                // found an employee - adding to list
                employeesWithAge.add(employee);
            }
        }
        
        // return the list
        return employeesWithAge;
    }
    
    // create a method that will search a list of employees by name and returns all found that match the name - then test it

    public static ArrayList<Employee> getAllEmployeesByName(ArrayList<Employee> employees, String name ) {
    	ArrayList<Employee> employeesWithName = new ArrayList<Employee>();
    	
    	for (Employee employee : employees) {
    		if (employee.getName().equals(name)) {
    			employeesWithName.add(employee);
    		}
    	}
    	
    	return employeesWithName;
    }
}
