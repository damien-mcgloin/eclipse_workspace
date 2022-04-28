package mobilephone2;

public class MobilePhone {

	private String make;
	private String model;
	private int rating;
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(String make, String model, int rating) {
		this.make = make;
		this.model = model;
		this.rating = rating;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MobilePhone [make=" + make + ", model=" + model + ", rating=" + rating + "]";
	}
	
}
