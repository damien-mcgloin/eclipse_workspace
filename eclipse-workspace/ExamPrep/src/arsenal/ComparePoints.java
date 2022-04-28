package arsenal;

import java.util.Comparator;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class ComparePoints implements Comparator<Team> {

	@Override
	public int compare(Team t1, Team t2) {
		return t2.pointsTotal() - t1.pointsTotal();
	}
	
}
