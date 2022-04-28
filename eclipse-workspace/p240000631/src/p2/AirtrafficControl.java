package p2;

/**
 * @author Damien McGloin 40000631
 */

import java.util.ArrayList;

public class AirtrafficControl {

	/**
	 * Searches for aircraft with current speed ranging from 100 to 300
	 * @param allAircraft - takes arraylist of type aircraft
	 * @return - arraylist containing aircraft which match criteria
	 */
	public static ArrayList<Airline> searchBySpeed(ArrayList<Airline> allAircraft) {
		ArrayList<Airline> results = new ArrayList<Airline>();
		
		for(Airline airline : allAircraft) {
			if(airline.getCurrentSpeed() >= 100 && airline.getCurrentSpeed()<=300) {
				results.add(airline);
			}
		}
		
		return results;
	}
	
	/**
	 * Searches for aircraft with specified engine type
	 * @param allAircraft - takes arraylist of type aircraft
	 * @param engineType - String type of engine the user is searching for
	 * @return - arraylist containing aircraft which match criteria
	 */
	public static ArrayList<Airline> searchForAllByEngineType(ArrayList<Airline> allAircraft, String engineType) {
		ArrayList<Airline> results = new ArrayList<Airline>();
		
		for(Airline airline : allAircraft) {
			if(airline.getEngineType().equalsIgnoreCase(engineType)) {
				results.add(airline);
			}
		}
		
		return results;
	}
	
	/**
	 * Searches for aircraft with specified engine type and which are arriving with a given time
	 * @param allAircraft - takes arraylist of type aircraft
	 * @param engineType - String type of engine the user is searching for
	 * @param timeToField - time remaining until plane reaches airfield
	 * @param givenTime - the given time
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ArrayList<Airline> searchForLandingList(ArrayList<Airline> allAircraft, String engineType, int givenTime) throws IllegalArgumentException {
		ArrayList<Airline> results = new ArrayList<Airline>();
		
		for(Airline airline : allAircraft) {
			if(airline.getEngineType().equalsIgnoreCase(engineType) && airline.timeToAirfield() <= givenTime) {
				results.add(airline);
			}
		}
		
		return results;
	}

}
