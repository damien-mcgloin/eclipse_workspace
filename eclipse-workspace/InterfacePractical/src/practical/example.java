package practical;

public class example extends Employee implements IAdministerDrugs {

	public example() {
		// TODO Auto-generated constructor stub
	}

	public example(String firstName, String lastName, double baseRate) {
		super(firstName, lastName, baseRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return false;
	}

}
