package firstthreads;

public class ImplRunnableTest {
	
	public static void main(String[] args) {
		
		ImplRunnableExample i = new ImplRunnableExample();
		Thread thread = new Thread(i);
		thread.start();
		
		do {
			System.out.println("main man...");
		} while (true);
		
	}
	
}
