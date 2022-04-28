package practical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Mp3Test {

	// test data
	int refBoundaryValid, refValid, refBoundaryInvalid, refInvalid;
	String artist;
	String songName;
	int ratingLowValid, ratingMidValid, ratingHighValid, ratingLowInvalid, ratingHighInvalid;
	int lengthLowValid, lengthMidValid, lengthHighValid, lengthLowInvalid, lengthHighInvalid;
	mp3 myMp3;

	@BeforeEach
	void setUp() throws Exception {
		refBoundaryValid = 0;
		refValid = 100;
		refBoundaryInvalid = -1;
		refInvalid = -100;

		artist = "validArtist";
		songName = "validSongName";

		ratingLowValid = 1;
		ratingMidValid = 3;
		ratingHighValid = 5;
		ratingLowInvalid = 0;
		ratingHighInvalid = 6;

		lengthLowValid = 1;
		lengthMidValid = 1300;
		lengthHighValid = 2500;
		lengthLowInvalid = 0;
		lengthHighInvalid = 2501;

		myMp3 = new mp3();
	}
	
	@Test
	void testMp3DefaultConstructor() {
		assertNotNull(myMp3);
	}

	@Test
	void testMp3NonDefaultConstructorValid() {
		myMp3 = new mp3(refValid, artist, songName, ratingMidValid, lengthMidValid);

		assertEquals(refValid, myMp3.getRef());
		assertEquals(artist, myMp3.getArtist());
		assertEquals(songName, myMp3.getSongName());
		assertEquals(ratingMidValid, myMp3.getRating());
		assertEquals(lengthMidValid, myMp3.getLength());
	}

	@Test
	void testMp3NonDefaultConstructorInvalid() {

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3 = new mp3(refInvalid, artist, songName, ratingMidValid, lengthMidValid);
		});
		

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3 = new mp3(refValid, artist, songName, ratingLowInvalid, lengthMidValid);
		});
		

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3 = new mp3(refValid, artist, songName, ratingMidValid, lengthLowInvalid);
		});
		

	}

	@Test
	void testGetSetRefValid() {
		myMp3.setRef(refValid);
		assertEquals(refValid, myMp3.getRef());

		myMp3.setRef(refBoundaryValid);
		assertEquals(refBoundaryValid, myMp3.getRef());
	}

	@Test
	void testSetRefInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRef(refBoundaryInvalid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRef(refInvalid);
		});
	}

	@Test
	void testGetSetArtistValid() {
		myMp3.setArtist(artist);
		assertEquals(artist, myMp3.getArtist());
	}

	@Test
	void testGetSetSongNameValid() {
		myMp3.setSongName(songName);
		assertEquals(songName, myMp3.getSongName());
	}

	@Test
	void testGetSetRatingValid() {
		myMp3.setRating(ratingLowValid);
		assertEquals(ratingLowValid, myMp3.getRating());

		myMp3.setRating(ratingMidValid);
		assertEquals(ratingMidValid, myMp3.getRating());

		myMp3.setRating(ratingHighValid);
		assertEquals(ratingHighValid, myMp3.getRating());
	}

	@Test
	void testSetRatingInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRating(ratingHighInvalid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRating(ratingLowInvalid);
		});
	}

	@Test
	void testGetSetLengthValid() {
		myMp3.setLength(lengthLowValid);
		assertEquals(lengthLowValid, myMp3.getLength());

		myMp3.setLength(lengthMidValid);
		assertEquals(lengthMidValid, myMp3.getLength());

		myMp3.setLength(lengthHighValid);
		assertEquals(lengthHighValid, myMp3.getLength());
	}

	@Test
	void testSetLengthInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setLength(lengthHighInvalid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setLength(lengthLowInvalid);
		});
	}

}
