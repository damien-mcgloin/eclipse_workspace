package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
class CountryTest {

	// test data
	Country country;
	
	private String name;
	private String region;
	private int population;
	private int area;
	private double density;
	
	@BeforeEach
	void setUp() throws Exception {
		
		country = new Country();
		
		name = "validCountryName";
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
		country = new Country(name, region, population, area, density);
		
		assertEquals(name, country.getName());
		assertEquals(region, country.getRegion());
		assertEquals(population, country.getPopulation());
		assertEquals(area, country.getArea());
		assertEquals(density, country.getDensity());
	}

	@Test
	void testGetSetName() {
		country.setName(name);
		assertEquals(name, country.getName());
	}

	@Test
	void testGetRegion() {
		country.setRegion(region);
		assertEquals(region, country.getRegion());
	}

	@Test
	void testGetPopulation() {
		country.setPopulation(population);
		assertEquals(population, country.getPopulation());
	}

	@Test
	void testGetArea() {
		country.setArea(area);
		assertEquals(area, country.getArea());
	}

	@Test
	void testGetDensity() {
		country.setDensity(density);
		assertEquals(density, country.getDensity());
	}

}
