/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class City {

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;

	/**
	 * 
	 */
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.setpopulation(population);
		this.countryCapital = countryCapital;
		this.country = country;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * 
	 * @return
	 */
	public int getpopulation() {
		return population;
	}

	/**
	 * 
	 * @param population
	 */
	public void setpopulation(int population) {
		if (population>=0 && population<=50) {
		this.population = population;
		} else {
			this.population = 1;
			System.out.println("Invalid population numbers");
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean getcountryCapital() {
		return countryCapital;
	}

	/**
	 * 
	 * @param countryCapital
	 */
	public void setcountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * 
	 * @return
	 */
	public String getcountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}

}
