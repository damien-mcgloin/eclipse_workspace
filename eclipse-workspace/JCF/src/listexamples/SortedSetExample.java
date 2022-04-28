package listexamples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		SortedSet<String> sset = new TreeSet<>();
		sset.add("Messi");

		sset.add("Pele");
		sset.add("Ronaldo");

		System.out.println(sset.toString());

		System.out.println(sset.first());

		System.out.println(sset.last());

		sset.remove("Ronaldo");

		System.out.println(sset.toString());
	}

}
