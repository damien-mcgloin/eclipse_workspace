package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountryTest {
	
	// test data
	
	Country country;
	
	String countryName;
	String regionName;
	int population;
	int area;
	double density;

	@BeforeEach
	void setUp() throws Exception {
		country = new Country();
		
		countryName = "validName";
		regionName = "validRegion";
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
		country = new Country(countryName, regionName, population, area, density);
		
		assertEquals(countryName, country.getName());
		assertEquals(regionName, country.getRegion());
		assertEquals(population, country.getPopulation());
		assertEquals(area, country.getArea());
		assertEquals(density, country.getDensity());
		
	}

	@Test
	void testGetSetName() {
		country.setName(countryName);
		assertEquals(countryName, country.getName());
	}

	@Test
	void testGetSetRegion() {
		country.setRegion(regionName);
		assertEquals(regionName, country.getRegion());
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
