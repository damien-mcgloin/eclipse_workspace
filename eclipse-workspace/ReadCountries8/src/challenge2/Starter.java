package challenge2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Starter {

	public static List<Country> countries = new ArrayList<Country>();

	public static void main(String[] args) {

		readFile();
		//printFile();
		getTotalPop();
		
	}

	public static void readFile() {

		File file = new File("countries.csv");
		FileReader fr;
		BufferedReader br;

		String countryInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();

			countryInfo = br.readLine();

			do {

				stats = countryInfo.split(",");
				
				Country country = new Country();
				
				country.setCountryName(stats[0]);
				country.setRegion(stats[1]);
				country.setPopulation(Integer.parseInt(stats[2]));
				country.setArea(Integer.parseInt(stats[3]));
				country.setDensity((double)country.getPopulation()/country.getArea());
				
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
	
	public static void printFile() {
		
		for(Country country : countries) {
			country.showAll();
		}
		
	}
	
	public static void getTotalPop() {
		
		Map<String, Integer> regionMap = new HashMap<String, Integer>();
		SortedMap<String, Long> regionPop = new TreeMap<String, Long>();
		
		for(Country country : countries) {
			if(regionMap.containsKey(country.getRegion())) {
				continue;
			} else {
				regionMap.put(country.getRegion(), 0);
			}
		}
		
		for(String r: regionMap.keySet()) {
			long popTotal = 0;
			for(Country country : countries) {
				if(country.getRegion().equals(r)) {
					popTotal+=country.getPopulation();
				} else {
					continue;
				}
			}
			
			regionPop.put(r, popTotal);
			
		}
		
		for(String key : regionPop.keySet()) {
			System.out.println(key + " " + regionPop.get(key));
		}
		
	}

}
