package practical;

public class CarFactory1 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setColour("Red");
		car1.setMake("Ford");
		car1.setModel("Fiesta");
		
		System.out.println(car1.toString());
		
		car1.startCar();
		car1.startCar();
		car1.stopCar();
		car1.stopCar();

	}

}
