package football;

public class Match {

	private final int YEAR_LOWEST = 1930;
	private final int HOST_MIN_CHAR = 1;
	private final int HOST_MAX_CHAR = 29;
	private final int STAGE_MIN_CHAR = 1;
	private final int STAGE_MAX_CHAR = 49;
	private final int STADIUM_MIN_CHAR = 1;
	private final int STADIUM_MAX_CHAR = 79;
	private final int CITY_MIN_CHAR = 1;
	private final int CITY_MAX_CHAR = 39;
	private final int ATTENDANCE_LOWEST = 0;
	private final int ATTENDANCE_HIGHEST = 200000;
	private final int HTNAME_LOWEST = 1;
	private final int HTNAME_HIGHEST = 34;
	private final int ATNAME_LOWEST = 1;
	private final int ATNAME_HIGHEST = 34;
	private final int HTGOALS_LOWEST = 0;
	private final int HTGOALS_HIGHEST = 15;
	private final int ATGOALS_LOWEST = 0;
	private final int ATGOALS_HIGHEST = 15;
	private final int HTHGOALS_LOWEST = 0;
	private final int HTHGOALS_HIGHEST = 15;
	private final int HTAGOALS_LOWEST = 0;
	private final int HTAGOALS_HIGHEST = 15;
	private final int HTINITIALS = 3;
	private final int ATINITIALS = 3;

	private int year;
	private String host;
	private String stage;
	private String stadium;
	private String city;
	private int attendance;
	private String homeTeamName;
	private int homeTeamGoals;
	private int awayTeamGoals;
	private String awayTeamName;
	private String winConditions;
	private int halfTimeHomeGoals;
	private int halfTimeAwayGoals;
	private String homeTeamInitials;
	private String awayTeamInitials;

	public Match() {

	}

