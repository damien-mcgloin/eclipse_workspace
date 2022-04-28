package namers;

public class ControllerT {

	public static void main(String[] args) {
		
		for (int loop=1; loop<=1000; loop++) {
			
			MultiOutThread m = new MultiOutThread();
			m.number = loop;
			
			Thread t = new Thread(m);
			t.start();
			
			try {
				t.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
