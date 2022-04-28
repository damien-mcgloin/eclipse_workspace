package namers;

public class MultiOutThread implements Runnable {

	// according to Aidan should be private with getters and setters! just an example 
	//here for demonstration though
	
	public int number = 0;
	
	@Override
	public void run() {
		
		System.out.println("Thread "+number+" started");
		
	}

}
