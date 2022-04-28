/**
 * 
 */
package p240000631;

/**
 * @author damienmcgloin 40000631
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
		
		Car[] cars = {fs1, r1, f11, f12, fs2};
		
		showAllCarDetails(cars);
		
		outLeastHP(cars);
		
		averageHorsePower(cars);

	}
	
	public static void showAllCarDetails(Car[] cars) {
		
		for(Car car: cars) {
			System.out.println();
			car.displayAll();
		}
		
	}
	
	public static void outLeastHP(Car[] cars) {
		
		int min = cars[0].getHorsePower();
		String leastHPModel = cars[0].getModel();
		
		for (Car car : cars) {
			if (car.getHorsePower()<min) {
				min=car.getHorsePower();
				leastHPModel=car.getModel();
			}
		}
		
		System.out.println("\nMinimum Horsepower : "+leastHPModel);
		
	}
	
	public static void printAllDetails(Car[] cars) {
		
	}
	
	public static void averageHorsePower(Car[] cars) {
		
		int max = cars[0].getHorsePower();
		
		for (Car car : cars) {
			if (car.getHorsePower()>max) {
				max = car.getHorsePower();
			}
		}
		
		double average = max/cars.length;
		System.out.printf("The average horse power is : %.2f", average);
		
	}

}
