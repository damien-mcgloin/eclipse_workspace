package p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Teaching note : key things here - reusable test data. Positive and negative (exceptions) test cases (separately  grouped)
 * Constructors with args test. and invalid. Check for expected validation messages from exceptions (in the spec so you gotta check!) 
 * Also could include null tests (not included here - but could be part of the exception testing strategy. 
 * Good naming conventions for test methods.
 * Range checking, BVA, EQ not use of exhaustive loops. 
 * @author Aidan
 *
 */
class AirplaneTest {

	// Test data
	String codeValid, codeInvalid, codeInvalidShort, codeInvalidNull;

	// 0 - 800 mph
	int currentSpeedLowerValid, currentSpeedMidValid, currentSpeedUpperValid, currentSpeedLowerInvalid,
			currentSpeedUpperInvalid;

	// 1 - 20000
	int distanceToAirfieldLowerValid, distanceToAirfieldMidValid, distanceToAirfieldUpperValid,
			distanceToAirfieldLowerInvalid, distanceToAirfieldUpperInvalid;

	Airplane airplane1;

	@BeforeEach
	void setUp() throws Exception {

		codeValid = "AALIDC";
		codeInvalid = "xNVALIDC";
		codeInvalidNull = null;
		codeInvalidShort = "A1234";

		currentSpeedLowerValid = 0;
		currentSpeedMidValid = 400;
		currentSpeedUpperValid = 800;
		currentSpeedLowerInvalid = -1;
		currentSpeedUpperInvalid = 801;

		distanceToAirfieldLowerValid = 1;
		distanceToAirfieldMidValid = 10000;
		distanceToAirfieldUpperValid = 20000;
		distanceToAirfieldLowerInvalid = -1;
		distanceToAirfieldUpperInvalid = 200001;

		airplane1 = new Airplane(currentSpeedMidValid, distanceToAirfieldMidValid, codeValid, EngineType.JET);
	}

	

	// testing constructor with all valid args
	@Test
	void testAirplaneValidConsructorArgs() {

		// check that all values are set via the constructor with args
		assertEquals(currentSpeedMidValid, airplane1.getCurrentSpeed());
		assertEquals(distanceToAirfieldMidValid, airplane1.getDistanceToAirfield());
		assertEquals(codeValid, airplane1.getAircraftCode());
		assertEquals(EngineType.JET, airplane1.getEngineType());
	}

	@Test
	void testAirplaneInvalidConstructorArgs() {
		
		// attempt to set with invalid current speed
	
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> { 
			Airplane airplane = new Airplane(currentSpeedLowerInvalid, distanceToAirfieldMidValid, codeValid, EngineType.JET); 
			} 
		);
		
		// code invalid
		illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> { 
			Airplane airplane = new Airplane(currentSpeedLowerValid, distanceToAirfieldMidValid, codeInvalid, EngineType.JET); 
			} 
		);
		
		// distance invalid
		illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> { 
			Airplane airplane = new Airplane(currentSpeedLowerInvalid, distanceToAirfieldMidValid, codeValid, EngineType.JET); 
			} 
		);
		
		
		// no need to test enum based arg and could also test for validation message
		
	}

	
	@Test
	void testTimeToAirfield() {

		// using airplane1 test data

		// expected should be distanceFromAirfield / currentSpeed * 60 current speed
		// in this case 1500 / 400 * 60 = 1500
		assertEquals(1500, airplane1.timeToAirfield());
		
		// teaching note : few variants - not all really needed but just to check  
		airplane1.setDistanceToAirfield(300);
		airplane1.setCurrentSpeed(300);
		assertEquals(60, airplane1.timeToAirfield());
		
		airplane1.setDistanceToAirfield(200);
		airplane1.setCurrentSpeed(400);
		assertEquals(30, airplane1.timeToAirfield());
		
		airplane1.setDistanceToAirfield(900);
		airplane1.setCurrentSpeed(150);
		assertEquals(360, airplane1.timeToAirfield());
		
		
		airplane1.setDistanceToAirfield(10);
		airplane1.setCurrentSpeed(200);
		assertEquals(3, airplane1.timeToAirfield());
		
		airplane1.setDistanceToAirfield(1);
		airplane1.setCurrentSpeed(60);
		assertEquals(1, airplane1.timeToAirfield());
		
		airplane1.setDistanceToAirfield(1);
		airplane1.setCurrentSpeed(600);
		assertEquals(0, airplane1.timeToAirfield());
		
		
		airplane1.setDistanceToAirfield(1);
		airplane1.setCurrentSpeed(0);
		assertEquals(0, airplane1.timeToAirfield());
		
		airplane1.setDistanceToAirfield(600);
		airplane1.setCurrentSpeed(0);
		assertEquals(0, airplane1.timeToAirfield());
	}

	@Test
	void testGetSetEngineType() {
		// note use of the enum reduces the need for the test cases 
		Airplane airplane = new Airplane();
		airplane.setEngineType(EngineType.JET);
		assertEquals(EngineType.JET, airplane.getEngineType());

		airplane.setEngineType(EngineType.PROPELLER);
		assertEquals(EngineType.PROPELLER, airplane.getEngineType());
	}

	@Test
	void testGetSetCurrentSpeed() {

		Airplane airplane = new Airplane();
		airplane.setCurrentSpeed(currentSpeedMidValid);
		assertEquals(currentSpeedMidValid, airplane.getCurrentSpeed());

		airplane.setCurrentSpeed(currentSpeedLowerValid);
		assertEquals(currentSpeedLowerValid, airplane.getCurrentSpeed());

		airplane.setCurrentSpeed(currentSpeedUpperValid);
		assertEquals(currentSpeedUpperValid, airplane.getCurrentSpeed());

	}

	// expecting exception
	@Test
	void testGetSetInvalidCurrentSpeed() {

		Airplane airplane = new Airplane();
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setCurrentSpeed(currentSpeedLowerInvalid));

		// check for exception message
		assertEquals("INVALID CURRENT SPEED", illegalArgumentException.getMessage());

		illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setCurrentSpeed(currentSpeedUpperInvalid));

		// check for exception message
		assertEquals("INVALID CURRENT SPEED", illegalArgumentException.getMessage());

	}

	@Test
	void testGetSetDistanceToAirfield() {
		Airplane airplane = new Airplane();
		airplane.setDistanceToAirfield(distanceToAirfieldLowerValid);
		assertEquals(distanceToAirfieldLowerValid, airplane.getDistanceToAirfield());

		airplane.setDistanceToAirfield(distanceToAirfieldMidValid);
		assertEquals(distanceToAirfieldMidValid, airplane.getDistanceToAirfield());

		airplane.setDistanceToAirfield(distanceToAirfieldUpperValid);
		assertEquals(distanceToAirfieldUpperValid, airplane.getDistanceToAirfield());
	}

	@Test
	void testGetSetInvalidDistance() {

		Airplane airplane = new Airplane();
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setDistanceToAirfield(distanceToAirfieldLowerInvalid));

		// check for exception message
		assertEquals("INVALID CURRENT DISTANCE", illegalArgumentException.getMessage());

		illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setDistanceToAirfield(distanceToAirfieldUpperInvalid));

		// check for exception message
		assertEquals("INVALID CURRENT DISTANCE", illegalArgumentException.getMessage());

	}

	@Test
	void testGetSetAircraftCode() {
		Airplane airplane = new Airplane();
		airplane.setAircraftCode(codeValid);
		assertEquals(codeValid, airplane.getAircraftCode());
	}

	@Test
	void testGetSetInvalidAircraftCode() {

		Airplane airplane = new Airplane();
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setAircraftCode(codeInvalid));

		// check for exception message
		assertEquals("INVALID CODE", illegalArgumentException.getMessage());
		
		// null check
		illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setAircraftCode(codeInvalidNull));

		// check for exception message
		assertEquals("INVALID CODE", illegalArgumentException.getMessage());
		
		// too short check
		illegalArgumentException = assertThrows(IllegalArgumentException.class,
				() -> airplane.setAircraftCode(codeInvalidShort));

		// check for exception message
		assertEquals("INVALID CODE", illegalArgumentException.getMessage());

	}
	
}
