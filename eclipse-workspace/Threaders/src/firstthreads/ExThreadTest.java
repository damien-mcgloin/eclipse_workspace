package firstthreads;

public class ExThreadTest {
	
	public static void main(String[] args) {
        ExtendingThreadExample e = new ExtendingThreadExample();
        e.start(); 
        
        do {
            System.out.println("In main.... ");
        } while(true);
        
    }

}
