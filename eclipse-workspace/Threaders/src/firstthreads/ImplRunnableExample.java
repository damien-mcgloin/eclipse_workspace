package firstthreads;

public class ImplRunnableExample implements Runnable {
    @Override
    public void run() {
        do {
            System.out.println("My second thread...");
        } while (true);
        
    }
}
