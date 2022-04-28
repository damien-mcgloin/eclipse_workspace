package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountryTest {

	// test data
	Country country;
	
	String countryNameValid;
	String regionValid;
	int populationValid;
	int areaValid;
	double densityValid;
	
	@BeforeEach
	void setUp() throws Exception {
		country = new Country();
		
		countryNameValid = "country";
		regionValid = "region";
		populationValid = 123456;
		areaValid = 1234;
		densityValid = 12;
	}

	@Test
	void testCountryDefaultConstructor() {
		assertNotNull(country);
	}

	@Test
	void testCountryConstructorWithArgs() {
		country = new Country(countryNameValid, regionValid, populationValid, areaValid, densityValid);
		
		assertEquals(countryNameValid, country.getName());
		assertEquals(regionValid, country.getRegion());
		assertEquals(populationValid, country.getPopulation());
		assertEquals(areaValid, country.getArea());
		assertEquals(densityValid, country.getDensity());
	}

	@Test
	void testGetSetName() {
		country.setName(countryNameValid);
		assertEquals(countryNameValid, country.getName());
	}

	@Test
	void testGetSetRegion() {
		country.setRegion(regionValid);
		assertEquals(regionValid, country.getRegion());
	}

	@Test
	void testGetSetPopulation() {
		country.setPopulation(populationValid);
		assertEquals(populationValid, country.getPopulation());
	}

	@Test
	void testGetSetArea() {
		country.setArea(areaValid);
		assertEquals(areaValid, country.getArea());
	}

	@Test
	void testGetDensity() {
		country.setDensity(densityValid);
		assertEquals(densityValid, country.getDensity());
	}

}
