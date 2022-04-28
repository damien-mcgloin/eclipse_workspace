package hotel;

public class Valet {

	public IVehicle getVehicle(IVehicle vehicle) {
		vehicle.start();
		return vehicle;
	}

}
