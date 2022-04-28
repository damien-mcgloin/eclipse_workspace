/**
 * 
 */
package practical2;

import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 f11 = new F1("Ferrari", "Maranello", 333, 1.24);
		F1 f12 = new F1("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(fs1);
		cars.add(f11);
		cars.add(f12);
		cars.add(r1);
		cars.add(fs2);
		
		//Car[] cars2 = {fs1, f11, f12, r1, fs2};
		
		//1. find the car with the least horsepower
		leastHorsePower(cars);
		
		// 2. output details of all cars
		for(Car car: cars) {
			System.out.println();
			car.displayAll();
		}
		
		// 3. output average horsepower
		averageHorsePower(cars);
		
	}
	
	public static void leastHorsePower(ArrayList<Car> cars) {
		
		int min = cars.get(0).getHorsePower();
		
		for(Car car: cars) {
			if(min>car.getHorsePower()) {
				min = car.getHorsePower();
				System.out.println("The car with the least horsepower is : "+car.getModel());
			}
		}
		
	}
	
	public static void averageHorsePower(ArrayList<Car> cars) {
		
		double total = 0;
		
		for(int loop = 0; loop<cars.size(); loop++) {
			total+=cars.get(loop).getHorsePower();
		}
		
		System.out.printf("\nThe average horsepower is : %.2f",total/cars.size());
		
	}

}
