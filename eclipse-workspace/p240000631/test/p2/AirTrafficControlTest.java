package p2;

/**
 * @author Damien McGloin 40000631
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirTrafficControlTest {

	// test data
	int currentSpeedPlane1;
	int currentSpeedPlane2;
	int currentSpeedPlane3;
	
	int distancePlane1;
	int distancePlane2;
	int distancePlane3;
	
	int timeToFieldValid;
	int givenTime;
	
	String aircraftCodePlane1;
	String aircraftCodePlane2;
	String aircraftCodePlane3;
	
	String engineTypePlane1;
	String engineTypePlane2;
	String engineTypePlane3;
	
	Airline plane1;
	Airline plane2;
	Airline plane3;
	
	ArrayList<Airline> allAircraft;

	@BeforeEach
	void setUp() throws Exception {
		currentSpeedPlane1 = 100;
		currentSpeedPlane2 = 300;
		currentSpeedPlane3 = 500;
		
		distancePlane1 = 10000;
		distancePlane2 = 15000;
		distancePlane3 = 18000;
		
		givenTime = 6000;
		
		aircraftCodePlane1 = "A1plan";
		aircraftCodePlane2 = "A2plan";
		aircraftCodePlane3 = "A3plan";
		
		engineTypePlane1 = "jet";
		engineTypePlane2 = "jet";
		engineTypePlane3 = "propeller";
		
		plane1 = new Airline(currentSpeedPlane1, distancePlane1, aircraftCodePlane1, engineTypePlane1);
		plane2 = new Airline(currentSpeedPlane2, distancePlane2, aircraftCodePlane2, engineTypePlane2);
		plane3 = new Airline(currentSpeedPlane3, distancePlane3, aircraftCodePlane3, engineTypePlane3);
		
		allAircraft = new ArrayList<Airline>();
		
		allAircraft.add(plane1);
		allAircraft.add(plane2);
		allAircraft.add(plane3);
	}

	@Test
	void testSearchBySpeed() {
		ArrayList<Airline> results = AirtrafficControl.searchBySpeed(allAircraft);
		
		assertTrue(results.contains(plane1));
		assertTrue(results.contains(plane2));
		
		/* check to ensure plane 3 was not within allAircraft arrayList
		assertTrue(results.contains(plane3));
		*/
	}
	
	@Test
	void testSearchForAllByEngineType() {
		ArrayList<Airline> results = AirtrafficControl.searchForAllByEngineType(allAircraft, engineTypePlane1);
		
		assertTrue(results.contains(plane1));
		assertTrue(results.contains(plane2));
	}

	@Test
	void testSearchForLandingList() {
		ArrayList<Airline> results = AirtrafficControl.searchForLandingList(allAircraft, engineTypePlane1, givenTime);
		
		//assertTrue(results.contains(plane1));
		assertTrue(results.contains(plane2));

	}

}
