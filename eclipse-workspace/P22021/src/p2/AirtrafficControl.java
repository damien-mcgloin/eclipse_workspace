package p2;

import java.util.ArrayList;

/**
 * Search method to support the air traffic control system
 * @author 3048360
 *
 */
public class AirtrafficControl {

	/**
	 * Searches a supplied list for all aircraft that within a specified speed
	 * range.
	 * 
	 * @param aircrafts
	 * @return list of search matches
	 */
	public static ArrayList<Aircraft> searchBySpeed(ArrayList<Aircraft> aircrafts, int low, int high)
			throws NullPointerException {
		// Teaching note : note use of Aircraft here - polymorphism etc...
		// Teaching note : check for null here
		if (aircrafts == null) {
			throw new NullPointerException("Null list");
		}

		ArrayList<Aircraft> movingWithinSpeedRange = new ArrayList<Aircraft>();
		// important to check the range given here
		if (low > high) {
			throw new IllegalArgumentException("INVALID SPEED RANGE");
		} else {
			for (Aircraft aircraft : aircrafts) {
				// checking if stationary
				if (aircraft.getCurrentSpeed() >= low && aircraft.getCurrentSpeed() <= high) {
					movingWithinSpeedRange.add(aircraft);
				}
			}
		}
		return movingWithinSpeedRange;
	}

	/**
	 * Searches a supplied list for specified engine type
	 * 
	 * @param engineType
	 * @param airplanes
	 * @return list of search matches
	 */
	public static ArrayList<Airplane> searchForAllByEngineType(EngineType engineType, ArrayList<Airplane> airplanes) throws NullPointerException {
		// Teaching note : note use of airplanes here
		// Teaching note : check for null here
		if (airplanes == null) {
			throw new NullPointerException("Null list");
		}

		ArrayList<Airplane> engineTypeAirplanes = new ArrayList<Airplane>();

		for (Airplane airplane : airplanes) {
			if (airplane.getEngineType() == engineType) {
				engineTypeAirplanes.add(airplane);
			}
		}
		return engineTypeAirplanes;
	}

	/**
	 * Searches for all objects in the parameter argument ArrayList that are within
	 * a given time (inclusive) of the airfield and have a specified engine type.
	 * 
	 * @param vehicles
	 * @param time
	 * @return list of search matches
	 */
	public static ArrayList<IRangeChecker> searchForLandingList(ArrayList<IRangeChecker> vehicles, int time) {
		// note use of programming to interface here also could be done with concrete airline object but less flexible 
		if (vehicles == null) {
			throw new NullPointerException("Null list");
		}
		ArrayList<IRangeChecker> craftsToBeLanded = new ArrayList<IRangeChecker>();

		for (IRangeChecker vehicle : vehicles) {
			// checking the object is an instance of airplane - can be updated as and when other IRangeChecker implementations come online that include engine type (very flexible)   
			if (vehicle instanceof Airplane) {
				Airplane airplane = (Airplane) vehicle;
				// checks for engine type
				if (airplane.timeToAirfield() < time && airplane.getEngineType().equals(EngineType.JET)) {
					// needs to added to the list
					craftsToBeLanded.add(vehicle);
				}
			}
		}
		return craftsToBeLanded;
	
	}
}