	public Match(int year, String host, String stage, String stadium, String city, int attendance, String homeTeamName,
			int homeTeamGoals, int awayTeamGoals, String awayTeamName, String winConditions, int halfTimeHomeGoals,
			int halfTimeAwayGoals, String homeTeamInitials, String awayTeamInitials) {
		this.year = year;
		this.host = host;
		this.stage = stage;
		this.stadium = stadium;
		this.city = city;
		this.attendance = attendance;
		this.homeTeamName = homeTeamName;
		this.homeTeamGoals = homeTeamGoals;
		this.awayTeamGoals = awayTeamGoals;
		this.awayTeamName = awayTeamName;
		this.winConditions = winConditions;
		this.homeTeamInitials = homeTeamInitials;
		this.awayTeamInitials = awayTeamInitials;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) throws IllegalArgumentException {
		if (year >= YEAR_LOWEST) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Year outside valid range");
		}
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) throws IllegalArgumentException {
		if (host.length() >= HOST_MIN_CHAR && host.length() <= HOST_MAX_CHAR) {
			this.host = host;
		} else {
			throw new IllegalArgumentException("Host outside valid range");
		}
	}

	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) throws IllegalArgumentException {
		if (stage.length() >= STAGE_MIN_CHAR && stage.length() <= STAGE_MAX_CHAR) {
			this.stage = stage;
		} else {
			throw new IllegalArgumentException("Stage outside valid range");
		}
	}

	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(String stadium) throws IllegalArgumentException {
		if (stadium.length() >= STADIUM_MIN_CHAR && stadium.length() <= STADIUM_MAX_CHAR) {
			this.stadium = stadium;
		} else {
			throw new IllegalArgumentException("Stage outside valid range");
		}
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) throws IllegalArgumentException {
		if (city.length() >= CITY_MIN_CHAR && city.length() <= CITY_MAX_CHAR) {
			this.city = city;
		} else {
			throw new IllegalArgumentException("City outside valid range");
		}
	}

	/**
	 * @return the attendance
	 */
	public int getAttendance() {
		return attendance;
	}

	/**
	 * @param attendance the attendance to set
	 */
	public void setAttendance(int attendance) throws IllegalArgumentException {
		if (attendance >= ATTENDANCE_LOWEST && attendance <= ATTENDANCE_HIGHEST) {
			this.attendance = attendance;
		} else {
			throw new IllegalArgumentException("Attendance outside valid range");
		}
	}

	/**
	 * @return the homeTeamName
	 */
	public String getHomeTeamName() {
		return homeTeamName;
	}

	/**
	 * @param homeTeamName the homeTeamName to set
	 */
	public void setHomeTeamName(String homeTeamName) throws IllegalArgumentException {
		if (homeTeamName.length() >= HTNAME_LOWEST && homeTeamName.length() <= HTNAME_HIGHEST) {
			this.homeTeamName = homeTeamName;
		} else {
			throw new IllegalArgumentException("Home Team Name outside valid range");
		}
	}

	/**
	 * @return the homeTeamGoals
	 */
	public int getHomeTeamGoals() {
		return homeTeamGoals;
	}

	/**
	 * @param homeTeamGoals the homeTeamGoals to set
	 */
	public void setHomeTeamGoals(int homeTeamGoals) throws IllegalArgumentException {
		if (homeTeamGoals >= HTGOALS_LOWEST && homeTeamGoals <= HTGOALS_HIGHEST) {
			this.homeTeamGoals = homeTeamGoals;
		} else {
			throw new IllegalArgumentException("Home Team Goals outside valid range");
		}
	}

	/**
	 * @return the awayTeamGoals
	 */
	public int getAwayTeamGoals() {
		return awayTeamGoals;
	}

	/**
	 * @param awayTeamGoals the awayTeamGoals to set
	 */
	public void setAwayTeamGoals(int awayTeamGoals) throws IllegalArgumentException {
		if (awayTeamGoals >= ATGOALS_LOWEST && awayTeamGoals <= ATGOALS_HIGHEST) {
			this.awayTeamGoals = awayTeamGoals;
		} else {
			throw new IllegalArgumentException("Away Team Goals outside valid range");
		}
	}

	/**
	 * @return the awayTeamName
	 */
	public String getAwayTeamName() {
		return awayTeamName;
	}

	/**
	 * @param awayTeamName the awayTeamName to set
	 */
	public void setAwayTeamName(String awayTeamName) throws IllegalArgumentException {
		if (awayTeamName.length() >= ATNAME_LOWEST && awayTeamName.length() <= ATNAME_HIGHEST) {
			this.awayTeamName = awayTeamName;
		} else {
			throw new IllegalArgumentException("Away Team Name outside valid range");
		}
	}

	/**
	 * @return the winConditions
	 */
	public String getWinConditions() {
		return winConditions;
	}

	/**
	 * @param winConditions the winConditions to set
	 */
	public void setWinConditions(String winConditions) throws IllegalArgumentException {
		if (winConditions.equalsIgnoreCase("et") || winConditions.equalsIgnoreCase("hwp")
				|| winConditions.equalsIgnoreCase("awp") || winConditions.equals(" ")) {
			this.winConditions = winConditions;
		} else {
			throw new IllegalArgumentException("Win Conditions invalid");
		}
	}

	/**
	 * @return the halfTimeHomeGoals
	 */
	public int getHalfTimeHomeGoals() {
		return halfTimeHomeGoals;
	}

	/**
	 * @param halfTimeHomeGoals the halfTimeHomeGoals to set
	 */
	public void setHalfTimeHomeGoals(int halfTimeHomeGoals) throws IllegalArgumentException {
		if (halfTimeHomeGoals >= HTHGOALS_LOWEST && halfTimeHomeGoals <= HTHGOALS_HIGHEST) {
			this.halfTimeHomeGoals = halfTimeHomeGoals;
		} else {
			throw new IllegalArgumentException("half time home goals invalid");
		}
	}

	/**
	 * @return the halfTimeAwayGoals
	 */
	public int getHalfTimeAwayGoals() {
		return halfTimeAwayGoals;
	}

	/**
	 * @param halfTimeAwayGoals the halfTimeAwayGoals to set
	 */
	public void setHalfTimeAwayGoals(int halfTimeAwayGoals) throws IllegalArgumentException {
		if (halfTimeAwayGoals >= HTAGOALS_LOWEST && halfTimeAwayGoals <= HTAGOALS_HIGHEST) {
			this.halfTimeAwayGoals = halfTimeAwayGoals;
		} else {
			throw new IllegalArgumentException("half time away goals invalid");
		}
	}

	/**
	 * @return the homeTeamInitials
	 */
	public String getHomeTeamInitials() {
		return homeTeamInitials;
	}

	/**
	 * @param homeTeamInitials the homeTeamInitials to set
	 */
	public void setHomeTeamInitials(String homeTeamInitials) throws IllegalArgumentException {
		if (homeTeamInitials.length() == HTINITIALS) {
			this.homeTeamInitials = homeTeamInitials;
		} else {
			throw new IllegalArgumentException("Home team initials invalid");
		}
	}

	/**
	 * @return the awayTeamInitials
	 */
	public String getAwayTeamInitials() {
		return awayTeamInitials;
	}

	/**
	 * @param awayTeamInitials the awayTeamInitials to set
	 */
	public void setAwayTeamInitials(String awayTeamInitials) throws IllegalArgumentException {
		if (awayTeamInitials.length() == ATINITIALS) {
			this.awayTeamInitials = awayTeamInitials;
		} else {
			throw new IllegalArgumentException("Away team initials invalid");
		}
	}

	@Override
	public String toString() {
		return "Match [year=" + year + ", host=" + host + ", stage=" + stage + ", stadium=" + stadium + ", city=" + city
				+ ", attendance=" + attendance + ", homeTeamName=" + homeTeamName + ", homeTeamGoals=" + homeTeamGoals
				+ ", awayTeamGoals=" + awayTeamGoals + ", awayTeamName=" + awayTeamName + ", winConditions="
				+ winConditions + ", halfTimeHomeGoals=" + halfTimeHomeGoals + ", halfTimeAwayGoals="
				+ halfTimeAwayGoals + ", homeTeamInitials=" + homeTeamInitials + ", awayTeamInitials="
				+ awayTeamInitials + "]";
	}

}
