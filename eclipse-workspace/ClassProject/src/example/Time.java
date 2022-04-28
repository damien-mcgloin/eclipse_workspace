package example;

public class Time {

	private static final int MAX_HOUR = 12;
	private static final int MIN_HOUR = 0;

	/**
	 * The hour : valid values 0- {@value #MAX_HOUR}
	 */
	private int hour;

	/**
	 * The minute to be set ! : valid values {@value #MIN_HOUR} -59
	 */
	private int minute;
	/** The second : valid values 0-59 */
	private int second;

	/**
	 * This no argument constructor sets each instance variable to zero. This
	 * ensures that all time objects start at a constant state.
	 * 
	 * @throws Exception
	 */
	public Time() throws Exception {
		this(0, 0, 0);
	}

	/**
	 * * Time constructor - argument based.
	 * 
	 * @param hour   - the hour {@value=#MAX_HOUR}
	 * @param minute - the minute {@link #MIN_HOUR}
	 * @param second - the second
	 * @throws Exception - in the case of a non valid value
	 */
	public Time(int hour, int minute, int second) throws Exception {
		this.setHour(hour);
	}

	/**
	 * Gets the hour value
	 * 
	 * @return an <code>integer</code> specifying the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Sets the hour
	 * 
	 * @param hour valid between 0- {@value #MAX_HOUR} (inclusive)
	 * @throws Exception
	 */
	public void setHour(int hour) throws Exception {
		if (hour > MIN_HOUR && hour < MAX_HOUR) {
			this.hour = hour;
		} else {
			throw (new Exception());
		}
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set {@link #MIN_HOUR}
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * 
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;

	}

	/**
	 * Convert a time to Universal Time format
	 * 
	 * @return a <code>String</code> representing time in universal format
	 */
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
	}

}
