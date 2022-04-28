package challenge;

import java.util.ArrayList;

public class CarFactory {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 f11 = new F1("Ferrari", "Maranello", 333, 1.24);
		F1 f12 = new F1("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 343, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		cars.add(fs1);
		cars.add(f11);
		cars.add(f12);
		cars.add(r1);
		cars.add(fs2);
		
		// 1. find the car with the least horsepower
		leastHorsePower(cars);
		
		// 2. output all details
		carDetails(cars);
		
		// 3. output the average horsepower
		averageHorsePower(cars);

	}
	
	public static void leastHorsePower(ArrayList<Car> cars) {
		
		int least = cars.get(0).getHorsePower();
		String model = cars.get(0).getModel();
		
		for(Car car : cars) {
			if (car.getHorsePower() < least) {
				least = car.getHorsePower();
				model = car.getModel();
			}
			
		}
		System.out.println("The car with the least horsepower is : "+model);
		
	}
	
	public static void carDetails(ArrayList<Car> cars) {
		
		for(Car car: cars) {
			System.out.println();
			car.displayAll();
		}
		
	}
	
	public static void averageHorsePower(ArrayList<Car> cars) {
		
		int total = 0;
		double average;
		
		for(int loop = 0; loop<cars.size(); loop++) {
			total+=cars.get(loop).getHorsePower();
		}
		
		average = (double) total/cars.size();
		System.out.printf("\nThe average horsepower is : %.2f",average);
		
	}

}
