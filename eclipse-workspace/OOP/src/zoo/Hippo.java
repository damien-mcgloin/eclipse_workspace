package zoo;

public class Hippo {
	
	// instance vars
	private int weight;
	private String name;
	
	// constructors
	/**
	 * default constructor
	 */
	public Hippo() {
		System.out.println("Default constructor being used here");
	}
	
	/**
	 * constructor with args
	 * @param name
	 * @param weight
	 */
	public Hippo(String name, int weight) {
		this.name = name;
		this.weight = weight;
		
	}
	
	
	
	// methods
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	
	
	
	
}
