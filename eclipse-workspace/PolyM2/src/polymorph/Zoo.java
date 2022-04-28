package polymorph;

public class Zoo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeNoise();

		Dog dog = new Dog();
		// dog.setLicenseNumber(32423);
		dog.makeNoise();

		Lion lion = new Lion();
		lion.makeNoise();

		// specific array programming
		Dog[] dogs = new Dog[3];
		dogs[0] = dog;
		// dogs[1] = lion;

		/*
		 * for (Dog d: dogs) { d.makeNoise(); }
		 */

		Cat cat = new Cat();
		cat.makeNoise();

		// general ! polymorphic array
		Animal[] animals = new Animal[4];

		animals[0] = animal;
		animals[1] = dog;
		animals[2] = lion;
		animals[3] = cat;

		for (Animal a : animals) {
			a.makeNoise();
		}
		
		drDolittle(dog);
		drDolittle(lion);
		drDolittle(cat);

		// upcast!
		Lion myla = new Lion();
		
		Animal aidanPet = myla;
		
		if(aidanPet instanceof Dog) {
			// downcast
			Dog aidanDog = (Dog) aidanPet;
			aidanDog.getLicenseNumber();
		} else {
			System.out.println("No!");
		}
		
	}

	public static void drDolittle(Animal animal) {

		animal.makeNoise();
		
	}

}
