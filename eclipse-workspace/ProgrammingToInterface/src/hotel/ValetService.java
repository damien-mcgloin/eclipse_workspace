package hotel;

public class ValetService {

	public static void main(String[] args) {
		
		// create new vehicles
		IVehicle c1 = new Car();
		//Car c2 = new Car();
		
		Motorbike b1 = new Motorbike();
		
		// create a valet
		Valet valet = new Valet();
		
		// get the reference from the valet
		IVehicle returnVehicle = valet.getVehicle(c1);
		
		if (returnVehicle instanceof Car) {
			Car returnedCar = (Car)returnVehicle;
			returnedCar.setMileage(8383838);
			System.out.println(returnedCar.getMileage());
		}
		
		/*
		Car car = (Car) valet.getVehicle(c1);
		car.setMileage(1000);
		System.out.println(car.getMileage());
		*/
		
		valet.getVehicle(b1);

	}

}
