/**
 * 
 */
package animals;

/**
 * @author damienmcgloin
 *
 */
public class AnimalManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * int myVar;
		 * myVar = 999;
		 */
		
		// create myla
		Dog myla = new Dog();
		//Dog bran = new Dog();
		
		// make myla bark
		myla.bark();
		myla.setBreed("Bichon");
		myla.setName("Myla");
		myla.rollOver();
		
		System.out.println("My dog is :");
		System.out.println("Name : "+myla.getName());
		System.out.println("Breed : "+myla.getBreed());

	} // end of main

}
