package challenge;

import java.util.Comparator;

public class CompareByDensity implements Comparator<Country> {

	@Override
	public int compare(Country c1, Country c2) {
		if (c1.getDensity() > c2.getDensity()) {
			return -1;
		} else if (c1.getDensity() < c2.getDensity()) {
			return 1;
		} else {
			return 0;
		}
	}

}
