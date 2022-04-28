package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
	
	private int age;
	private String name;
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Niamh");
		e1.setAge(30);
		
		Employee e2 = new Employee();
		e2.setName("Claire");
		e2.setAge(40);
		
		Employee e3 = new Employee();
		e3.setName("Una");
		e3.setAge(20);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list, new CompareEmployeeName());
		System.out.println("reverse");
		showAll(list);
	}
	
	public static void showAll(List<Employee> list) {
		for(Employee e: list) {
			System.out.println(e.getName() + " " +e.getAge());
			//System.out.println(e.getAge());
		}
	}

}
