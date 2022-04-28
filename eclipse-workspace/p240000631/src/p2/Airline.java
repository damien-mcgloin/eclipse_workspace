/**
 * 
 */
package p2;

/**
 * @author Damien McGloin 40000631
 *
 */
public class Airline extends Aircraft {

	/**
	 * engineType of plane - jet or propeller
	 */
	private String engineType;

	/**
	 * 
	 */
	public Airline() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 */
	public Airline(int currentSpeed, int distanceToAirfield, String aircraftCode, String engineType) throws IllegalArgumentException {
		super(currentSpeed, distanceToAirfield, aircraftCode);
		this.setEngineType(engineType);
	}

	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}

	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) throws IllegalArgumentException {
		if (engineType.equalsIgnoreCase("jet") || engineType.equalsIgnoreCase("propeller")) {
			this.engineType = engineType;
		} else {
			throw new IllegalArgumentException("INVALID ENGINE TYPE");
		}
	}

	@Override
	public int timeToAirfield() {
		int timeToField = ((this.getDistanceToAirfield() / this.getCurrentSpeed()) * 60);

		return timeToField;
	}

}
