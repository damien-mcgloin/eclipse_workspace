package tdd;

public class Footballer {

	private int age;

	public Footballer() {

	}

	/**
	 * 
	 * @param ageValidLower
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age >= 16 && age <= 40) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Invalid age range");
		}
	}

	public int getAge() {
		return age;
	}

}
