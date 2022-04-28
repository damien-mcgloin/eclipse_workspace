package challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.SortedMap;

public class Starter {

	public static List<Country> countries = new ArrayList<Country>();

	public static void main(String[] args) {
		readFile();
		// showAllCountries(countries);
		// sortByPopAsc(countries);
		// findCountryHighestDensity(countries);
		// writeAllData(countries);
		// regionWithHighestDensity(countries);
		// alternateRegionWithHighestDensity();
		//avgPopPerRegion(countries);
		//regionWithHighestDensityUltimate();
		//findAveragePopulationPerRegion(countries, "Europe");
		editList(countries);

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

				region = stats[1].trim();
				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

				country.setName(stats[0].trim());

				if (region.equalsIgnoreCase("eastern europe") || region.equalsIgnoreCase("western europe")) {
					country.setRegion("Europe");
				} else if (region.equalsIgnoreCase("sub-saharan africa")
						|| region.equalsIgnoreCase("northern africa")) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}

				country.setPopulation(Integer.parseInt(stats[2].trim()));
				country.setArea(Integer.parseInt(stats[3].trim()));
				country.setDensity(country.getPopulation() / country.getArea());

				countries.add(country);

				countryInfo = br.readLine();

			} while (countryInfo != null);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void showAllCountries(List<Country> countryList) {

		for (Country country : countryList) {
			country.showAll();
			System.out.println();
		}

	}

	public static void sortByPopAsc(List<Country> countryList) {

		Collections.sort(countryList, new CompareByPopAsc());

		System.out.println("Countries by population ascending");

		for (Country country : countryList) {
			System.out.println(country.getPopulation() + " " + country.getName());
		}

	}

	public static void findCountryHighestDensity(List<Country> countryList) {

		Collections.sort(countryList, new CompareByDensity());

		System.out.println();
		System.out.println(
				countryList.get(0).getName() + " has the highest density of " + countryList.get(0).getDensity());

	}

	public static void writeAllData(List<Country> countryList) {

		Collections.sort(countryList, new CompareByName());

		File file = new File("Updated Countries.csv");

		FileWriter fw;
		BufferedWriter bw;

		try {
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

	public static void avgPopPerRegion(List<Country> countryList) {

		Map<String, Double> regionMap = new TreeMap<>();
		SortedMap<String, Long> regionPop = new TreeMap<String, Long>();

		for (Country c : countries) {
			if (regionMap.containsKey(c.getRegion())) {
				continue;
			} else {
				regionMap.put(c.getRegion(), 0.00);
			}
		}

		for (String r : regionMap.keySet()) {
			long populationTotal = 0;
			long countryTotal = 0;

			for (Country country : countries) {
				if (country.getRegion().equals(r)) {
					populationTotal += country.getPopulation();
					countryTotal++;
				} else {
					continue;
				}
			}

			regionPop.put(r, (populationTotal / countryTotal));

		}

		
		for (String key : regionPop.keySet()) {
			System.out.println(key + " " + regionPop.get(key));
		}
		

		/*
		for(String key: regionPop.keySet()) {
			if(Collections.max(regionPop.values()) == regionPop.get(key)) {
				System.out.println(key+" has the biggest population with "+regionPop.get(key));
			}
		}
		*/
	}

	public static void regionWithHighestDensityUltimate() {

		Map<String, Double> regionMap = new TreeMap<>();
		SortedMap<String, Double> regionDensity = new TreeMap<String, Double>();

		System.out.println();

		for (Country c : countries) {
			if (regionMap.containsKey(c.getRegion())) {
				continue;
			} else {
				regionMap.put(c.getRegion(), 0.00);
			}
		}

		for (String r : regionMap.keySet()) {
			double densityTotal = 0;
			long countryTotal = 0;

			for (Country country : countries) {
				if (country.getRegion().equals(r)) {
					densityTotal += country.getDensity();
					countryTotal++;
				} else {
					continue;
				}
			}

			regionDensity.put(r, (densityTotal / countryTotal));

		}

		/*
		for (String key : regionDensity.keySet()) {
			System.out.println(key + " " + regionDensity.get(key));
		}
		*/
		
		for(String key: regionDensity.keySet()) {
			if(Collections.max(regionDensity.values()) == regionDensity.get(key)) {
				System.out.printf(key+" has the highest density with %.2f",regionDensity.get(key));
			}
		}

	}

	public static void regionWithHighestDensity(List<Country> countryList) {

		Map<String, Double> regionMap = new TreeMap<String, Double>();

		System.out.println();

		for (Country country : countries) {
			if (regionMap.containsKey(country.getRegion())) {
				continue;
			} else {
				regionMap.put(country.getRegion(), 0.00);
			}
		}

		for (String r : regionMap.keySet()) {
			long populationTotal = 0;
			long areaTotal = 0;

			for (Country country : countries) {
				if (country.getRegion().equals(r)) {
					populationTotal += country.getPopulation();
					areaTotal += country.getArea();
				} else {
					continue;
				}
			}

			double density = (double) populationTotal / (double) areaTotal;
			regionMap.put(r, ((double) Math.round(density * 100) / 100));
		}

		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(regionMap.entrySet());
		Collections.sort(list, new CompareByDensityComp());

		System.out.println("\n");

		for (Entry<String, Double> key : list) {
			System.out.printf("%s\n", key);
		}

	}

	public static void alternateRegionWithHighestDensity() {

		Map<String, Double> regionMap = new TreeMap<>();
		SortedMap<Double, String> regionDensity = new TreeMap<Double, String>();

		double density = 0;
		for (Country c : countries) {
			if (regionMap.containsKey(c.getRegion())) {
				continue;
			} else {
				regionMap.put(c.getRegion(), 0.00);
			}
		}

		for (String r : regionMap.keySet()) {
			double populationTotal = 0;
			double areaTotal = 0;
			for (Country c : countries) {
				if (c.getRegion().equals(r)) {
					populationTotal += c.getPopulation();
					areaTotal += c.getArea();
				} else {
					continue;
				}
			}
			density = (double) populationTotal / (double) areaTotal;
			regionDensity.put(density, r);

			for (Double d : regionDensity.keySet()) {
				System.out.println(regionDensity.get(d) + "\t" + d);
			}

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
	
	public static void editList(List<Country> countryList) {
		
		List<Country> llist = new LinkedList<Country>();
		
		for(Country country : countryList) {
			llist.add(country);
		}
		
		Country countryEx = new Country("Fantasy land", "Damien Land", 1, 10, 3.0);
				
		llist.add(2, countryEx);
		
		for(Country country : llist) {
			country.showAll();
		}
		
	}

}
