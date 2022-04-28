package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StarterApp {
	
	public static List<Country> countries = new ArrayList<Country>();

	public static void main(String[] args) {

		
		readFile();
		showAllCountryData(countries);
		
		System.out.println("\nRegional data - Asia\n");
		List<Country> regionalCountries = getCountriesByRegion("Asia");
		showAllCountryAndRegionDataAidan(regionalCountries);
		
		System.out.println("\nRegional data - Asia\n");
		showAllCountryAndRegionData(countries, "Asia");
		
		System.out.println("\nCountries by population ascending\n");
		Collections.sort(countries, new CompareByPopulation());
		showCountryByPopulation(countries);

	}
	
	public static void readFile() {
		
		File file;
		FileReader fr;
		BufferedReader br;
		
		String countryInfo;
		String[] stats;
		
		file = new File("countries.csv");
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			br.readLine();
			countryInfo = br.readLine();
			
			String region;
			
			do {
				stats = countryInfo.split(",");		
				Country country = new Country();
				
				country.setCountryName(stats[0].trim());
				
				region = stats[1].trim();
				
				region = region.substring(0,1).toUpperCase() + region.substring(1).toLowerCase();
				
				if (region.equalsIgnoreCase("Eastern Europe") || region.equalsIgnoreCase("Western Europe")) {
					country.setRegion("Europe");
				} else if (region.equalsIgnoreCase("Sub-Saharan Africa") || region.equalsIgnoreCase("Northern Africa")) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}
				
				country.setPopulation(Integer.parseInt(stats[2]));
				country.setArea(Integer.parseInt(stats[3]));
				country.setDensity((double)country.getPopulation()/country.getArea());
				
				countries.add(country);
				
				countryInfo = br.readLine();
				
			} while (countryInfo != null);
			
			fr.close();
			br.close();
			
			System.out.println("Country data loaded...\n");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showAllCountryData(List<Country> countryList) {
		for (Country country : countries) {
			country.displayAllCountryDetails();
		}

	}
	
	public static void showAllCountryAndRegionData(Collection<Country> countries, String region) {
		for (Country country : countries) {
			if(country.getRegion().equalsIgnoreCase(region)) {
			country.displayRegionAndName();
			}
		}
	}
	
	public static void showAllCountryAndRegionDataAidan(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayRegionAndName();
		}
	}
	
	public static List<Country> getCountriesByRegion(String region) {
		
		List<Country> countriesByRegion = new ArrayList<Country>();
		
		for(Country country : countries) {
			
			if (country.getRegion().equalsIgnoreCase(region)) {
				countriesByRegion.add(country);
			}
			
		}
		
		return countriesByRegion;
		
	}
	
	public static void showCountryByPopulation(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayPopulationAndName();
		}
	}

}
