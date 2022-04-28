/**
 * 
 */
package animals;

/**
 * @author damienmcgloin
 *
 */
public class Dog {
	
	// instance vars
	private String breed;
	private String name;
	
	// constructors
	
	// methods
	public void bark() {
		System.out.println("Bark");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void rollOver() {
		System.out.println("Roll over .....");
	}

}
