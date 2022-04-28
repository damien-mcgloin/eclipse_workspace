package challenge;

import java.util.Comparator;

public class ComparePoints implements Comparator<Team>{

	@Override
	public int compare(Team t1, Team t2) {
		return t2.pointsTotal() - t1.pointsTotal();
	}


}
