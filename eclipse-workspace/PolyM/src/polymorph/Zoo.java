package polymorph;

public class Zoo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		//animal.makeNoise();
		
		Dog dog = new Dog();
		dog.setLicenseNumber(32423);
		//dog.makeNoise();
		
		Lion myla = new Lion();
		Animal aidanPet = myla;
		
		if(aidanPet instanceof Dog) {
			Dog aidanDog = (Dog) aidanPet;
			aidanDog.getLicenseNumber();
		} else {
			System.out.println("No!");
		}
		
		Lion lion = new Lion();
		//lion.makeNoise();
		
		Cat cat = new Cat();
		cat.setNumOfFeet(4);
		//cat.makeNoise();
		
		// specific array programming
		Dog[] dogs = new Dog[3];
		dogs[0] = dog;
		//dogs[1] = lion;
		
		/*
		for (Dog d : dogs) {
			d.makeNoise();
		}*/
		
		// general ! polymprphic array
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

	}
	
	public static void drDolittle(Animal animal) {
		animal.makeNoise();
	}

}
