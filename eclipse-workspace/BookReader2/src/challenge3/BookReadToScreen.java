package challenge3;

public class BookReadToScreen implements Runnable {

	private boolean stopRead = false;
	
	@Override
	public void run() {
		
		readBook();
		
	}
	
	public void readBook() {
		while(!Start.wholeText.isEmpty()) {
			System.out.println(Start.wholeText.remove());
			
			
			if (stopRead) {
				System.out.println("Stopping read to screen");
				return;
			}
			
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void stopRead(boolean stopRead) {
		this.stopRead = stopRead;
	}
	

}
