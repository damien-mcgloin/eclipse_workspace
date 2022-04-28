package compare;

import java.util.ArrayList;

public class Processor {

	public static void main(String[] args) {
		
		/*
      Integer a,b;
        a= 999;
        b= 11111;
        System.out.println(a.compareTo(b));
        */
        
        Employee e1 = new Employee("Claire", 25);
        Employee e2 = new Employee("Una", 20);
        Employee e3 = new Employee("Niamh", 40);
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        viewAll(list);
    
	}
	
	public static void viewAll(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e.toString());
        }
    }

}
