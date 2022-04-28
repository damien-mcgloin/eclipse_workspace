package sims;

public class Telesales extends Person implements IPest {

	@Override
	public void beAnnoying() {
		makePhoneRing();
		
	}
	
	private void makePhoneRing() {
        System.out.println("Ring ring...");
    }

}
