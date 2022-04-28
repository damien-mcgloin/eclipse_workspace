package p2;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public abstract class Aircraft {
	
	// constants used to avoid magic numbers
	private final int MIN_CURRENT_SPEED = 0;
	private final int MAX_CURRENT_SPEED = 800;
	private final int MIN_DISTANCE = 1;
	private final int MAX_DISTANCE = 20000;
	private final int AIRCRAFT_CODE_LENGTH = 6;

	/**
	 * current speed of aircraft
	 */
	private int currentSpeed; 
	
	/**
	 * distance between aircraft and airfield
	 */
	private int distanceToAirfield; 
	
	/**
	 * code for the aircraft
	 */
	private String aircraftCode; 

	/**
	 * Default constructor
	 */
	public Aircraft() {

	}
	
	/**
	 * Constructor with args
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 */
	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) {
		this.setCurrentSpeed(currentSpeed);
		this.setDistanceToAirfield(distanceToAirfield);
		this.setAircraftCode(aircraftCode);
	}

	/**
	 * gets the current speed of aircraft
	 * @return
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * sets the current speed of aircraft
	 * @param currentSpeed
	 */
	public void setCurrentSpeed(int currentSpeed) throws IllegalArgumentException {
		if(currentSpeed>=MIN_CURRENT_SPEED && currentSpeed<=MAX_CURRENT_SPEED) {
		this.currentSpeed = currentSpeed;
		} else {
			throw new IllegalArgumentException("INVALID SPEED");
		}
	}

	/**
	 * gets the distance to the airfield
	 * @return
	 */
	public int getDistanceToAirfield() {
		return distanceToAirfield;
	}

	/**
	 * sets the distance to the airfield
	 * @param distanceToAirfield
	 */
	public void setDistanceToAirfield(int distanceToAirfield) throws IllegalArgumentException {
		if(distanceToAirfield>=MIN_DISTANCE && distanceToAirfield<=MAX_DISTANCE) {
		this.distanceToAirfield = distanceToAirfield;
		} else {
			throw new IllegalArgumentException("INVALID DISTANCE TO AIRFIELD");
		}
	}

	/**
	 * gets the aircraft code
	 * @return the aircraftCode
	 */
	public String getAircraftCode() {
		return aircraftCode;
	}
	
	/**
	 * sets the aircraft code
	 * @param aircraftCode
	 */
	public void setAircraftCode(String aircraftCode)  {
		if(aircraftCode.startsWith("A") && aircraftCode.length() == AIRCRAFT_CODE_LENGTH) {
		this.aircraftCode = aircraftCode;
		} else {
			throw new IllegalArgumentException("INVALID AIRCRAFT CODE");
		}
	}
	
	// method for calculating estimated time to reach airfield - not abstract as not all sublasses will inherit
	public int timeToAirfield() {
		
		int timeToField = ((this.getDistanceToAirfield()/this.getCurrentSpeed())*60);
		
		return timeToField;
	}
	
}
