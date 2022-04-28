package csvcountry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class Starter extends Thread {

	// stores the country data
	public static List<Country> countries = new ArrayList<Country>();
	public static Queue<Country> wholeText = new LinkedList<Country>();
	public static FileReadToScreen fileReadToScreen = new FileReadToScreen();

	/**
	 * Start point for the app
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		readCountryData();
		// showAllCountryData(countries);

		// some data analysis

		// 1. Show each country by region
		System.out.println("Regional data - Asia");
		List<Country> regionalCountries = getCountriesByRegion("Asia");
		showCountryAndRegionData(regionalCountries);

		// 2. sort and show each county by population (ascending)
		System.out.println("Countries by population ascending");
		Collections.sort(countries, new CompareByPopulation());
		showCountryByPopulation(countries);

		// loads more you expand and try out ... e.g.
		getTotalPopPerRegion(); // this one groups info per region - note use of longs !

		// sort and show each county by population descending

		// find the country with the highest population density
		regionWithHighestDensityUltimate();

		// sort all counties by population density
		sortByDensity(countries);

		// write the data (in the list) to a new csv file...
		// writeAllData(countries);

		//changeString(countries);

		//threadReader();
		

	}

	/**
	 * Gets total population per region
	 */
	public static void getTotalPopPerRegion() {
		Map<String, Long> regions = new HashMap<String, Long>();

		for (Country c : countries) {
			// if new region found add
			if (!regions.containsKey(c.getRegion())) {
				// new region and add population to the region
				regions.put(c.getRegion(), (long) c.getPopulation());
				System.out.println("Added " + c.getRegion() + " " + c.getName());
			} else {
				// have this region and a current total so need to update
				Long currentPop = regions.get(c.getRegion());
				Long updatePop = currentPop += (long) c.getPopulation();
				regions.put(c.getRegion(), updatePop);
			}
		}

		// data per region collected
		System.out.println("Regions ");
		for (String region : regions.keySet()) {
			System.out.println(region + " : " + regions.get(region));
		}
	}

	/**
	 * Reads in and cleans the country data file
	 */
	public static void readCountryData() {
		File file = new File("countries.csv");

		FileReader fileReader;
		BufferedReader bufferedReader;
		String countryInfo;
		String[] stats;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// parse each data point - by comma
			bufferedReader.readLine();
			// remove the header values
			countryInfo = bufferedReader.readLine();

			String region;

			do {
				// create a country
				Country country = new Country();
				stats = countryInfo.split(",");

				// parse info into parts

				// Country Region Population Area (sq. mi.)
				country.setName(stats[0].trim());

				// REGION : cleaning this one... Eastern Europe and Western Europe should be
				// recorded as Europe
				// SUB-SAHARAN AFRICA & NORTHERN AFRICA should be recorded as Africa
				// also all should be Upper case first letter only
				region = stats[1].trim();

				// change format
				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

				if (region.equalsIgnoreCase("Eastern Europe") || region.equalsIgnoreCase("Western Europe")) {
					country.setRegion("Europe");
				} else if ((region.equalsIgnoreCase("Sub-saharan africa")
						|| region.equalsIgnoreCase("Northern africa"))) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}

				country.setPopulation(Integer.parseInt(stats[2]));

				country.setArea(Integer.parseInt(stats[3]));

				// calculate and set density
				country.setDensity((double) country.getPopulation() / country.getArea());

				// add to collection of countries
				countries.add(country);
				wholeText.add(country);

				// read the next line
				countryInfo = bufferedReader.readLine();

			} while (countryInfo != null);

			// close all
			fileReader.close();
			bufferedReader.close();

			System.out.println("Country data loaded...");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show all the country data to screen
	 */
	public static void showAllCountryData(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayAllCountryDetails();
		}
	}

	/**
	 * Show country by region
	 * 
	 * @param countries
	 */
	public static void showCountryAndRegionData(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayRegionAndName();
		}
	}

	/**
	 * Show all countries by population
	 * 
	 * @param countries
	 */
	public static void showCountryByPopulation(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayPopulationAndName();
		}
	}

	/**
	 * filters country by chosen region
	 * 
	 * @param region
	 */
	public static List<Country> getCountriesByRegion(String region) {

		List<Country> countriesByRegion = new ArrayList<Country>();

		for (Country country : countries) {

			if (country.getRegion().equalsIgnoreCase(region)) {
				countriesByRegion.add(country);
			}
		}
		return countriesByRegion;
	}

	public static void editList(List<Country> countryList) {

		List<Country> llist = new LinkedList<Country>();

		for (Country country : countryList) {
			llist.add(country);
		}

		Country countryEx = new Country("Fantasy land", "Damien Land", 1, 10, 3.0);

		llist.add(2, countryEx);

		for (Country country : llist) {
			country.displayAllCountryDetails();
		}

	}

	public static void findAveragePopulationPerRegion(List<Country> countries, String region) {

		int popTotal = 0;
		int countryTotal = 0;

		for (Country country : countries) {
			if (country.getRegion().equalsIgnoreCase(region)) {
				popTotal += country.getPopulation();
				countryTotal++;
			}
		}

		System.out.println("The average population of a country in " + region + " is " + popTotal / countryTotal);

	}

	public static void regionWithHighestDensityUltimate() {

		Map<String, Double> regionMap = new TreeMap<>();
		SortedMap<String, Double> regionDensity = new TreeMap<String, Double>();

		System.out.println();

		// creates map with unique region values - 8 in total
		for (Country c : countries) {
			if (regionMap.containsKey(c.getRegion())) {
				continue;
			} else {
				regionMap.put(c.getRegion(), 0.00);
			}
		}

		// compares list and map. creates total for density and country per region
		for (String r : regionMap.keySet()) {
			double densityTotal = 0;
			int countryTotal = 0;

			for (Country country : countries) {
				if (country.getRegion().equals(r)) {
					densityTotal += country.getDensity();
					countryTotal++;
				} else {
					continue;
				}
			}

			// adds 8 regions and also the density divided by the total no. of countries in
			// region
			regionDensity.put(r, (densityTotal / countryTotal));

		}

		/*
		 * print all regions and all density values for (String key :
		 * regionDensity.keySet()) { System.out.println(key + " " +
		 * regionDensity.get(key)); }
		 */

		// prints only the highest density value and also name of that region
		for (String key : regionDensity.keySet()) {
			if (Collections.max(regionDensity.values()) == regionDensity.get(key)) {
				System.out.printf(key + " has the highest density with %.2f", regionDensity.get(key));
			}
		}

	}

	// doesn't scale!! if new regions are added to file it won't work!
	public static void alternateFindRegionWithHighestDensity(List<Country> countries) {

		double Europe = 0;
		double Asia = 0;
		double Africa = 0;
		double NorthernAmerica = 0;
		double LatinAmerCarib = 0;
		double Oceania = 0;
		double NearEast = 0;
		double Baltics = 0;

		for (Country country : countries) {
			switch (country.getRegion()) {
			case "Europe":
				Europe += country.getDensity();
				break;
			case "Asia":
				Asia += country.getDensity();
				break;
			case "Africa":
				Africa += country.getDensity();
				break;
			case "Northern america":
				NorthernAmerica += country.getDensity();
				break;
			case "Latin amer. & carib":
				LatinAmerCarib += country.getDensity();
				break;
			case "Oceania":
				Oceania += country.getDensity();
				break;
			case "Near east":
				NearEast += country.getDensity();
				break;
			case "Baltics":
				Baltics += country.getDensity();
				break;
			default:
			}
		}

		Map<String, Double> map = new HashMap<String, Double>();

		map.put("Europe", Europe);
		map.put("Asia", Asia);
		map.put("Africa", Africa);
		map.put("Northern America", NorthernAmerica);
		map.put("Latin America & Caribbean", LatinAmerCarib);
		map.put("Oceania", Oceania);
		map.put("Near East", NearEast);
		map.put("Baltics", Baltics);

		System.out.println();

		for (String key : map.keySet()) {
			if (Collections.max(map.values()) == map.get(key)) {
				System.out.printf(key + " has the highest density with %.2f", map.get(key));
			}
		}

		System.out.println("\n\n");

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

	}

	public static void avgPopPerRegion(List<Country> countryList) {

		Map<String, Double> regionMap = new TreeMap<>();
		SortedMap<String, Long> regionPop = new TreeMap<String, Long>();

		// generates a map containing unique values - 8 regions
		for (Country c : countryList) {
			if (regionMap.containsKey(c.getRegion())) {
				continue;
			} else {
				regionMap.put(c.getRegion(), 0.00);
			}
		}

		// compares list and map. creates population and country total for each region
		for (String r : regionMap.keySet()) {
			long populationTotal = 0;
			long countryTotal = 0;

			for (Country country : countryList) {
				if (country.getRegion().equals(r)) {
					populationTotal += country.getPopulation();
					countryTotal++;
				} else {
					continue;
				}
			}

			regionPop.put(r, (populationTotal / countryTotal));

		}

		// prints out all regions and pop totals
		for (String key : regionPop.keySet()) {
			System.out.println(key + " " + regionPop.get(key));
		}

		/*
		 * prints the highest pop value and its region for(String key:
		 * regionPop.keySet()) { if(Collections.max(regionPop.values()) ==
		 * regionPop.get(key)) {
		 * System.out.println(key+" has the biggest population with "+regionPop.get(key)
		 * ); } }
		 */
	}

	public static void writeAllData(List<Country> countryList) {

		Collections.sort(countryList, new CompareByName());

		try {

			File file = new File("Updated Countries.csv");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw;
			BufferedWriter bw;

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("Country " + ", region " + ", population " + ", area " + ", density " + "\n");

			for (Country country : countryList) {
				bw.write(country.getName() + "," + country.getRegion() + "," + country.getPopulation() + ","
						+ country.getArea() + "," + country.getDensity() + "\n");
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void findCountryHighestDensity(List<Country> countryList) {

		Collections.sort(countryList, new CompareByDensity());

		System.out.println();
		System.out.println(
				countryList.get(0).getName() + " has the highest density of " + countryList.get(0).getDensity());

	}

	public static void sortByDensity(List<Country> countryList) {

		Collections.sort(countryList, new CompareByDensity());

		System.out.println();
		for (Country country : countryList) {
			country.displayAllCountryDetails();
		}
	}

	public static void changeString(List<Country> countryList) {

		List<Country> llist = new LinkedList<Country>();

		for (Country country : countryList) {
			llist.add(country);
		}

		for (Country country : llist) {
			if (country.getRegion().equalsIgnoreCase("europe")) {
				country.setRegion("DamienLand");
			} else {
				continue;
			}
		}

		/*
		 * Iterating the list in forward direction Iterator it = llist.iterator();
		 * 
		 * System.out.println("LinkedList elements:"); while(it.hasNext()){
		 * System.out.println(it.next()); }
		 */

		for (Country country : llist) {
			country.displayAllCountryDetails();
		}

	}

	public static void threadReader() {

		Thread readToScreen = new Thread(fileReadToScreen);

		for (Country country : wholeText) {
			System.out.println(country.getRegion());
			try {
				readToScreen.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
