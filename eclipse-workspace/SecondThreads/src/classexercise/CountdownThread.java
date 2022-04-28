package classexercise;

public class CountdownThread implements Runnable {

	@Override
	public void run() {
		
		for (int loop=10; loop>0; loop--) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(loop);
		}
		
	}

}
