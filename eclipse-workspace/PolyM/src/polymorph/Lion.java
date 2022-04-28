package polymorph;

public class Lion extends Animal {
	
	private String countryOfOrigin;

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public void makeNoise() {
		System.out.println("Lion makes a ROOOOOOOOARRR !");
	}	

}
