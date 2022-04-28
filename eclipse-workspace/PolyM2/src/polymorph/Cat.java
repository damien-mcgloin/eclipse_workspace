package polymorph;

public class Cat extends Animal {
	
	private String favoriteFood;

	/**
	 * @return the favoriteFood
	 */
	public String getFavoriteFood() {
		return favoriteFood;
	}

	/**
	 * @param favoriteFood the favoriteFood to set
	 */
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	@Override
	public void makeNoise() {
		System.out.println("Cat goes meooowww!!");
	}
	
	

}
