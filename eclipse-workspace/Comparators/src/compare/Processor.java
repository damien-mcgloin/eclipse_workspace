package compare;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Processor {
	
	public static void main(String[] args) {
	
	Employee e1 = new Employee("Claire", 25, "FT");
    Employee e2 = new Employee("Una", 20,  "PT");
    Employee e3 = new Employee("Niamh", 40, "FT");
    
    Set<Employee> list = new HashSet<Employee>();
    list.add(e1);
    list.add(e2);
    list.add(e3);
    
    List<Employee> myList = new ArrayList<Employee>(list);
    
    //viewAll(list);
    
    viewAll(myList);
    
    Collections.sort(myList, new CompareName());
    System.out.println("Sorted by name");
    viewAll(myList);
    
    Collections.sort(myList, new CompareAge());
    System.out.println("Sorted by age");
    viewAll(myList);
    
    Collections.sort(myList, new CompareNameReverse());
    System.out.println("Sorted by name - reverse");
    viewAll(myList);
    
    Collections.sort(myList, new CompareEmployStatus());
    System.out.println("By Employ status");
    viewAll(myList);
    
	}
	
	/*
	public static void viewAll(Collection<Employee> list) {
        for (Employee e : list) {
            System.out.println(e.toString());
        }
    }
    */
	
	public static void viewAll(List<Employee> list) {
        for (Employee e : list) {
            System.out.println(e.toString());
        }
    }

}
