package p3;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class Player {
	
	// instance vars
	private String countryCode;
	private String firstName;
	private String lastName;
	private String forwardOrBack;
	private int totalMatches;
	private int pointsScored;
	private int gamesWon;
	private int sixNationsLost;
	private int sixNationsDraw;
	private double heightInMetres;
	private String club;
	private int influence;
	private double winPercentage; 
	
	// default constructor
	public Player() {

	}

	// constructor with args
	public Player(String countryCode, String firstName, String lastName, String forwardOrBack, int totalMatches,
			int pointsScored, int gamesWon, int sixNationsLost, int sixNationsDraw, double heightInMetres, String club,
			int influence, double winPercentage) {
		this.countryCode = countryCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.forwardOrBack = forwardOrBack;
		this.totalMatches = totalMatches;
		this.pointsScored = pointsScored;
		this.gamesWon = gamesWon;
		this.sixNationsLost = sixNationsLost;
		this.sixNationsDraw = sixNationsDraw;
		this.heightInMetres = heightInMetres;
		this.club = club;
		this.influence = influence;
		this.winPercentage = winPercentage;
	}

	/**
	 * gets the players country code
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * sets the players country code
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * gets the players first name
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * sets the players first name
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * gets the players last name
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * sets the players last name
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * gets the players position - forward or back
	 * @return the forwardOrBack
	 */
	public String getForwardOrBack() {
		return forwardOrBack;
	}

	/**
	 * sets the players position - forward or back
	 * @param forwardOrBack the forwardOrBack to set
	 */
	public void setForwardOrBack(String forwardOrBack) {
		this.forwardOrBack = forwardOrBack;
	}

	/**
	 * gets the total matches played
	 * @return the totalMatches
	 */
	public int getTotalMatches() {
		return totalMatches;
	}

	/**
	 * sets the total matches played
	 * @param totalMatches the totalMatches to set
	 */
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	/**
	 * gets the points scored
	 * @return the pointsScored
	 */
	public int getPointsScored() {
		return pointsScored;
	}

	/**
	 * sets the points scored
	 * @param pointsScored the pointsScored to set
	 */
	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}

	/**
	 * gets the number of games won
	 * @return the gamesWon
	 */
	public int getGamesWon() {
		return gamesWon;
	}

	/**
	 * sets the total number of games won
	 * @param gamesWon the gamesWon to set
	 */
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	/**
	 * gets the number of six nations games lost
	 * @return the sixNationsLost
	 */
	public int getSixNationsLost() {
		return sixNationsLost;
	}

	/**
	 * sets the number of six nations games lost
	 * @param sixNationsLost the sixNationsLost to set
	 */
	public void setSixNationsLost(int sixNationsLost) {
		this.sixNationsLost = sixNationsLost;
	}

	/**
	 * gets the number of draw matches
	 * @return the sixNationsDraw
	 */
	public int getSixNationsDraw() {
		return sixNationsDraw;
	}

	/**
	 * sets the number of draw matches
	 * @param sixNationsDraw the sixNationsDraw to set
	 */
	public void setSixNationsDraw(int sixNationsDraw) {
		this.sixNationsDraw = sixNationsDraw;
	}

	/**
	 * gets the players height in metres
	 * @return the heightInMetres
	 */
	public double getHeightInMetres() {
		return heightInMetres;
	}

	/**
	 * sets the players height in metres
	 * @param heightInMetres the heightInMetres to set
	 */
	public void setHeightInMetres(double heightInMetres) {
		this.heightInMetres = heightInMetres;
	}

	/**
	 * gets the players club
	 * @return the club
	 */
	public String getClub() {
		return club;
	}

	/**
	 * sets the players club
	 * @param club the club to set
	 */
	public void setClub(String club) {
		this.club = club;
	}

	/**
	 * gets the players influence
	 * @return the influence
	 */
	public int getInfluence() {
		return influence;
	}

	/**
	 * sets the players influence
	 * @param influence the influence to set
	 */
	public void setInfluence(int influence) {
		this.influence = influence;
	}
	
	/**
	 * gets the players win percentage
	 * @return the winPercentage
	 */
	public double getWinPercentage() {
		return winPercentage;
	}

	/**
	 * sets the players win percentage
	 * @param winPercentage the winPercentage to set
	 */
	public void setWinPercentage(double winPercentage) {
		this.winPercentage = winPercentage;
	}
	
	/**
	 * prints all player data to screen
	 */
	public void showAllData() {
		System.out.println("Country Code       : "+this.countryCode);
		System.out.println("First Name         : "+this.firstName);
		System.out.println("Last Name          : "+this.lastName);
		System.out.println("Forward or Back    : "+this.forwardOrBack);
		System.out.println("Total matches      : "+this.totalMatches);
		System.out.println("Points Scored      : "+this.pointsScored);
		System.out.println("Games won          : "+this.gamesWon);
		System.out.println("Six Nations Lost   : "+this.sixNationsLost);
		System.out.println("Six Nations Draw   : "+this.sixNationsDraw);
		System.out.println("Height (in metres) : "+this.heightInMetres);
		System.out.println("Club               : "+this.club);
		System.out.println("Influence          : "+this.influence);
		System.out.println("Win Percentage     : "+this.winPercentage);
	}
		
}
