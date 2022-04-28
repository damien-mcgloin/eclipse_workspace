/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class CityAdmin1 {

	/**
	 * 
	 */
	public CityAdmin1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		City1 c1 = new City1("Beijing", 11, true, "China");
		City1 c2 = new City1("Madrid", 5, true, "Spain");
		City1 c3 = new City1("Rome", 6, true, "Italy");
		City1 c4 = new City1("New York", 8, false, "USA");
		City1 c5 = new City1("Washington", 2, true, "USA");
		City1 c6 = new City1("Dallas", 3, false, "USA");

		City1[] cities = { c1, c2, c3, c4, c5, c6 };
		
		displayAll(cities);
		smallestPopulation(cities);
		cityCapitals(cities);
		usaCities(cities);
		averagePopulation(cities);

	}

	public static void displayAll(City1[] cities) {
		System.out.println("Displaying all cities");
		for(City1 city : cities) {
			System.out.println(city.toString());
		}

	}
	
	public static void smallestPopulation(City1[] cities) {
		
		System.out.println("The smallest population is...");
		
		int min = cities[0].getPopulation();
		for(int loop = 0; loop<cities.length; loop++) {
			if(min>cities[loop].getPopulation()) {
				min = cities[loop].getPopulation();
			}
		}
		
		System.out.println(min);
	}
	
	public static void cityCapitals(City1[] cities) {
		
		System.out.println("The cities which are capitals of their countries are...");
		
		for(int loop = 0; loop<cities.length; loop++) {
			if(cities[loop].getCountryCapital()==true) {
				System.out.println(cities[loop].getCityName()+", "+cities[loop].getCountry());
			}
		}
		
	}
	
	public static void usaCities(City1[] cities) {
		
		System.out.println("The cities from the USA...");
		
		for(int loop = 0; loop<cities.length; loop++) {
			if(cities[loop].getCountry().equalsIgnoreCase("USA")) {
				System.out.println(cities[loop].getCityName());
			}
		}
		
	}
	
	public static void averagePopulation(City1[] cities) {
		
		int total = 0;
		
		for(int loop = 0; loop<cities.length; loop++) {
			total+=cities[loop].getPopulation();
		}
		
		System.out.printf("The average population is %.2f",(double)total/cities.length);
		
	}

}
