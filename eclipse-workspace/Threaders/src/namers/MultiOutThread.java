package namers;

public class MultiOutThread implements Runnable {
	
    public int number=0;
    
    @Override
    public void run() {
        System.out.println("Thread "+number +" started");
    }
}