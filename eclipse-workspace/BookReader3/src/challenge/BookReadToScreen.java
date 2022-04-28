package challenge;

public class BookReadToScreen implements Runnable {

	@Override
	public void run() {
		displayText();
	}
	
	public void displayText() {
		while(!Start.wholeText.isEmpty()) {
			System.out.println(Start.wholeText.remove());
				
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
