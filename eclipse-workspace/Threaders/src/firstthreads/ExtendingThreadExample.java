package firstthreads;

public class ExtendingThreadExample extends Thread {
	
	public void run() {
        do {
            System.out.println("My first thread...");
        } while (true);
    }

}
