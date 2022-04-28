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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class StarterApp {

	public static List<Country> countryData = new ArrayList<Country>();

	public static void main(String[] args) {

		readDataFromFile();
		displayAllData(countryData);
		displayAllByRegion(countryData, "Asia");
		sortByPopulation(countryData);
		sortByPopulationDesc(countryData);
		findCountryWithHighestDensity(countryData);
		sortByPopulationDensity(countryData);
		findAveragePopulationPerRegion(countryData, "europe");
		findRegionWithHighestDensity(countryData);
		//alternateRegionHighestDensity(countryData);
		//anotherAlternateRegionHighestDensity(countryData);
		//printAllRegions(countryData);
		//writeAllData(countryData);

	}

	public static void readDataFromFile() {

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

				if (region.equalsIgnoreCase("Eastern Europe") || region.equalsIgnoreCase("Western Europe")) {
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

				countryData.add(country);

				countryInfo = br.readLine();

			} while (countryInfo != null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void displayAllData(List<Country> countries) {

		for (Country country : countries) {
			country.displayAll();
		}

	}

	public static void displayAllByRegion(List<Country> countries, String region) {

		System.out.println("Regional data - " + region);

		for (Country country : countries) {
			if (country.getRegion().equals(region)) {
				System.out.println(region + " " + country.getName());
			}
		}

	}

	public static void sortByPopulation(List<Country> countries) {

		System.out.println("\nCountries by population ascending");

		Collections.sort(countries, new CompareByPopulation());

		for (Country country : countries) {
			System.out.println(country.getPopulation() + " \t" + country.getName());
		}

	}

	public static void sortByPopulationDesc(List<Country> countries) {

		System.out.println("\nCountries by population descending");

		Collections.sort(countries, new CompareByPopDesc());

		for (Country country : countries) {
			System.out.println(country.getPopulation() + " \t" + country.getName());
		}

	}

	public static void findCountryWithHighestDensity(List<Country> countries) {

		Collections.sort(countries, new CompareByDensity());

		System.out.printf("\nThe country with the highest density is %s", countries.get(0).getName());
		System.out.printf(" with a density of : %.2f\n\n", countries.get(0).getDensity());

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

	public static void findRegionWithHighestDensity(List<Country> countries) {

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
		
		for(String key: map.keySet()) {
			if(Collections.max(map.values()) == map.get(key)) {
				System.out.printf(key+" has the highest density with %.2f",map.get(key));
			}
		}
		
		System.out.println("\n\n");
		
		for(String key: map.keySet()) {
			System.out.println(key + " : "+map.get(key));
		}
		
	}
	
	public static void alternateRegionHighestDensity(List<Country> countries) {
		
		Map<String, Double> regionMap = new TreeMap<String, Double>();
		
		for(Country country : countries) {
			if(regionMap.containsKey(country.getRegion())) {
				continue;
			} else {
				regionMap.put(country.getRegion(), 0.00);
			}
		}
		
		for (String r: regionMap.keySet()) {
			long populationTotal = 0;
			long areaTotal = 0;
			
			for (Country country: countries) {
				if(country.getRegion().equals(r)) {
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
		
		for (Entry<String, Double> key:list) {
			System.out.printf("%s\n", key);
		}
		
	}
	
	public static void anotherAlternateRegionHighestDensity(List<Country> countries) {
		
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

	public static void printAllRegions(List<Country> countries) {

		SortedSet<String> set = new TreeSet<String>();

		for (Country country : countries) {
			set.add(country.getRegion());
		}

		System.out.println(set);
	}

	public static void sortByPopulationDensity(List<Country> countries) {

		Collections.sort(countries, new CompareByDensity());
		Collections.reverse(countries);

		System.out.println("Countries sorted by population density");
		for (Country country : countries) {
			country.displayAll();
		}

	}

	public static void writeAllData(List<Country> countries) {

		File file = new File("UpdatedCountries.csv");
		FileWriter fw;
		BufferedWriter bw;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("Country "+", region "+", population "+", area "+", density "+"\n");
			
			/*
			for (Country country : countries) {
				bw.write(country.toString()+"\n");
			}
			*/
			
			Collections.sort(countries, new CompareByName());
			
			for (Country country : countries) {
				bw.write(country.getName()+","+country.getRegion()+","+
				country.getPopulation()+","+country.getArea()+","+country.getDensity()+"\n");
			}
			
			bw.close();
			fw.close();
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
