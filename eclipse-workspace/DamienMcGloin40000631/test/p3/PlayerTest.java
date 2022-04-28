package p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
class PlayerTest {

	// test data
	Player player;
	
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
	
	@BeforeEach
	void setUp() throws Exception {
		
		player = new Player();
		
		countryCode = "validCode";
		firstName = "validFirstName";
		lastName = "validLastName";
		forwardOrBack = "forward";
		totalMatches = 123;
		pointsScored = 5;
		gamesWon = 10;
		sixNationsLost = 4;
		sixNationsDraw = 5;
		heightInMetres = 1.1;
		club = "validClubName";
		influence = 88;
		winPercentage = 20.5;
		
		
	}
	
	/*
	 * Tests the default constructor
	 */
	@Test
	void testPlayerDefaultConstructor() {
		assertNotNull(player);
	}

	/*
	 * Tests constructor with args
	 */
	@Test
	void testPlayerConstructorWithArgs() {
		Player player = new Player(countryCode, firstName, lastName, forwardOrBack, totalMatches, pointsScored, gamesWon, sixNationsLost, sixNationsDraw, heightInMetres, club, influence, winPercentage);
		
		assertEquals(countryCode, player.getCountryCode());
		assertEquals(firstName, player.getFirstName());
		assertEquals(lastName, player.getLastName());
		assertEquals(forwardOrBack, player.getForwardOrBack());
		assertEquals(totalMatches, player.getTotalMatches());
		assertEquals(pointsScored, player.getPointsScored());
		assertEquals(gamesWon, player.getGamesWon());
		assertEquals(sixNationsLost, player.getSixNationsLost());
		assertEquals(sixNationsDraw, player.getSixNationsDraw());
		assertEquals(heightInMetres, player.getHeightInMetres());
		assertEquals(club, player.getClub());
		assertEquals(influence, player.getInfluence());
		assertEquals(winPercentage, player.getWinPercentage());
	
	}

	/*
	 * tests you can get and set the country code
	 */
	@Test
	void testGetSetCountryCode() {
		player.setCountryCode(countryCode);
		assertEquals(countryCode, player.getCountryCode());
	}

	/*
	 * tests you can get and set the first name
	 */
	@Test
	void testGetSetFirstName() {
		player.setFirstName(firstName);
		assertEquals(firstName, player.getFirstName());
	}

	/*
	 * tests you can get and set the last name
	 */
	@Test
	void testGetSetLastName() {
		player.setLastName(lastName);
		assertEquals(lastName, player.getLastName());
	}

	/*
	 * tests you can get and set player position
	 */
	@Test
	void testGetSetForwardOrBack() {
		player.setForwardOrBack(forwardOrBack);
		assertEquals(forwardOrBack, player.getForwardOrBack());
	}

	/*
	 * tests you can get and set the total matches played
	 */
	@Test
	void testGetSetTotalMatches() {
		player.setTotalMatches(totalMatches);
		assertEquals(totalMatches, player.getTotalMatches());
	}

	/*
	 * tests you can get and set the points scored
	 */
	@Test
	void testGetSetPointsScored() {
		player.setPointsScored(pointsScored);
		assertEquals(pointsScored, player.getPointsScored());
	}

	/*
	 * tests you can get and set the games won
	 */
	@Test
	void testGetSetGamesWon() {
		player.setGamesWon(gamesWon);
		assertEquals(gamesWon, player.getGamesWon());
	}

	/*
	 * tests you can get and set the games lost
	 */
	@Test
	void testGetSetSixNationsLost() {
		player.setSixNationsLost(sixNationsLost);
		assertEquals(sixNationsLost, player.getSixNationsLost());
	}

	/*
	 * tests you can get and set the number of draws
	 */
	@Test
	void testGetSetSixNationsDraw() {
		player.setSixNationsDraw(sixNationsDraw);
		assertEquals(sixNationsDraw, player.getSixNationsDraw());
	}

	/*
	 * tests you can get and set the players height
	 */
	@Test
	void testGetSetHeightInMetres() {
		player.setHeightInMetres(heightInMetres);
		assertEquals(heightInMetres, player.getHeightInMetres());
	}

	/*
	 * tests you can get and set the club name
	 */
	@Test
	void testGetSetClub() {
		player.setClub(club);
		assertEquals(club, player.getClub());
	}

	/*
	 * tests you can get and set the influence of players
	 */
	@Test
	void testGetSetInfluence() {
		player.setInfluence(influence);
		assertEquals(influence, player.getInfluence());
	}
	
	/*
	 * tests you can get and set the win percentage
	 */
	@Test
	void testGetSetWinPercentage() {
		player.setWinPercentage(winPercentage);
		assertEquals(winPercentage, player.getWinPercentage());
	}


}
