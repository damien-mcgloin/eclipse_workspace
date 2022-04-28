/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class Flight1 {

	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;

	/**
	 * 
	 */
	public Flight1() {
		// TODO Auto-generated constructor stub
	}

	public Flight1(String flightNumber, String destination, String origin, double duration) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.setDuration(duration);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if(duration<=18) {
		this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Invalid flight duration");
		}
	}

	@Override
	public String toString() {
		return "Flight1 [flightNumber=" + flightNumber + ", destination=" + destination + ", origin=" + origin
				+ ", duration=" + duration + "]";
	}
	
	

}
