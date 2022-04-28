package practice;

public abstract class Person {

	private final int MIN_HEIGHT = 0;

	private String name;
	private int height;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int height) {
		this.setName(name);
		this.setHeight(height);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) throws IllegalArgumentException {
		if (height >= MIN_HEIGHT) {
			this.height = height;
		} else {
			throw new IllegalArgumentException("Outside height range");
		}
	}
}
