/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create the cities
		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");
		
		// add to an array
		City[] cities = {c1, c2, c3, c4, c5, c6};
		
		// show all
		displayAll(cities);
		
		// searching for the smallest city
		smallestCity(cities);
		
		// capital cities search
		capitalCitySearch(cities);
		
		// city by country search
		cityByCountry(cities, "USA");
		
		// cities population average
		averagePopulation(cities);

	}
	
	public static void displayAll(City[] cities) {
		
		System.out.println("Displaying all city info...");
		
		for (City city : cities) {
			System.out.println(city.toString());
		}
		
	}
	
	public static void smallestCity(City[] cities) {
		
		int min = cities[0].getpopulation();
		
		for(int loop = 0; loop< cities.length; loop++) {
			if(cities[loop].getpopulation() < min) {
				min = cities[loop].getpopulation();
			}
		}
		
		System.out.println("The smallest population is : "+min);
		
	}
	
	public static void capitalCitySearch(City[] cities) {
		
		System.out.println("The cities that are capitals of their countries...");
		
		for(int loop = 0; loop< cities.length; loop++) {
			if(cities[loop].getcountryCapital() == true) {
				System.out.println(cities[loop].getCityName() + ", " + cities[loop].getcountry());
			}
		}
		
	}
	
	public static void cityByCountry(City[] cities, String country) {
		
		System.out.println("These cities are from the USA");
		
		for(int loop = 0; loop<cities.length; loop++) {
			if(cities[loop].getcountry().equalsIgnoreCase("USA")) {
				System.out.println(cities[loop].getCityName());
			}
		}
		
	}
	
	public static void averagePopulation(City[] cities) {
		
		System.out.println("Average population ...");
		int total = 0;
		
		for (int loop = 0; loop<cities.length; loop++) {
			total += cities[loop].getpopulation();
		}
		
			System.out.printf("Average population is %.2f", (double) total / cities.length);
		
	}

}
