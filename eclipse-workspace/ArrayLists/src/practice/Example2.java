package practice;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");

		list2.add("Four");
		list2.add("Two");
		list2.add("Five");

		for (int loop = 0; loop < list1.size(); loop++) {
			if(!list2.contains(list1.get(loop))) {
				list1.add(list2.get(loop));
			}
		}
		System.out.println(list1.toString());
	}

}
