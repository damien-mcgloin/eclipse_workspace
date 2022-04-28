/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class City1 {

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;
	
	/**
	 * 
	 */
	public City1() {
		// TODO Auto-generated constructor stub
	}
	
	public City1(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.population = population;
		this.countryCapital = countryCapital;
		this.country = country;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public boolean getCountryCapital() {
		return countryCapital;
	}
	
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City1 [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}
	
	

}
