package sleeper;

public class StoppingAThreadExample {
	
	public static void main(String[] args) {
		
		// start 0..20 sec thread sleep
		SleepyThread sleepyThread = new SleepyThread();
		Thread newThread = new Thread(sleepyThread);
		newThread.start();
		
		// main thread to have a sleep too...
		try {
			System.out.println("Main thread - going for small sleep");
			Thread.sleep(2000);
			System.out.println("Main thread - awake");
		} catch (InterruptedException e) {
		}
		
		// before Main Thread finishes ensure the sleepyThread is done
		System.out.println("Main thread - checking if sleepyThread is awake");
		if (newThread.isAlive()) {
			System.out.println("Main thread - sleepyThread sleeping.  Going to interrupt it !");
			// still alive - interrupt
			newThread.interrupt();
		}
		System.out.println("Main finished");
	}
	
	/*
	 * Aidan  : read 100		+10 = 110
	 * Claire : read 100		-10 = 90
	 * 
	 */
	
}
