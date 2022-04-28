/**
 * 
 */
package mobilephone;

/**
 * @author damienmcgloin
 *
 */
public class MobilePhone {
	
	private String make;
	private int model;
	private int rating;
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(String make, int model, int rating) {
		this.make = make;
		this.model = model;
		this.setRating(rating);
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
	public int getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(int model) {
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
		if(this.rating>0 && this.rating<=5) {
		this.rating = rating;
		} else {
			System.out.println("Error - Invalid Entry");
		}
	}

	@Override
	public String toString() {
		return "MobilePhone [make=" + make + ", model=" + model + ", rating=" + rating + "]";
	}	

}
