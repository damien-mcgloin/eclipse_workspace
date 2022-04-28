package challenge;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class CompareByDensityComp implements Comparator<Map.Entry<String, Double>> {

	@Override
	public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
		return Double.compare(o2.getValue(), o1.getValue());
	}

}
