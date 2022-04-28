package challenge;

public class BookReadToScreen implements Runnable {

	@Override
	public void run() {
		readFile();
		
	}
	
	public void readFile() {
		while(!BookAnalysis.wholeText.isEmpty()) {
			BookAnalysis.wholeText.remove();
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
