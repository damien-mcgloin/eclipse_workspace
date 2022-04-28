package carfactory;

import java.util.ArrayList;

public class CarFactory {

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
		
		
		// 1. find the car with the least horsepower
		leastHorsePower(cars);
		
		// 2. output all details of the cars
		for(Car c: cars) {
			System.out.println();
			c.displayAll();
		}
		
		// 3. Output the average horsepower
		averageHorsePower(cars);

	}
	
	public static void leastHorsePower(ArrayList<Car> cars) {
		
		int min = cars.get(0).getHorsePower();
		String least = cars.get(0).getModel();
		
		for(Car c: cars) {
			if(c.getHorsePower()<min) {
				least=c.getModel();
				System.out.println("The car with the least horsepower is : "+least);
			}
		}
		
	}
	
	public static void averageHorsePower(ArrayList<Car> cars) {
		
		int total = 0;
		double average;
		
		for(Car c: cars) {
			total+=c.getHorsePower();
		}
		
		average = (double)total/cars.size();
		
		System.out.printf("\nThe average horsepower is : %.2f",average);
		
	}

}
