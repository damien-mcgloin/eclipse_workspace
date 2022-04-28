package junittest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class MyClassTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test(s) executed. See JUnit tab.");
	}

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
	    assertEquals("Multiplication Test", 50, tester.multiply(10, 5));

	}

}