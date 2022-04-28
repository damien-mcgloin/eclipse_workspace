package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("Apples");
		items.add("Oranges");
		
		System.out.println(items.toString());
		
		items.add(0, "Pears");
		
		System.out.println(items.size());
		System.out.println(items.toString());
		
		for(int loop = 0; loop<items.size(); loop++) {
			System.out.println(items.get(loop));
		}
		
		for(String item : items) {
			System.out.println(item);
		}
		
		Iterator<String> it = items.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		items.set(1, "Peaches");
		System.out.println(items.toString());
		
		Collections.sort(items);
		
		System.out.println(items);
		
		items.remove("Oranges");
		System.out.println(items);
		
		items.clear();
		System.out.println(items);
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		
		list2.add("Four");
		list2.add("Five");
		list2.add("Three");
		
		for(int loop = 0; loop<list2.size(); loop++) {
			if(!list2.contains(list1.get(loop)))
			list1.add(list2.get(loop));
		}
		
		System.out.println(list1.toString());
		
		

	}

}
