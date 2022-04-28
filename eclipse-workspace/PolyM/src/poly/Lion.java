package poly;

public class Lion extends Animal {

	public String countryOfOrigin;
	
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public void makeNoise() {
		System.out.println("Lion makes a ROOOOOOOARRR !");
	}

	

}
