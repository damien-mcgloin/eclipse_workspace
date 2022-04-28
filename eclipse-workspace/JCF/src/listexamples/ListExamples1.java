package listexamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExamples1 {
	
	public ListExamples1() {
		
	}
	
	public static void main(String[] args) {
	
	ArrayList<String> arrList = new ArrayList<String>();
    arrList.add("Belfast");
    arrList.add("Dublin");
    
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("London");
    linkedList.add("Cardiff");
    
    showAll(arrList);
    showAll(linkedList); 
    
	}
	
	/**
	 * Programming to the list interface !
	 * @param arrayList
	 */
	public static void showAll(ArrayList<String> cityList) {
		for (String city : cityList) {
			System.out.println(city);
		}
	}
	
	public static void showAll(LinkedList<String> linkedList) {
		for (String city : linkedList) {
			System.out.println(city);
		}
	}

}
