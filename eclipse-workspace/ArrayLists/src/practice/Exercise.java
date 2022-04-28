/**
 * 
 */
package practice;

import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");

		list2.add("Four");
		list2.add("Two");
		list2.add("Five");

		System.out.println(list1.toString());
		System.out.println(list2.toString());

		for (int loop = 0; loop < list2.size(); loop++) {
			if (!list1.contains(list2.get(loop))) {
				list1.add(list2.get(loop));
			}
		}

		System.out.println(list1);
	}

}
