package sims;

public class HouseFly extends Insect implements IPest {
	
	@Override
	public void beAnnoying() {
		
		flyAroundYourHead();
	}
	
	private void flyAroundYourHead() {
		System.out.println("buuuzzzzzzzzz!");
		System.out.println("Sitting on your food.. hahaha!");
	}

}
