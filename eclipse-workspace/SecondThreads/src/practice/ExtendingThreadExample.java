package practice;

public class ExtendingThreadExample extends Thread {

	public void run() {
		do {
			System.out.println("my second thread.....");
		} while (true);
	}
	
}
