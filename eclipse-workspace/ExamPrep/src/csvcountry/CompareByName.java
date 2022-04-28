package csvcountry;

import java.util.Comparator;

public class CompareByName implements Comparator<Country> {

	@Override
	public int compare(Country c1, Country c2) {
		return c1.getName().compareTo(c2.getName());
	}

}
