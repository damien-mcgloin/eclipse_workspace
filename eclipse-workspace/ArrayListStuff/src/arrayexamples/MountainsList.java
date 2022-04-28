package arrayexamples;

import java.util.ArrayList;

public class MountainsList {

	public static void main(String[] args) {

		// creating mountain or two
		Mountain m1 = new Mountain();
		m1.setName("Everest");
		m1.setHeight(8848);

		// k2 8601
		Mountain m2 = new Mountain("k2", 8611);

		Mountain m3 = new Mountain("Damien's mountain", 9001);

		// creating an array list to hold the mountains
		ArrayList<Mountain> mountains = new ArrayList<Mountain>();

		mountains.add(m1);
		mountains.add(m2);
		mountains.add(m3);

		for (Mountain mountain : mountains) {
			System.out.println(mountain.getName() + " " + mountain.getHeight());
		}

		findMountainsByHeight(mountains, 9000);
	}

	public static void findMountainsByHeight(ArrayList<Mountain> mountains, int height) {
		System.out.println("Mountains less than " + height);
		for (Mountain mountain : mountains) {
			if (mountain.getHeight() <= height) {
				System.out.println(mountain.getName() + " " + mountain.getHeight());
			}
		}

	}
}
