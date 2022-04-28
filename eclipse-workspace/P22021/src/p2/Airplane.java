package p2;

/**
 * Represents an airline 
 * @author Aidan
 */
public class Airplane extends Aircraft implements IRangeChecker {

	/**
	 * Teaching note : best done with ENUMS 
	 */
	private EngineType engineType;

	/**
	 * Default airplane
	 */
	public Airplane() {

	}

	/**
	 * constructor with args 
	 * @param currentSpeed 
	 * @param distanceToAirfield 
	 * @param aircraftCode 
	 * @param engineType
	 */
	public Airplane(int currentSpeed, int distanceToAirfield, String aircraftCode, EngineType engineType) {
		super(currentSpeed, distanceToAirfield, aircraftCode); // call to super constructor - don't reinvent wheel !
		this.engineType = engineType; // use of ENUM - no need to use setter
	}

	/**
	 * calculates time in mins to airfield - Teaching note : could also return an exception !
	 * Also best this is a interface base method
	 */
	@Override
	public int timeToAirfield() {
		double time = 0;
		// check if moving  - i.e. checking to prevent potential div by zero
		if (this.getCurrentSpeed()!=0) { 
			// note need to cast to double here
			time = (double)this.getDistanceToAirfield() / this.getCurrentSpeed() * 60; // Teaching note : 60 here could also be defined as constant
		} 
		return (int)time;
	}

	/**
	 * Get the engine type
	 * @return the engineType
	 */
	public EngineType getEngineType() {
		return engineType;
	}

	/**
	 * Sets the engine type - Teaching note : based on enum (no business rule implementation needed - otherwise it will be needed (and maintained)
	 * @param engineType the engineType to set
	 */
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

}
