package p2;

/**
 * Represents an abstract Aircraft in the system. You would expect to extend this class to create subclasses.
 * @author Aidan
 *
 */
public abstract class Aircraft {

	// teaching note : optional javadoc on these 
	
	private int currentSpeed; 
	private int distanceToAirfield; 
	private String aircraftCode; 

	private final static int CURRENT_SPEED_VALID_LOWER = 0;
	private final static int CURRENT_SPEED_VALID_UPPER = 800;

	private final static int DISTANCE_TO_AIRFIELD_VALID_LOWER = 1;
	private final static int DISTANCE_TO_AIRFIELD_VALID_UPPER = 20000;

	private final static int CODE_VALID_LENGTH = 6;

	private final static String ERROR_MESSAGE = "INVALID ";
	private final static String ERROR_MESSAGE_SPEED = "CURRENT SPEED";
	private final static String ERROR_CODE = "CODE";
	private final static String ERROR_DISTANCE = "CURRENT DISTANCE";

	/**
	 * Default constructor
	 */
	public Aircraft() {

	}

	/**
	 * Creates an Aircraft - teaching note : note use @value here to enhance the comments (was in an challenge but not looking for it in the assessment)
	 * 
	 * @param currentSpeed {@value #CURRENT_SPEED_VALID_LOWER} to {@value #CURRENT_SPEED_VALID_UPPER}
	 * @param distanceToAirfield {@value #DISTANCE_TO_AIRFIELD_VALID_LOWER} to {@value #DISTANCE_TO_AIRFIELD_VALID_UPPER}
	 * @param aircraftCode {@value #CODE_VALID_LENGTH} 
	 * @throws IllegalArgumentException
	 */
	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) throws IllegalArgumentException {
		// 
		this.setCurrentSpeed(currentSpeed);
		this.setDistanceToAirfield(distanceToAirfield);
		this.setAircraftCode(aircraftCode);
	}

	/**
	 * gets the current speed
	 * @return the currentSpeed
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * sets the current speed
	 * Valid {@value #CURRENT_SPEED_VALID_LOWER} to {@value #CURRENT_SPEED_VALID_UPPER}
	 * @param currentSpeed the currentSpeed to set
	 */
	public void setCurrentSpeed(int currentSpeed) throws IllegalArgumentException {
		if (currentSpeed >= CURRENT_SPEED_VALID_LOWER && currentSpeed <= CURRENT_SPEED_VALID_UPPER) {
			this.currentSpeed = currentSpeed;
		} else {
			throw new IllegalArgumentException(ERROR_MESSAGE + ERROR_MESSAGE_SPEED);
		}
	}

	/**
	 * get the distance to the airfield
	 * @return the distanceToAirfield
	 */
	public int getDistanceToAirfield() {
		return distanceToAirfield;
	}

	/**
	 * sets the distance to airfield
	 * @param {@value #DISTANCE_TO_AIRFIELD_VALID_LOWER} to {@value #DISTANCE_TO_AIRFIELD_VALID_UPPER}
	 */
	public void setDistanceToAirfield(int distanceToAirfield) {
		if (distanceToAirfield >= DISTANCE_TO_AIRFIELD_VALID_LOWER
				&& distanceToAirfield <= DISTANCE_TO_AIRFIELD_VALID_UPPER) {
			this.distanceToAirfield = distanceToAirfield;
		} else {
			throw new IllegalArgumentException(ERROR_MESSAGE + ERROR_DISTANCE);
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
	 * sets the code 
	 * @param aircraftCode vlaid {@value #CODE_VALID_LENGTH} and needs to start with Upper 'A'
	 * 
	 */
	public void setAircraftCode(String aircraftCode) throws IllegalArgumentException {

		// check if not null 
		if (aircraftCode != null) {

			// get the first char
			char firstChar = aircraftCode.charAt(0);

			if (firstChar == 'A' && aircraftCode.trim().length() == CODE_VALID_LENGTH) {
				this.aircraftCode = aircraftCode;
			} else {
				throw new IllegalArgumentException(ERROR_MESSAGE + ERROR_CODE);
			}
		} else {
			throw new IllegalArgumentException(ERROR_MESSAGE + ERROR_CODE);
		}
	}

}
