package challenge;

public class Country {
	
	private String name;
	private String region;
	private int population;
	private int area;
	private double density;
	
	public Country() {
		
	}
	
	public Country(String name, String region, int population, int area, double density) {
		this.name = name;
		this.region = region;
		this.population = population;
		this.area = area;
		this.density = density;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
		System.out.println("Name : \t\t\t"+this.name);
		System.out.println("Region : \t\t"+this.region);
		System.out.println("Population : \t\t"+this.population);
		System.out.println("Area : \t\t\t"+this.area);
		System.out.printf("Density : \t\t%.2f",this.density);
		System.out.println();
	}

}
