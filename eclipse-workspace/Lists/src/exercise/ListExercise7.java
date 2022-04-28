package exercise;

import java.util.LinkedList;
import java.util.List;

public class ListExercise7 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");
		
		// not quite right?
		System.out.println(linkedList.toString());
		
		// gettin there
		swap(linkedList, 1, 2);
		System.out.println(linkedList.toString());
		
		// chef's kiss
		swap(linkedList, 2, 3);
		System.out.println(linkedList.toString());
	}
	
	public static void swap(List<String> switchList, int position1, int position2) {
		
		String tmp = switchList.get(position1);
		switchList.set(position1, switchList.get(position2));
		switchList.set(position2, tmp);
		
		
	}

}
