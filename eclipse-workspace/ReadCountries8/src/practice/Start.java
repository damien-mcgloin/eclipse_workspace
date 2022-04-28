package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {
	
	public static List<Country> countries = new ArrayList<Country>();

	public static void main(String[] args) {
		
		readFile();
		printFile(countries);
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
				country.setExample(country.getArea()+country.getPopulation());
				country.setPopulation(Integer.parseInt(stats[2]));
				country.setExample2(country.getArea()+country.getArea());
				country.setArea(Integer.parseInt(stats[3]));
				country.setExample3(country.getPopulation()-country.getArea());
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
	
	public static void printFile(List<Country> countryList) {
		
		for(Country country : countryList) {
			country.showAll();
			System.out.println();
		}
		
	}
}
