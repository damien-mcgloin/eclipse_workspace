/**
 * 
 */
package practical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author damienmcgloin
 *
 */
class MP3Test {

	// test data
	int refNumberValid, refNumberInvalid, ratingValid, ratingInvalidLower, ratingInvalidUpper, lengthValid,
			lengthInvalid;
	String songNameValid, songNameInvalid, artistValid, artistInvalid;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		refNumberValid = 1;
		refNumberInvalid = -1;
		ratingValid = 2;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;

		songNameValid = "validSongName";
		songNameInvalid = "invalidSongName";
		artistValid = "artistValid";
		artistInvalid = "invalidArtist";
		lengthValid = 1;
		lengthInvalid = -1;
	}

	/**
	 * Testing default constructor
	 */
	@Test
	public void testMP3ConstructorDefault() {
		MP3 mp3 = new MP3();
		assertNotNull(mp3);
	}

	/**
	 * 
	 */
	@Test
	void testMp3NonDefaultConstructor() {
		MP3 mp3 = new MP3(refNumberValid, artistValid, songNameValid, ratingValid, lengthValid);
		assertNotNull(mp3);

		// testing valid
		assertEquals(refNumberValid, mp3.getRef());
	}

	/**
	 * Test method for {@link practical.MP3#setRef(int)}.
	 */
	@Test
	void testGetSetRefValidValues() {
		MP3 mp3 = new MP3();
		mp3.setRef(refNumberValid);

		assertEquals(refNumberValid, mp3.getRef());
	}

	/**
	 * Test method for {@link practical.MP3#setRef(int)}.
	 */
	@Test
	void testSetRefInvalidValues() {
		MP3 mp3 = new MP3();
		assertThrows(IllegalArgumentException.class, () -> {
			mp3.setRef(refNumberInvalid);
		});
	}

	/**
	 * Test method for {@link practical.MP3#setArtist(java.lang.String)}.
	 */
	@Test
	void testGetSetArtist() {
		MP3 mp3 = new MP3();
		mp3.setArtist(artistValid);

		assertEquals(artistValid, mp3.getArtist());
	}

	/**
	 * Test method for {@link practical.MP3#setSongName(java.lang.String)}.
	 */
	@Test
	void testGetSetSongName() {
		MP3 mp3 = new MP3();
		mp3.setSongName(songNameValid);

		assertEquals(songNameValid, mp3.getSongName());
	}

	/**
	 * Test method for {@link practical.MP3#setRating(int)}.
	 */
	@Test
	void testSetGetRatingValidValues() {
		MP3 mp3 = new MP3();
		mp3.setRating(ratingValid);
		assertEquals(ratingValid, mp3.getRating());
	}

	/**
	 * (expected = illegalArgumentException.class)
	 */
	@Test
	void testSetRatingInvalidValuesLower() {
		MP3 mp3 = new MP3();
		assertThrows(IllegalArgumentException.class, () -> {
			mp3.setRating(ratingInvalidLower);
		});
	}

	/**
	 * (expected = illegalArgumentException.class)
	 */
	@Test
	void testSetRatingInvalidValuesUpper() {
		MP3 mp3 = new MP3();
		assertThrows(IllegalArgumentException.class, () -> {
			mp3.setRating(ratingInvalidUpper);
		});
	}

	/**
	 * 
	 */
	@Test
	void testGetSetLengthValidValues() {
		MP3 mp3 = new MP3();
		mp3.setLength(lengthValid);

		assertEquals(lengthValid, mp3.getLength());
	}

	/**
	 * 
	 */
	@Test
	void testSetLengthInvalidValues() {
		MP3 mp3 = new MP3();
		assertThrows(IllegalArgumentException.class, () -> {
			mp3.setRating(lengthInvalid);
		});
	}

}
