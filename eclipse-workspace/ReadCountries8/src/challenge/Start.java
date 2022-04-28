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
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Start {

	public static List<Country> countries = new ArrayList<Country>();
	
	public static void main(String[] args) {
		readFile();
		//displayAll(countries);
		//searchByRegion(countries, "europe");
		//sortByPopulation(countries);
		//sortByDensity(countries);
		//getTotalPopPerRegion(countries);
		printFile(countries);

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
				
				stats = countryInfo.split(",");
				
				Country country = new Country();
				
				country.setCountryName(stats[0].trim());
				
				region = stats[1].trim();
				
				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();
				
				if(region.equalsIgnoreCase("eastern europe") || region.equalsIgnoreCase("western europe")) {
					country.setRegion("Europe");
				} else if(region.equalsIgnoreCase("sub-saharan africa") || region.equalsIgnoreCase("northern africa")) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}
				
				country.setPopulation(Integer.parseInt(stats[2].trim()));
				country.setArea(Integer.parseInt(stats[3].trim()));
				country.setDensity((double)country.getPopulation()/country.getArea());
				
				countries.add(country);
				
				countryInfo = br.readLine();				
				
			} while(countryInfo!=null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void displayAll(List<Country> countryList) {
		
		for(Country country : countryList) {
			country.showAll();
			System.out.println();
		}
		
	}
	
	public static void searchByRegion(List<Country> countryList, String region) {
		
		System.out.println("Regional data - "+region);
		
		for(Country country : countryList) {
			if(country.getRegion().equalsIgnoreCase(region)) {
				System.out.println(region+" "+country.getCountryName());
			}
		}
		
	}
	
	public static void sortByPopulation(List<Country> countryList) {
		
		Collections.sort(countryList, new CompareByPopulation());
		
		System.out.println("Countries by population ascending");
		
		for(Country country : countryList) {
			System.out.println(country.getPopulation()+" "+country.getCountryName());
		}
		
	}
	
	public static void sortByDensity(List<Country> countryList) {
		
		Collections.sort(countryList, new CompareByDensity());
		Collections.reverse(countryList);
		
		System.out.println("Countries by density ascending");
		
		for(Country country : countryList) {
			System.out.println(country.getDensity()+" "+country.getCountryName());
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
		
		for(String r: regionMap.keySet()) {
			long popTotal = 0;
			for(Country country : countryList) {
				if (country.getRegion().equals(r)) {
					popTotal+=country.getPopulation();
				}
			}
			
			regionPop.put(r, popTotal);
			
		}
		
		for(String key: regionPop.keySet()) {
			System.out.println(key+" "+regionPop.get(key));
		}
		
	}
	
	public static void printFile(List<Country> countryList) {
		
		File file = new File("updatedCountryList");
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("CountryName"+","+"Region"+","+"Population"+","+"Area"+","+"Density"+"\n");
			for(Country country : countryList) {
				bw.write(country.getCountryName()+","+country.getRegion()+","+country.getPopulation()+","+country.getArea()+","+country.getDensity()+"\n");
			}
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
