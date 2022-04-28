package classexercise;

public class MainMan {

	public static void main(String[] args) {
		CountdownThread c = new CountdownThread();
		Thread t = new Thread(c);
		t.start();
		System.out.println("Thread main dead");

	}

}
