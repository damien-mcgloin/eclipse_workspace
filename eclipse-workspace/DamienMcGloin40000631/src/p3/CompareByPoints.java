package p3;

import java.util.Comparator;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class CompareByPoints implements Comparator<Player> {

	// comparator for sorting player data by points scored
	@Override
	public int compare(Player p1, Player p2) {
		return p2.getPointsScored() - p1.getPointsScored();
	}

}
