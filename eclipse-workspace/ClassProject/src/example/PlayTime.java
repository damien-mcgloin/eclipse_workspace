package example;

/**
 * Showing off this class
 * @author damienmcgloin
 *
 */
public class PlayTime {

	/**
	 * Start point for the app
	 * @param args
	 */
	public static void main(String[] args) {
		Time t;
		try {
			t = new Time();
			t.setHour(3);
			
			startHere();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void startHere() {
		
	}

}
