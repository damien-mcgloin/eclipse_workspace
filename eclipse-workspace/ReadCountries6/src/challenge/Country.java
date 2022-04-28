package challenge;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class Country {

	private String countryName;
	private String region;
	private int population;
	private int area;
	private double density;

	/*
	 * default constructor
	 */
	public Country() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param countryName
	 * @param region
	 * @param population
	 * @param area
	 * @param density
	 */
	public Country(String countryName, String region, int population, int area, double density) {
		this.countryName = countryName;
		this.region = region;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	/**
	 * gets the name of the country
	 * 
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * sets the name of the country
	 * 
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * gets the name of the region
	 * 
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * sets the region
	 * 
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * gets the population
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * sets the population
	 * 
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/**
	 * gets the area - int value
	 * 
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * sets the area
	 * 
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * gets the density - double
	 * 
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * sets the density
	 * 
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	
	public void showAll() {
		System.out.println("Name       : \t"+this.countryName);
		System.out.println("Region     : \t"+this.region);
		System.out.println("Population : \t"+this.population);
		System.out.println("Area       : \t"+this.area);
		System.out.printf("Density    : \t%.2f\n",this.density);
	}

}
