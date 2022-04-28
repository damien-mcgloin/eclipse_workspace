package p3;

import java.util.Comparator;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class CompareByHeight implements Comparator<Player> {

	// comparator for sorting in order of height descending
	@Override
	public int compare(Player p1, Player p2) {
		if (p1.getHeightInMetres() > p2.getHeightInMetres()) {
			return -1;
		} else if (p1.getHeightInMetres() < p2.getHeightInMetres()) {
			return 1;
		} else {
			return 0;
		}
	}

}
