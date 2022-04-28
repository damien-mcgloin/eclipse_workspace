/**
 * 
 */
package arrayexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author damienmcgloin
 *
 */
public class ExamplesArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apples");
		fruits.add("Oranges");
		
		System.out.println(fruits.toString());
		
		fruits.add(0, "Pears");
		System.out.println(fruits.toString());
		
		System.out.println(fruits.size());	
		
		for (int loop = 0; loop<fruits.size(); loop++) {
			System.out.println(fruits.get(loop));
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// for more useful methods
		if (fruits.contains("Pears")) {
			System.out.println("Got pears");
		}
		
		fruits.set(1, "Peach");
		System.out.println(fruits.toString());
		
		Collections.sort(fruits);
		System.out.println(fruits);
		
		fruits.remove("Oranges");
		System.out.println(fruits);
		
		fruits.clear();

	}

}
