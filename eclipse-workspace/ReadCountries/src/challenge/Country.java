package challenge;

public class Country {
	
	private String countryName;
	private String region;
	private int population;
	private int area;
	private double density;
	
	public Country() {
		
	}
	
	public Country(String countryName, String region, int population, int area, double density) {
		this.countryName = countryName;
		this.region = region;
		this.population = population;
		this.area = area;
		this.density = density;
	}
	
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * @return the miles
	 */
	public int getArea() {
		return area;
	}
	/**
	 * @param miles the miles to set
	 */
	public void setArea(int area) {
		this.area = area;
	}
	
	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	public void displayAllCountryDetails() {
		System.out.println("Name \t\t:"+this.countryName);
		System.out.println("Region \t\t:"+this.region);
		System.out.println("population \t:"+this.population);
		System.out.println("area \t\t:"+this.area);
		System.out.printf("density \t:%.2f\n\n",this.density);
	}
	
	public void displayPopulationAndName() {
		System.out.println(this.population+"       \t"+this.getCountryName());
	}
	
	public void displayRegionAndName() {
		System.out.println(this.region + " " +this.countryName);
	}

}
