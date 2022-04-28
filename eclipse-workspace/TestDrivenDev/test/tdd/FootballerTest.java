package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FootballerTest {

	int ageValidLower, ageValidMid, ageValidUpper, ageInvalidLower, ageInvalidUpper;
	Footballer f;
	
	@BeforeEach
	void setUp() throws Exception {
		ageValidLower = 16;
		ageValidMid = 25;
		ageValidUpper = 40;
		
		ageInvalidLower = 15;
		ageInvalidUpper = 41;
		f = new Footballer();
	}

	@Test
	void testGetSetAgeValid() {
		// set the age of the footballer
		f.setAge(ageValidLower);	
		assertEquals(ageValidLower, f.getAge());
		
		f.setAge(ageValidMid);
		assertEquals(ageValidMid, f.getAge());
		
		f.setAge(ageValidUpper);
		assertEquals(ageValidUpper, f.getAge());
	}
	
	@Test
	void testSetAgeInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(ageInvalidLower);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(ageInvalidUpper);
		});
		
		assertEquals("Invalid age range", exception.getMessage());
	}

}
