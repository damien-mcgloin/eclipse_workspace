package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	// test data

	// age
	int ageLowerValid, ageMidValid, ageUpperValid, ageInvalidLower, ageInvalidUpper;

	// name
	String nameValid, nameInvalid;

	Employee employee;

	@BeforeEach
	void setUp() throws Exception {
		ageLowerValid = 18;
		ageMidValid = 25;
		ageUpperValid = 30;

		ageInvalidLower = 17;
		ageInvalidUpper = 31;

		nameValid = "Aidan";
		nameInvalid = "InvalidName";

		employee = new Employee();
	}
	
	@Test
	void testDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	
	@Test
	void testNonDefaultConstructorValid() {
		Employee employee = new Employee(nameValid, ageMidValid);
		
		assertEquals(nameValid, employee.getName());
		assertEquals(ageMidValid, employee.getAge());
		
	}
	
	@Test
	void testNonDefaultConstructorInvalid() {
		assertThrows(IllegalArgumentException.class, ()-> {
			Employee employee = new Employee(nameValid, ageInvalidUpper);
			assertEquals(ageInvalidUpper, employee.getAge());
		});
		
		assertThrows(IllegalArgumentException.class, ()-> {
			Employee employee = new Employee(nameInvalid, ageMidValid);
			assertEquals(ageInvalidUpper, employee.getName());
		});
	}

	@Test
	void testGetSetName() {
		employee.setName(nameValid);

		assertEquals(nameValid, employee.getName());
	}
	
	@Test
	void testGetSetNameInvalid() {
		assertThrows(IllegalArgumentException.class, ()-> {
			employee.setName(nameInvalid);
			assertEquals(nameInvalid, employee.getName());
		});
	}

	@Test
	void testGetSetAgeValid() {
		employee.setAge(ageLowerValid);
		assertEquals(ageLowerValid, employee.getAge());

		employee.setAge(ageMidValid);
		assertEquals(ageMidValid, employee.getAge());

		employee.setAge(ageUpperValid);
		assertEquals(ageUpperValid, employee.getAge());
	}
	
	@Test
	void testGetSetAgeInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageInvalidLower);
		});
		
		// checking error message
		assertEquals("INVALID AGE", exception.getMessage());
		
		exception = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageInvalidUpper);
		});
		
		// checking error message
		assertEquals("INVALID AGE", exception.getMessage());
		
	}
}
