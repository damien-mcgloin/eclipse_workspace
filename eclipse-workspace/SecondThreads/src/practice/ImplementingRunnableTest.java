package practice;

public class ImplementingRunnableTest {

	public static void main(String[] args) {
		
		ImplementingRunnableExample impl = new ImplementingRunnableExample();
		Thread thread = new Thread(impl);
		thread.start();
		
		do {
			System.out.println("main man...");
		} while (true);

	}

}
