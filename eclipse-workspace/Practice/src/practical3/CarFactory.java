package practical3;

public class CarFactory {

	public static void main(String[] args) {
		
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 f11 = new F1("Ferrari", "Maranello", 333, 1.24);
		F1 f12 = new F1("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		Car[] cars = {fs1, f11, f12, r1, fs2};
		
		// 1. output the model of the car with the least horsepower
		leastHorsePower(cars);
		
		// 2. output details
		for(Car car : cars) {
			System.out.println();
			car.displayAll();
		}
		
		// 3. output the average horsepower of the cars
		averageHorsePower(cars);

	}
	
	public static void leastHorsePower(Car[] cars) {
		
		int min = cars[0].getHorsePower();
		String least = cars[0].getModel();
		
		for(int loop = 0; loop<cars.length; loop++) {
			if(min>cars[loop].getHorsePower()) {
				min=cars[loop].getHorsePower();
				least=cars[loop].getModel();
			}
		}
		
		System.out.println("The model with the least horsepower is : "+least);
				
	}
	
	public static void averageHorsePower(Car[] cars) {
		
		int total = 0;
		
		for(int loop = 0; loop<cars.length; loop++) {
			total+=cars[loop].getHorsePower();
		}
		
		double average = (double)total/cars.length;
		
		System.out.printf("\nThe average horsepower is : %.2f",average);
		
	}

}
