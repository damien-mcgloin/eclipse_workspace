package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListExercise {

	public static void main(String[] args) {
		
		ArrayList<Integer> randomArray = new ArrayList<Integer>();	
		LinkedList<Integer> randomLinked = new LinkedList<Integer>();
		
		randomArray.add(1);
		randomArray.add(3);
		randomArray.add(5);
		randomArray.add(4);
		randomArray.add(3);
		randomArray.add(2);
		randomArray.add(5);
		randomArray.add(1);
		randomArray.add(1);
		randomArray.add(3);
		
		randomLinked.add(5);
		randomLinked.add(2);
		randomLinked.add(3);
		randomLinked.add(2);
		randomLinked.add(1);
		randomLinked.add(1);
		randomLinked.add(4);
		randomLinked.add(3);
		randomLinked.add(4);
		randomLinked.add(2);
		
		System.out.println(randomArray);
		System.out.println(randomLinked);
		
		removeDuplicates(randomLinked, randomArray);
		
		System.out.println(randomLinked);
		System.out.println(randomArray);

	}
	
	public static void removeDuplicates(Collection<Integer> originalList,
			Collection<Integer> listToRemove) {
		for(Integer removeItem: listToRemove) {
			if (originalList.contains(removeItem)) {
				originalList.remove(removeItem);
			}
		}
	}
	
	

}
