/**
 * 
 */
package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author damienmcgloin
 *
 */
class NumberCruncherTest {
	
	// test data
	int num1, num2, num3;
	NumberCruncher numberCruncher;
	String one, two, three, four;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		num1 = 2;
		num2 = 3;
		num3 = 5;
		numberCruncher = new NumberCruncher();
		
		one = "Jan";
		two = "Feb";
		three = "Mar";
		four = "April";
	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {
		int expected = 5;
		int actual = numberCruncher.addNumbers(num1, num2);
		
		// compare 
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
		int expected = 10;
		int actual = numberCruncher.addNumbers(num1, num2, num3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultiplNumbersIntInt() {
		assertEquals(6, numberCruncher.multiplyNumbers(num1, num2));
	}
	
	@Test
	void testMultiplNumbersIntIntInt() {
		assertEquals(30, numberCruncher.multiplyNumbers(num1, num2, num3));
	}
	
	@Test
    void testDivNums() {
        double expected = 3.3;
        try {
			assertEquals(expected, numberCruncher.divNumbers(10, 3),0.1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Test 
    void testDivException() {
        Exception exception = assertThrows(Exception.class, () -> {
            numberCruncher.divNumbers(2, 0);
        });
        
        assertEquals("INVALID DIV BY ZERO", exception.getMessage());
    }
	
	@Test
	void testMonthToString() {
		assertEquals(one, NumberCruncher.monthToString(1));
		assertEquals(two, NumberCruncher.monthToString(2));
		assertEquals(three, NumberCruncher.monthToString(3));
		assertEquals(four, NumberCruncher.monthToString(4));
		
	}
	
	@Test
	void testInvalidMonth() {
		
		assertThrows(NumberFormatException.class, () -> {
			NumberCruncher.monthToString(0);
		});
	}

}
