package exercise;

import java.util.Collections;
import java.util.LinkedList;

public class ListExercise3 {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
			linkedList.add(333);
			linkedList.add(2);
			linkedList.add(89);
			linkedList.add(8282);
			linkedList.add(8282);
			
			System.out.println(linkedList.toString());
			
			// sort
			Collections.sort(linkedList);
			System.out.println(linkedList.toString());
			
			// reverse
			Collections.reverse(linkedList);
			System.out.println(linkedList.toString());
			
			// shuffle
			Collections.shuffle(linkedList);
			System.out.println(linkedList.toString());
			
			// min
			System.out.println("Min value : "+Collections.min(linkedList));
			
			// max
			System.out.println("Max value : "+Collections.max(linkedList));
			
			// frequency
			System.out.println("Frequency value (8282) in the list : "+Collections.frequency(linkedList, 8282));

	}

}
