package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture {

	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("One");
		listA.add("Two");
		listA.add("Three");
		
		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Four");
		listB.add("Two");
		listB.add("Five");
		
		int a, b;
		a = listA.size();
		b = listB.size();
		
		listA.ensureCapacity(a+b);
		
		for(int loop = 0; loop<listB.size(); loop++) {
			if(!listB.contains(listA.get(loop))) {
				listA.add(listB.get(loop));
			}
			
		}

		System.out.println(listA.toString());
	}

}
