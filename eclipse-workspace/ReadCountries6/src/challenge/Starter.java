package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Starter {

	public static List<Country> countries = new ArrayList<Country>();

	public static void main(String[] args) {

		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// displayFileData(countries);
		//searchCountryByRegion(countries, "europe");
		//sortByPop(countries);
		//getTotalPopPerRegion(countries);
		sortByDensity(countries);

	}

	public static void readFile() throws IOException {

		File file = new File("countries.csv");
		FileReader fr;
		BufferedReader br;

		String countryInfo;
		String[] stats;
		String region;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();

			countryInfo = br.readLine();

			do {

				Country country = new Country();
				stats = countryInfo.split(",");

				country.setCountryName(stats[0]);

				region = stats[1].trim();
				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

				if (region.equalsIgnoreCase("eastern europe") || region.equalsIgnoreCase("western europe")) {
					country.setRegion("Europe");
				} else if (region.equalsIgnoreCase("sub-saharan africa")
						|| region.equalsIgnoreCase("northern africa")) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}

				country.setPopulation(Integer.parseInt(stats[2]));
				country.setArea(Integer.parseInt(stats[3]));
				country.setDensity((double) country.getPopulation() / country.getArea());

				countries.add(country);

				countryInfo = br.readLine();

			} while (countryInfo != null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void displayFileData(List<Country> countryList) {

		for (Country country : countryList) {
			country.showAll();
			System.out.println();
		}

	}

	public static void searchCountryByRegion(List<Country> countryList, String region) {

		System.out.println("Regional data - " + region);
		for (Country country : countryList) {
			if (country.getRegion().equalsIgnoreCase(region)) {
				System.out.println(country.getRegion() + " " + country.getCountryName());
			}
		}

	}

	public static void sortByPop(List<Country> countryList) {

		System.out.println("Countries by population ascending");

		Collections.sort(countryList, new CompareByPopulation());

		for (Country country : countryList) {
			if (country.getPopulation() > 1000000) {
				System.out.println(country.getPopulation() + " \t" + country.getCountryName());
			} else {
				System.out.println(country.getPopulation() + " \t\t" + country.getCountryName());
			}
		}
	}
	
	public static void getTotalPopPerRegion(List<Country> countryList) {
		
		Map<String, Integer> regionMap = new HashMap<String, Integer>();
		SortedMap<String, Long> regionPop = new TreeMap<String, Long>();
		
		for(Country country : countryList) {
			if(regionMap.containsKey(country.getRegion())) {
				continue;
			} else {
				regionMap.put(country.getRegion(), 0);
			}
		}
		
		for(String region : regionMap.keySet()) {
			long popTotal = 0;
			for(Country country : countryList) {
				if(country.getRegion().equals(region)) {
					popTotal+=country.getPopulation();
				}
			}
			
			regionPop.put(region, popTotal);
			
		}
		
		for(String key : regionPop.keySet()) {
			System.out.println(key+" "+regionPop.get(key));
		}
		
		
	}
	
	public static void sortByDensity(List<Country> countryList) {
		
		Collections.sort(countryList, new CompareByDensity());
		
		for(Country country : countryList) {
			country.showAll();
			System.out.println();
		}
		
	}

}
