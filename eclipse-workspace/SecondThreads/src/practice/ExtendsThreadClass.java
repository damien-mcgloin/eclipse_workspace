package practice;

public class ExtendsThreadClass {

	public static void main(String[] args) {
		ExtendingThreadExample e = new ExtendingThreadExample();
		e.start();
		
		do {
			System.out.println("In main...");
		} while(true);

	}

}
