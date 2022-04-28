/**
 * 
 */
package practical;

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
		
		Car[] cars = {fs1, f11, f12, r1, fs2};
		
		// 1. find the car with the least horsepower and output the model
		leastHorsePower(cars);
		
		// 2. output all details of the cars
		for(Car car: cars) {
			System.out.println();
			car.displayAll();
		}
		// 3. output the average horse power for all cars to two decimal places
		averageHorsePower(cars);

	}
	
	public static void leastHorsePower(Car[] cars) {
		
		int min = cars[0].getHorsePower();
		
		for (Car car: cars) {
			if(car.getHorsePower()<min) {
				min = car.getHorsePower();
				System.out.println("The car with the least horsepower is : "+car.getModel());
			}
		}
		
	}
	
	public static void averageHorsePower(Car[] cars) {
		
		double average;
		int total = 0;
		
		for (int loop = 0; loop<cars.length; loop++) {
			total+=cars[loop].getHorsePower();
		}
		
		average = (double)total/cars.length;
		System.out.printf("\nThe average horsepower is %.2f",average);
		
	}

}
