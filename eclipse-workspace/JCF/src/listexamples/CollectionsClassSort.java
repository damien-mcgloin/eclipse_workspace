package listexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClassSort {

	public static void main(String[] args) {

		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades", "Jokers" };

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create List
		System.out.println(list.toString());

		// or
		System.out.printf("Unsorted array elements: %s\n", list);

		// sort ArrayList
		Collections.sort(list);

		// output list
		System.out.printf("Sorted array elements: %s\n", list);

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");

		// not quite right ?
		//System.out.println(linkedList.toString());

		swap(linkedList, 1, 2);
		//System.out.println(linkedList.toString());
		swap(linkedList, 2, 3);
		System.out.println(linkedList.toString());

	}

	public static void swap(List<String> list, int position1, int position2) {
		String tmp = list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, tmp);
	}

}
