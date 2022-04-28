package p2;

/**
 * @author Damien McGloin 40000631
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineTest {

	// test data
	int currentSpeedValidLow, currentSpeedValidMid, currentSpeedValidHigh, currentSpeedInvalidLow,
			currentSpeedInvalidHigh, distanceToAirfieldValidLow, distanceToAirfieldValidMid,
			distanceToAirfieldValidHigh, distanceToAirfieldInvalidLow, distanceToAirfieldInvalidHigh,
			timeToFieldValid;
	String aircraftCodeValid, aircraftCodeInvalidLength, aircraftCodeInvalidFormat, engineTypeJetValid,
			engineTypePropellerValid, engineTypeInvalid;

	Airline airline;
	
	@BeforeEach
	void setUp() throws Exception {
		currentSpeedValidLow = 0;
		currentSpeedValidMid = 400;
		currentSpeedValidHigh = 800;
		currentSpeedInvalidLow = -1;
		currentSpeedInvalidHigh = 801;

		distanceToAirfieldValidLow = 1;
		distanceToAirfieldValidMid = 10000;
		distanceToAirfieldValidHigh = 20000;
		distanceToAirfieldInvalidLow = 0;
		distanceToAirfieldInvalidHigh = 20001;

		aircraftCodeValid = "Avalid";
		aircraftCodeInvalidLength = "Invalid";
		aircraftCodeInvalidFormat = "Bvalid";
		engineTypeJetValid = "jet";
		engineTypePropellerValid = "propeller";
		engineTypeInvalid = "Invalid";
		
		timeToFieldValid = (distanceToAirfieldValidMid/currentSpeedValidMid)*60;

		airline = new Airline();
	}

	@Test
	void testTimeToAirfield() {
		assertEquals(1500, timeToFieldValid);
	}

	@Test
	void testAirlineDefaultConstructorValid() {
		assertNotNull(airline);
	}

	@Test
	void testAirlineNotDefaultConstructorValid() {
		airline = new Airline(currentSpeedValidMid, distanceToAirfieldValidMid, aircraftCodeValid, engineTypeJetValid);

		assertEquals(currentSpeedValidMid, airline.getCurrentSpeed());
		assertEquals(distanceToAirfieldValidMid, airline.getDistanceToAirfield());
		assertEquals(aircraftCodeValid, airline.getAircraftCode());
		assertEquals(engineTypeJetValid, airline.getEngineType());

	}

	@Test
	void testAirlineNotDefaultConstructorNotValid() {
		assertThrows(IllegalArgumentException.class, () -> {
			airline = new Airline(currentSpeedInvalidLow, distanceToAirfieldValidMid, aircraftCodeValid,
					engineTypeJetValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			airline = new Airline(currentSpeedValidMid, distanceToAirfieldInvalidLow, aircraftCodeValid,
					engineTypeJetValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			airline = new Airline(currentSpeedValidMid, distanceToAirfieldValidMid, aircraftCodeInvalidLength,
					engineTypeJetValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			airline = new Airline(currentSpeedValidMid, distanceToAirfieldValidMid, aircraftCodeValid,
					engineTypeInvalid);
		});

	}

	@Test
	void testGetSetEngineType() {
		airline.setEngineType(engineTypeJetValid);
		assertEquals(engineTypeJetValid, airline.getEngineType());

		airline.setEngineType(engineTypePropellerValid);
		assertEquals(engineTypePropellerValid, airline.getEngineType());
	}

	@Test
	void testSetEngineTypeNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			airline.setEngineType(engineTypeInvalid);
		});
		
		assertEquals("INVALID ENGINE TYPE", exception.getMessage());
	}

	@Test
	void testSetCurrentSpeed() {
		airline.setCurrentSpeed(currentSpeedValidLow);
		assertEquals(currentSpeedValidLow, airline.getCurrentSpeed());

		airline.setCurrentSpeed(currentSpeedValidMid);
		assertEquals(currentSpeedValidMid, airline.getCurrentSpeed());

		airline.setCurrentSpeed(currentSpeedValidHigh);
		assertEquals(currentSpeedValidHigh, airline.getCurrentSpeed());
	}

	@Test
	void testSetCurrentSpeedNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			airline.setCurrentSpeed(currentSpeedInvalidLow);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			airline.setCurrentSpeed(currentSpeedInvalidHigh);
		});
		
		assertEquals("INVALID SPEED", exception.getMessage());
	}

	@Test
	void testSetDistanceToAirfield() {
		airline.setDistanceToAirfield(distanceToAirfieldValidLow);
		assertEquals(distanceToAirfieldValidLow, airline.getDistanceToAirfield());

		airline.setDistanceToAirfield(distanceToAirfieldValidMid);
		assertEquals(distanceToAirfieldValidMid, airline.getDistanceToAirfield());

		airline.setDistanceToAirfield(distanceToAirfieldValidHigh);
		assertEquals(distanceToAirfieldValidHigh, airline.getDistanceToAirfield());
	}

	@Test
	void testSetDistanceToAirfieldNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			airline.setDistanceToAirfield(distanceToAirfieldInvalidLow);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			airline.setDistanceToAirfield(distanceToAirfieldInvalidHigh);
		});
		
		assertEquals("INVALID DISTANCE TO AIRFIELD", exception.getMessage());
	}

	@Test
	void testSetAircraftCode() {
		airline.setAircraftCode(aircraftCodeValid);
		assertEquals(aircraftCodeValid, airline.getAircraftCode());
	}

	@Test
	void testSetAircraftCodeNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			airline.setAircraftCode(aircraftCodeInvalidLength);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			airline.setAircraftCode(aircraftCodeInvalidFormat);
		});
		
		assertEquals("INVALID AIRCRAFT CODE", exception.getMessage());
	}

}
