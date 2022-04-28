package practical;

public class MP3 {

	public final static int LOWER_RATING = 1;

	// instance vars
	private int ref;
	private String artist;
	private String songName;
	private int rating;
	private int length;

	// default constructor
	public MP3() {

	}

	public MP3(int ref, String artist, String songName, int rating, int length) {
		this.setRef(ref);
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);
		this.setLength(length);
	}

	// getters and setters

	public int getRef() {
		return ref;
	}

	/**
	 * If less than zero then throw exception
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		if (ref > 0) {
			this.ref = ref;
		} else {
			throw new IllegalArgumentException("Ref less than 0");
		}
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) throws IllegalArgumentException {
		if ((rating > LOWER_RATING) && (rating < 6)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Value for rating outside range");
		}

	}

	/**
	 * @return the lowerRating
	 */
	public static int getLowerRating() {
		return LOWER_RATING;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) throws IllegalArgumentException {
		if (length >= 1 && length <= 2500) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Value for length outside range");
		}
	}
}
