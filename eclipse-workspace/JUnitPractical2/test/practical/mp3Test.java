package practical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mp3Test {

	// test data
	int validRef, notValidRef, validRating, validUpperRating, validLowerRating, notValidRating,
	validLength, validUpperLength, validLowerLength, notValidLength;
	String artist, songName;
	mp3 myMp3;
	
	@BeforeEach
	void setUp() throws Exception {
		validRef = 4567;
		notValidRef = -5;
		validRating = 3;
		validUpperRating = 5;
		validLowerRating = 1;
		notValidRating = 0;
		validLength = 1300;
		validUpperLength = 2500;
		validLowerLength = 1;
		notValidLength = 0;
		artist = "validArtist";
		songName = "validSongName";
	}

	@Test
	void testMp3DefaultConstructor() {
		mp3 myMp3 = new mp3();
		assertNotNull(myMp3);
	}

	@Test
	void testMp3NonDefaultConstructor() {
		mp3 myMp3 = new mp3(validRef, artist, songName, validRating, validLength);
		assertEquals(validRef, myMp3.getRef());
		assertEquals(artist, myMp3.getArtist());
		assertEquals(songName, myMp3.getSongName());
		assertEquals(validRating, myMp3.getRating());
		assertEquals(validLength, myMp3.getLength());
	}

	@Test
	void testGetSetValidRef() {
		mp3 myMp3 = new mp3();
		myMp3.setRef(validRef);
		
		assertEquals(validRef, myMp3.getRef());
	}
	
	@Test
	void testSetNotValidRef() {
		mp3 myMp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRef(notValidRef);
		});
	}

	@Test
	void testGetSetValidArtist() {
		mp3 myMp3 = new mp3();
		myMp3.setArtist(artist);
		
		assertEquals(artist, myMp3.getArtist());
	}

	@Test
	void testGetSetValidSongName() {
		mp3 myMp3 = new mp3();
		myMp3.setSongName(songName);
		
		assertEquals(songName, myMp3.getSongName());
	}

	@Test
	void testGetSetValidRating() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(validRating);
		
		assertEquals(validRating, myMp3.getRating());
	}
	
	@Test
	void testGetSetValidLowerRating() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(validLowerRating);
		
		assertEquals(validLowerRating, myMp3.getRating());
	}
	
	@Test
	void testGetSetValidUpperRating() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(validUpperRating);
		
		assertEquals(validUpperRating, myMp3.getRating());
	}
	
	@Test
	void testSetNotValidRating() {
		mp3 myMp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setRating(notValidRating);
		});
	}
	
	@Test
	void testGetSetValidLength() {
		mp3 myMp3 = new mp3();
		myMp3.setLength(validLength);
		
		assertEquals(validLength, myMp3.getLength());
	}
	
	@Test
	void testGetSetValidUpperLength() {
		mp3 myMp3 = new mp3();
		myMp3.setLength(validUpperLength);
		
		assertEquals(validUpperLength, myMp3.getLength());
	}
	
	@Test
	void testGetSetValidLowerLength() {
		mp3 myMp3 = new mp3();
		myMp3.setLength(validLowerLength);
		
		assertEquals(validLowerLength, myMp3.getLength());
	}
	
	@Test
	void testSetNotValidLength() {
		mp3 myMp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
			myMp3.setLength(notValidLength);
		});
	}

}
