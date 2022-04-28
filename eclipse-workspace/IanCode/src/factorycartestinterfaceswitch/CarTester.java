package factorycartestinterfaceswitch;


public class CarTester {

	
		public static void main(String[] args) {
			
			// create a racer
		    Car car = CarFactory.getCar("racer");
		    System.out.println("Created car of "+ car.getClass());
		    car.makeSound();
		    
		    // create a limo
		    car = CarFactory.getCar("limo");
		    System.out.println("Created car of "+ car.getClass());
		    car.makeSound();

		    // create a banger
		    car = CarFactory.getCar("banger");
		    System.out.println("Created car of "+ car.getClass());
		    car.makeSound();

		}

	}

