package practical;

public class mp3 {

	public final static int LOW_REF = 0;
	public final static int LOWER_RATING = 1;
	public final static int UPPER_RATING = 5;
	public final static int LOWER_LENGTH = 1;
	public final static int UPPER_LENGTH = 2500;

	private int ref;
	private String artist;
	private String songName;
	private int rating;
	private int length;

	public mp3() {

	}

	public mp3(int ref, String artist, String songName, int rating, int length) {
		this.setRef(ref);
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);
		this.setLength(length);
	}

	public int getRef() {
		return ref;
	}

	/**
	 * If less than zero then throw exception
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		if (ref >= LOW_REF) {
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
		if ((rating >= LOWER_RATING) && (rating <= UPPER_RATING)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Invalid rating - outside range 1-5");
		}

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) throws IllegalArgumentException {
		if ((length >= LOWER_LENGTH) && (length <= UPPER_LENGTH)) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Invalid length - outside range 1-2500");
		}
	}

}