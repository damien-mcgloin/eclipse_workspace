package zoo;

public class AnimalFactory {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setName("an animal");
		animal.setNoise(" noise !!! ***** ");
		animal.makeNoise();
		
		Dog dog = new Dog();
		dog.setName("Myla");
		dog.setNoise("BARK BARK !");
		dog.setLicenseNumber(2341234);
	
		dog.makeNoise();
		System.out.println(dog.getLicenseNumber());
		
	}

}
