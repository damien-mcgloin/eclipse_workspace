package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListExercise4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ranNum = new ArrayList<Integer>();
		
		LinkedList<Integer> ranNum2 = new LinkedList<Integer>();
		
		ranNum.add(1);
		ranNum.add(5);
		ranNum.add(3);
		ranNum.add(1);
		ranNum.add(5);
		ranNum.add(4);
		ranNum.add(2);
		ranNum.add(5);
		ranNum.add(2);
		ranNum.add(4);
		
		ranNum2.add(3);
		ranNum2.add(3);
		ranNum2.add(5);
		ranNum2.add(1);
		ranNum2.add(5);
		ranNum2.add(4);
		ranNum2.add(3);
		ranNum2.add(5);
		ranNum2.add(3);
		ranNum2.add(4);
		
		removeDuplicates(ranNum, ranNum2);
		
		System.out.println(ranNum.toString());
		System.out.println(ranNum2.toString());

	}
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {
		
		for(Integer item : listToRemove) {
			if(originalList.contains(item)) {
				originalList.remove(item);
			}
		}
		
	}

}
