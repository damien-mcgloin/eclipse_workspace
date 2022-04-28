package sleeper;

import java.util.Random;

public class SleepyThread implements Runnable {

	@Override
	public void run() {
		
		
		try {
			System.out.println("Sleepy thread - about to sleep");
			Thread.sleep(new Random().nextInt(20000));
			System.out.println("Sleepy thread - awake again!");
		} catch (InterruptedException interruptedException) {
			System.out.println("Sleepy thread interrupted");
		}
		
	}

}
