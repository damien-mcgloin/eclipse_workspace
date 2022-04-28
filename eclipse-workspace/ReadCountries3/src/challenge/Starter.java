package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Starter {

	public static List<Country> countries = new ArrayList<Country>();
	public static List<Country> linkedCountries = new LinkedList<Country>();
	public final String EUROPE = "Europe";

	public static void main(String[] args) {

		readFile();
		showAll(countries);
		searchByRegion(countries, "Europe");
		sortByPopulation(countries);
		findHighestDensityCountry(countries);
		averagePopPerRegion(countries, "Europe");
		//averagePopAllRegions(countries);
		regionWithHighestDensity(countries);

	}

	public static void readFile() {

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

				country.setName(stats[0].trim());

				region = stats[1].trim();

				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

				if (region.equalsIgnoreCase("Eastern Europe") || region.equalsIgnoreCase("western europe")) {
					country.setRegion("Europe");
				} else if (region.equalsIgnoreCase("sub-saharan africa")
						|| region.equalsIgnoreCase("northern africa")) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}

				country.setPopulation(Integer.parseInt(stats[2].trim()));
				country.setArea(Integer.parseInt(stats[3].trim()));
				country.setDensity((double) country.getPopulation() / country.getArea());

				countries.add(country);

				countryInfo = br.readLine();

			} while (countryInfo != null);

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void showAll(List<Country> countryList) {

		for (Country country : countryList) {
			linkedCountries.add(country);
			country.showAll();
			System.out.println();
		}

	}

	public static void searchByRegion(List<Country> countryList, String region) {

		System.out.println("Regional data - " + region);

		for (Country country : countryList) {
			if (country.getRegion().equalsIgnoreCase(region)) {
				System.out.println(country.getRegion() + " " + country.getName());
			}
		}

	}

	public static void sortByPopulation(List<Country> countryList) {

		Collections.sort(countryList, new CompareByPopulation());

		System.out.println("\nCountries by population ascending");

		for (Country country : countryList) {
			if (country.getPopulation() < 10000000) {
				System.out.println(country.getPopulation() + "\t\t" + country.getName());
			} else {
				System.out.println(country.getPopulation() + "\t" + country.getName());
			}
		}

	}

	public static void findHighestDensityCountry(List<Country> countryList) {

		/*
		 * method 1 Map<String, Double> regionDensity = new HashMap<String, Double>();
		 * 
		 * for (Country country : countryList) { regionDensity.put(country.getName(),
		 * country.getDensity()); }
		 * 
		 * for (String key: regionDensity.keySet()) {
		 * if(Collections.max(regionDensity.values()) == regionDensity.get(key)) {
		 * System.out.println("\nThe country with the highest density is "+key
		 * +" with "+regionDensity.get(key)); } }
		 */

		// method 2 - much simpler!

		Collections.sort(countryList, new CompareByDensity());

		System.out.println("\nThe country with the highest density is " + countryList.get(0).getName() + " with "
				+ countryList.get(0).getDensity());

	}

	public static void averagePopPerRegion(List<Country> countryList, String region) {

		int popCounter = 0;
		int countryCounter = 0;

		for (Country country : countryList) {
			if (country.getRegion().equals(region)) {
				popCounter += country.getPopulation();
				countryCounter++;
			}
		}

		System.out.println("The average population of " + region + " is " + (popCounter / countryCounter));

	}

	public static void averagePopAllRegions(List<Country> countryList) {

		Map<String, Integer> countryMap = new TreeMap<>();
		Map<String, Integer> regionMap = new TreeMap<>();

		for (Country country : countryList) {
			countryMap.put(country.getName(), country.getPopulation());
		}

		int regionPop = 0;
		
		for (Country country : countryList) {
			for (String key : countryMap.keySet()) {
				if(key.equals(country.getName())) {
					regionPop+=country.getPopulation();
					regionMap.put(country.getRegion(), regionPop);
				}
			}
		}
		
		for(String key : regionMap.keySet()) {
			System.out.println(key + " " + regionMap.get(key));
		}
		
	}
	
	public static void regionWithHighestDensity(List<Country> countryList) {
		
		Map<Double, String> regionDensityMap = new TreeMap<>();
		Map<String, Country> regionMap = new HashMap<>();
				
		for(Country country : countries) {
			regionMap.put(country.getRegion(), country);
		}
		
		for(String region : regionMap.keySet()) {
			double totalPopDensity = 0;
			for (Country c : regionMap.values()) {
				if(c.getRegion().equalsIgnoreCase(region)) {
					totalPopDensity += c.getDensity();
				}
			}
			System.out.println(region + " " + totalPopDensity);
			regionDensityMap.put(totalPopDensity, region);
		}
		
		int lastIndex = regionDensityMap.size()-1;
		
		String region = (String) regionDensityMap.values().toArray()[lastIndex];
		Double popDensity = (Double) regionDensityMap.keySet().toArray()[lastIndex];
		
		System.out.println("Region with the highest density is : "+region+ " "+popDensity);
		
	}

}
