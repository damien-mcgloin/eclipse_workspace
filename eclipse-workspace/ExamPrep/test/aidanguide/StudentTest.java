package aidanguide;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
class StudentTest {
	
	// Test data
	Student student;
	int ID, p1, p2, p3;
	String name;

	@BeforeEach
	void setUp() throws Exception {
		
		student = new Student();
		ID = 199;
		p1 = 23;
		p2 = 34;
		p3 = 56;
		
	}

	@Test
	void testStudentDefaultConstructor() {
		assertNotNull(student);
	}

	@Test
	void testStudentConstructorWithArgs() {
		student = new Student(ID, name, p1, p2, p3);
		
		assertEquals(ID, student.getID());
		assertEquals(name, student.getName());
		assertEquals(p1, student.getP1());
		assertEquals(p2, student.getP2());
		assertEquals(p3, student.getP3());
	}

	@Test
	void testGetSetID() {
		student.setID(ID);
		assertEquals(ID, student.getID());
	}

	@Test
	void testGetSetName() {
		student.setName(name);
		assertEquals(name, student.getName());
	}

	@Test
	void testGetSetP1() {
		student.setP1(p1);
		assertEquals(p1, student.getP1());
	}

	@Test
	void testGetSetP2() {
		student.setP2(p2);
		assertEquals(p2, student.getP2());
	}

	@Test
	void testGetSetP3() {
		student.setP3(p3);
		assertEquals(p3, student.getP3());
	}

}
