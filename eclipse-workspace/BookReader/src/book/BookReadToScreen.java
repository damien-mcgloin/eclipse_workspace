package book;

public class BookReadToScreen implements Runnable {

	private boolean stopRead = false;
	
	@Override
	public void run() {

		displayTextLineByLine();
		
	}
	
	private void displayTextLineByLine() {
		
	
			while (!Start.wholeText.isEmpty()) {
				
				System.out.println(Start.wholeText.remove());
				
				// check if need to stop
				if (stopRead) {
					System.out.println("Stopping read to screen ..");
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

	

	/**
	 * @param stopRead the stopRead to set
	 */
	public void setStopRead(boolean stopRead) {
		this.stopRead = stopRead;
	}

}
