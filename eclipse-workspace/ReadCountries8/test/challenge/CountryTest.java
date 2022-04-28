package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountryTest {

	// test data
	Country country;
	
	private String countryName;
	private String region;
	private int population;
	private int area;
	private double density;
	
	@BeforeEach
	void setUp() throws Exception {
		
		country = new Country();
		
		countryName = "validCountry";
		region = "validRegion";
		population = 1234567;
		area = 12345;
		density = 12.34;
	}

	@Test
	void testCountryDefaultConstructor() {
		assertNotNull(country);
	}

	@Test
	void testCountryConstructorWithArgs() {
		
		Country country = new Country(countryName, region, population, area, density);
		
		assertEquals(countryName, country.getCountryName());
		assertEquals(region, country.getRegion());
		assertEquals(population, country.getPopulation());
		assertEquals(area, country.getArea());
		assertEquals(density, country.getDensity());
		
	}

	@Test
	void testGetSetCountryName() {
		country.setCountryName(countryName);
		assertEquals(countryName, country.getCountryName());
	}

	@Test
	void testGetSetRegion() {
		country.setRegion(region);
		assertEquals(region, country.getRegion());
	}

	@Test
	void testGetSetPopulation() {
		country.setPopulation(population);
		assertEquals(population, country.getPopulation());
	}

	@Test
	void testGetSetArea() {
		country.setArea(area);
		assertEquals(area, country.getArea());
	}

	@Test
	void testGetSetDensity() {
		country.setDensity(density);
		assertEquals(density, country.getDensity());
	}

}
