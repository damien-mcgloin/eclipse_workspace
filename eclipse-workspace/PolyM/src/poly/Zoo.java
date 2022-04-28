package poly;

public class Zoo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeNoise();
		
		Dog dog = new Dog();
		//dog.setLicenseNumber(32423);
		dog.makeNoise();
		
		Animal lion = new Lion();
		lion.makeNoise();
		
		Cat cat = new Cat();
		cat.makeNoise();
		
		Lion myla = new Lion();
		// upcast !
        Animal aidanPet = myla;
        
        if (aidanPet instanceof Dog) {
        	// downcast
            Dog aidanDog = (Dog) aidanPet;
            aidanDog.getLicenseNumber();
        } else {
            System.out.println("No!");
        }
		
		// specific array programming
		Dog[] dogs = new Dog[3];
		dogs[0] = dog;
		//dogs[1] = lion;
		/*
		for (Dog d : dogs) {
			d.makeNoise();
		}
		*/
		
		// general ! polymorphic array
		Animal[] animals = new Animal[4];
		
		animals[0] = animal;
		animals[1] = dog;
		animals[2] = lion;
		animals[3] = cat;
		
		
		for (Animal a : animals) {
			a.makeNoise();
		}
		
		drDoLittle(dog);
		drDoLittle(lion);
		drDoLittle(cat);

	}
	
	public static void drDoLittle(Animal animal) {
		animal.makeNoise();
	}

}
