package practice;

public class Country {
	
	private String countryName;
	private String region;
	private int example;
	private int population;
	private int example2;
	private int area;
	private int example3;
	private double density;
	
	public Country() {

	}

	public Country(String countryName, String region, int example, int population, int example2, int area, int example3,
			double density) {
		this.countryName = countryName;
		this.region = region;
		this.example = example;
		this.population = population;
		this.example2 = example2;
		this.area = area;
		this.example3 = example3;
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
	 * @return the example
	 */
	public int getExample() {
		return example;
	}

	/**
	 * @param example the example to set
	 */
	public void setExample(int example) {
		this.example = example;
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
	 * @return the example2
	 */
	public int getExample2() {
		return example2;
	}

	/**
	 * @param example2 the example2 to set
	 */
	public void setExample2(int example2) {
		this.example2 = example2;
	}

	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * @return the example3
	 */
	public int getExample3() {
		return example3;
	}

	/**
	 * @param example3 the example3 to set
	 */
	public void setExample3(int example3) {
		this.example3 = example3;
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
	
	public void showAll() {
		System.out.println("country name : "+this.countryName);
		System.out.println("region : "+this.region);
		System.out.println("example : "+this.example);
		System.out.println("population : "+this.population);
		System.out.println("example2 : "+this.example2);
		System.out.println("area : "+this.area);
		System.out.println("example3 : "+this.example3);
		System.out.println("Density : "+this.density);
	}

}
