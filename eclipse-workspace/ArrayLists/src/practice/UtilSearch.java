package practice;

import java.util.ArrayList;

public class UtilSearch {
	
	public static ArrayList<Engineer> searchByDiscipline(ArrayList<Engineer> engineers, String discipline) {
		
		ArrayList<Engineer> engineersFound = new ArrayList<Engineer>();
		
		for(Engineer engineer : engineers) {
			if (engineer.getDiscipline().equalsIgnoreCase(discipline)) {
				engineersFound.add(engineer);
			}
		}
		
		return engineersFound;
		
	}

}
