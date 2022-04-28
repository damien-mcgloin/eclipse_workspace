package namers;

public class ControllerT {
	public static void main(String[] args) {
		for (int loop = 1; loop <= 1000; loop++) {

			MultiOutThread m = new MultiOutThread();
			m.number = loop;

			Thread t = new Thread(m);
			t.start();
		}
	}
}
