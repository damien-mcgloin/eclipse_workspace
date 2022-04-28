package p2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Note no need to retest the validation for the aircraft based objects but
 * useful to test how well the search methods handle null arraylists. Sensible
 * use of class wide test data that covers most (perhaps not all) possibilities.
 * 
 * @author 3048360
 *
 */
class AirtrafficControlTest {

	// Test data
	Airplane a1 = new Airplane(100, 50, "AER101", EngineType.JET);
	Airplane a2 = new Airplane(0, 1, "AER102", EngineType.PROPELLER);
	Airplane a3 = new Airplane(250, 15000, "AER103", EngineType.JET);
	Airplane a4 = new Airplane(150, 7000, "AER105", EngineType.JET);

	@Test
	void testSearchBySpeed() {

		// using valid search range
		int validLower, validUpper;
		validLower = 120;
		validUpper = 300;

		ArrayList<Aircraft> aircraft = new ArrayList<Aircraft>();
		aircraft.add(a1);
		aircraft.add(a2);
		aircraft.add(a3);
		aircraft.add(a4);
		ArrayList<Aircraft> speedInRange = AirtrafficControl.searchBySpeed(aircraft, validLower, validUpper);

		System.out.println(speedInRange.size());

		// check of size of array and matching object references
		assertTrue(speedInRange.size() == 2 && speedInRange.contains(a3) && speedInRange.contains(a4));

	}

	@Test
	void testSearchBySpeedInvalidArgs() {

		// using invalid search range combination (sequence)
		int invalidLower, invalidUpper;

		invalidLower = 300;
		invalidUpper = 100;

		ArrayList<Aircraft> aircraft = new ArrayList<Aircraft>();
		aircraft.add(a1);
		aircraft.add(a2);
		aircraft.add(a3);
		aircraft.add(a4);

		// expecting exception here
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			AirtrafficControl.searchBySpeed(aircraft, invalidLower, invalidUpper);
		});

	}

	@Test
	void testSearchForAllByEngineType() {
		ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
		airplanes.add(a1);
		airplanes.add(a2);
		airplanes.add(a3);
		airplanes.add(a4);
		// expecting a1,a3,a4 only
		ArrayList<Airplane> jets = AirtrafficControl.searchForAllByEngineType(EngineType.JET, airplanes);
		// check of size of array and matching object references
		assertTrue((jets.size() == 3 && jets.contains(a1) && jets.contains(a3) && jets.contains(a4)));
	}

	@Test
	void testSearchForLandingList() {
		ArrayList<IRangeChecker> planes = new ArrayList<IRangeChecker>();
		planes.add(a1);
		planes.add(a2);
		planes.add(a3);
		planes.add(a4);

		ArrayList<IRangeChecker> inRangeOfLanding = AirtrafficControl.searchForLandingList(planes, 60);
		// should only be 1 in here (not the landed plane) -
		assertTrue(inRangeOfLanding.size() == 1 && inRangeOfLanding.contains(a1));
	}

	@Test
	void testForNulls() {
		// test for null
		ArrayList<Aircraft> nullList = null;
		NullPointerException nullPointerException = assertThrows(NullPointerException.class, () -> {
			AirtrafficControl.searchBySpeed(nullList, 120, 300);
		});
		
		ArrayList<Airplane> airplanesNull = null;
		nullPointerException = assertThrows(NullPointerException.class, () -> {
			AirtrafficControl.searchForAllByEngineType(EngineType.JET, airplanesNull);
		});
		
		ArrayList<IRangeChecker> nullIList = null;
		nullPointerException = assertThrows(NullPointerException.class, () -> {
			AirtrafficControl.searchForLandingList(nullIList, 60);
		});
		
	}

}
