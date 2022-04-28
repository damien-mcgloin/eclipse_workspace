package practical;

public class TestCal2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		
		int expected = 7;
		int actual = cal.addNumbers(3, 4);
		
		System.out.println("Actual "+actual);
		
		if (expected==actual) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

}
