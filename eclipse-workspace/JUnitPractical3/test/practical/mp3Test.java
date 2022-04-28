package practical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mp3Test {

	// test data
	int refValid, refInvalid,
	ratingLowerValid, ratingMidValid, ratingUpperValid, ratingLowerInvalid, ratingUpperInvalid, 
	lengthValidLower, lengthValidMid, lengthValidUpper, lengthInvalidLower, lengthInvalidUpper;
	String artist, songName;
	mp3 myMp3;
	
	@BeforeEach
	void setUp() throws Exception {
		refValid = 0;
		refInvalid = -1;
		
		ratingLowerValid = 1;
		ratingMidValid = 3;
		ratingUpperValid = 5;
		ratingLowerInvalid = 0;
		ratingUpperInvalid = 6;
		
		lengthValidLower = 1;
		lengthValidMid = 1300;
		lengthValidUpper = 2500;
		lengthInvalidLower = 0;
		lengthInvalidUpper = 2501;
		
		artist = "validArtist";
		songName = "validSongName";
		
		myMp3 = new mp3();
	}

	@Test
	void testDefaultConstructor() {
		myMp3 = new mp3();
		
		assertNotNull(myMp3);
	}

	@Test
	void testNonDefaultConstructor() {
		myMp3.setRef(refValid);
		myMp3.setRating(ratingMidValid);
		myMp3.setLength(lengthValidMid);
		myMp3.setArtist(artist);
		myMp3.setSongName(songName);
		
		assertEquals(refValid, myMp3.getRef());
		assertEquals(ratingMidValid, myMp3.getRating());
		assertEquals(lengthValidMid, myMp3.getLength());
		assertEquals(artist, myMp3.getArtist());
		assertEquals(songName, myMp3.getSongName());
	}
	
	@Test
	void testNonDefaultConstructorInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> {
			mp3 myMp3 = new mp3(refInvalid, artist, songName, ratingMidValid, lengthValidMid);
			assertEquals(refInvalid, myMp3.getRef());
		});
		
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, ()-> {
			mp3 myMp3 = new mp3(refValid, artist, songName, ratingLowerInvalid, lengthValidMid);
			assertEquals(ratingLowerInvalid, myMp3.getRating());
		});
		
		IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, ()-> {
			mp3 myMp3 = new mp3(refValid, artist, songName, ratingMidValid, lengthInvalidLower);
			assertEquals(lengthInvalidLower, myMp3.getLength());
		});
		
		assertEquals("Ref less than 0", exception.getMessage());
		assertEquals("Invalid Rating", exception1.getMessage());
		assertEquals("Invalid Length", exception2.getMessage());

	}

	@Test
	void testGetSetRef() {
		myMp3.setRef(refValid);
		
		assertEquals(refValid, myMp3.getRef());
	}
	
	@Test
	void testSetRefInvalid() {
		assertThrows(IllegalArgumentException.class, ()-> {
			myMp3.setRef(refInvalid);
		});
	}

	@Test
	void testGetSetArtist() {
		myMp3.setArtist(artist);
		
		assertEquals(artist, myMp3.getArtist());
	}

	@Test
	void testGetSetSongName() {
		myMp3.setSongName(songName);
		
		assertEquals(songName, myMp3.getSongName());
	}

	@Test
	void testGetSetRating() {
		myMp3.setRating(ratingMidValid);
		
		assertEquals(ratingMidValid, myMp3.getRating());
	}

	@Test
	void testGetSetLength() {
		myMp3.setLength(lengthValidMid);
		
		assertEquals(lengthValidMid, myMp3.getLength());
	}

}
