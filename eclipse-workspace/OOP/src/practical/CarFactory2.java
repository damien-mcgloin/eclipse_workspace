package practical;

public class CarFactory2 {

	public static void main(String[] args) {
		
		Car2 car = new Car2();
		
		car.setMake("Ford");
		car.setModel("Fiesta");
		car.setColour("Red");
		car.setNumberOfDoors(2);
		car.startCar();
		car.startCar();
		car.stopCar();
		car.stopCar();
		
		System.out.println(car.toString());

	}

}
