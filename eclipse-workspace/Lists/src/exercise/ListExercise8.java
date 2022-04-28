package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListExercise8 {

	public static void main(String[] args) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		
		arrList.add(3);
		arrList.add(2);
		arrList.add(2);
		arrList.add(1);
		arrList.add(1);
		arrList.add(4);
		arrList.add(4);
		arrList.add(5);
		arrList.add(5);
		arrList.add(3);
		
		linkList.add(1);
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(4);
		linkList.add(2);
		linkList.add(2);
		linkList.add(5);
		linkList.add(5);
		
		System.out.println(arrList);
		System.out.println(linkList);
		
		removeDuplicates(arrList, linkList);
		
		System.out.println(arrList);
		System.out.println(linkList);

	}
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {
		
		for(Integer removeItem: originalList) {
			if(listToRemove.contains(removeItem)) {
				listToRemove.remove(removeItem);
			}
		}
		
	}

}
