/**
 * 
 */
package artemisLite;

import java.util.Scanner;

/**
 * @author emmadeane
 *
 */
public class Square {

	// private member vars
	private String name;
	private SquareType squareType;
	private int priceToAcquire;
	private int priceOfRent;
	private int priceToDevelop;
	private int priceToMajorDevelop;
	private int numOfDevelopments;
	private Player owner;
	private SystemGroup system;

	/**
	 * Creates a square with name and squareType.
	 * 
	 * @param name
	 * @param squareType
	 */
	public Square(String name, SquareType squareType) {
		this.name = name;
		this.squareType = squareType;
	}

	/**
	 * Creates a square with all arguments.
	 * 
	 * @param name
	 * @param squareType
	 * @param priceToAcquire
	 * @param priceOfRent
	 * @param priceToDevelop
	 * @param priceToMajorDevelop
	 * @param numOfDevelopments
	 * @param owner
	 * @param system
	 */
	public Square(String name, SquareType squareType, int priceToAcquire, int priceOfRent, int priceToDevelop,
			int priceToMajorDevelop, int numOfDevelopments, Player owner, SystemGroup system) {
		this.name = name;
		this.squareType = squareType;
		this.priceToAcquire = priceToAcquire;
		this.priceOfRent = priceOfRent;
		this.priceToDevelop = priceToDevelop;
		this.priceToMajorDevelop = priceToMajorDevelop;
		this.numOfDevelopments = numOfDevelopments;
		this.owner = owner;
		this.system = system;
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
	 * @return the squareType
	 */
	public SquareType getSquareType() {
		return squareType;
	}

	/**
	 * @param squareType the squareType to set
	 */
	public void setSquareType(SquareType squareType) {
		this.squareType = squareType;
	}

	/**
	 * @return the priceToAcquire
	 */
	public int getPriceToAcquire() {
		return priceToAcquire;
	}

	/**
	 * @param priceToAcquire the priceToAcquire to set
	 */
	public void setPriceToAcquire(int priceToAcquire) {
		this.priceToAcquire = priceToAcquire;
	}

	/**
	 * @return the priceOfRent
	 */
	public int getPriceOfRent() {
		return priceOfRent;
	}

	/**
	 * @param priceOfRent the priceOfRent to set
	 */
	public void setPriceOfRent(int priceOfRent) {
		this.priceOfRent = priceOfRent;
	}

	/**
	 * @return the priceToDevelop
	 */
	public int getPriceToDevelop() {
		return priceToDevelop;
	}

	/**
	 * @param priceToDevelop the priceToDevelop to set
	 */
	public void setPriceToDevelop(int priceToDevelop) {
		this.priceToDevelop = priceToDevelop;
	}

	/**
	 * @return the priceToMajorDevelop
	 */
	public int getPriceToMajorDevelop() {
		return priceToMajorDevelop;
	}

	/**
	 * @param priceToMajorDevelop the priceToMajorDevelop to set
	 */
	public void setPriceToMajorDevelop(int priceToMajorDevelop) {
		this.priceToMajorDevelop = priceToMajorDevelop;
	}

	/**
	 * @return the numOfDevelopments
	 */
	public int getNumOfDevelopments() {
		return numOfDevelopments;
	}

	/**
	 * @param numOfDevelopments the numOfDevelopments to set
	 */
	public void setNumOfDevelopments(int numOfDevelopments) {
		this.numOfDevelopments = numOfDevelopments;
	}

	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
	 * @return the system
	 */
	public SystemGroup getSystem() {
		return system;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(SystemGroup system) {
		this.system = system;
	}

	/**
	 * 
	 * @param player
	 */
	public void landedOn(Player player) {
		Scanner scanner = new Scanner(System.in);
		String playerOption = "";

		System.out.println(player.getName() + " has landed on " + this.getName());

		switch (this.getSquareType()) {
		case GO:
			// does anything need to go here? the movePlayer method will deal with giving
			// the player resources...
			break;
		case PAUSE_RESEARCH:
			System.out.println("Your research has been put on hold pending investigation.");
			break;
		case PURCHASABLE:

			if (this.getOwner() == null && player.getResources() >= this.getPriceToAcquire()) {
				// there is no owner and the player has sufficient funds

				System.out.println(this.getName() + " is available for purchase for a price of "
						+ this.getPriceToAcquire() + " resource tokens. Your current balance is "
						+ player.getResources() + " resource tokens. Would you like to purchase this square? Y/N");

				playerOption = scanner.next();

				if (playerOption.trim().equalsIgnoreCase("y")) {
					// player decides to buy property

					System.out.println(player.getName() + " has purchased " + this.getName() + ". Your new balance is "
							+ player.getResources() + " resource tokens.");

					player.deductResources(this.getPriceToAcquire());

					player.addProperty(this);

				} else if (playerOption.trim().equalsIgnoreCase("n")) {
					// player decides not to purchase the property

					System.out.println(player.getName() + " does not wish to buy " + this.getName() + ".");
					// ????????????
					// still need to figure out how to switch to new players
					// something to do with Game.players i think

				} else {
					// invalid input

					System.out.println("Invalid input. Please enter Y or N.");
					// ????????????
					// how to get the question to repeat
				}

			} else if (this.getOwner() == null && player.getResources() < this.getPriceToAcquire()) {
				// there is no owner but the player has insufficient funds
				System.out.println(this.getName() + " is available for purchase for a price of "
						+ this.getPriceToAcquire() + " resource tokens. Your current balance is "
						+ player.getResources() + " resource tokens. You do not have sufficient funds. "
						+ this.getName() + " will now be offered to the other players.");
				// ????????????
				// still need to figure out how to switch to new players

			} else {
				// the property is already owned
				System.out.println(this.getName() + " is owned by " + this.getOwner()
						+ ". The rent on this property is " + this.priceOfRent
						+ " resource tokens. Your current balance is " + player.getResources() + " resource tokens. "
						+ this.getOwner() + " would you like to charge rent? Y/N");

				playerOption = scanner.next();

				if (playerOption.trim().equalsIgnoreCase("y")) {
					// owner decides to charge rent

					if (player.getResources() < this.priceOfRent) {
						// the player cannot afford the rent

						owner.addResources(player.getResources());
						player.deductResources(player.getResources());
						System.out.println(this.owner + " has decided to charge rent. " + player.getName()
								+ " you have been made bankrupt! \nGame Over!\nThe Artemis Project has failed...");
						// !!!!
						// insert end game method
					} else {
						// the player can afford the rent

						owner.addResources(this.priceOfRent);
						player.deductResources(this.priceOfRent);
						System.out.println(this.owner + " has decided to charge rent. Your new balance is "
								+ player.getResources());
					}

				} else if (playerOption.trim().equalsIgnoreCase("n")) {
					// owner decides not to charge rent

					System.out.println(this.owner + " has decided not to charge rent. Your balance is still "
							+ player.getResources());
				} else {
					// invalid input

					System.out.println("Invalid input. Please enter Y or N.");
					// ????????????
					// how to get the question to repeat
				}

			}

			break;
		default:
			System.out.println("uh oh");
		}
		scanner.close();
	}

	/**
	 * 
	 * @param player
	 */
	public void develop(Player player) {
		if ((player.getResources() < this.priceToDevelop && this.numOfDevelopments < 3)
				|| (player.getResources() < this.priceToMajorDevelop && this.numOfDevelopments == 4)) {
			// player has insufficient funds
			System.out.println("You do not have sufficient funds to complete this action.");
		} else {
			// player has sufficient funds
			if (this.numOfDevelopments < 3) {
				// normal development
				this.numOfDevelopments += 1;
				player.deductResources(this.priceToDevelop);
				System.out.println("Successful development! " + this.getName() + " has now been developed "
						+ this.getNumOfDevelopments() + " times.");
			} else if (this.numOfDevelopments == 3) {
				// major development
				System.out.println(this.getName() + " has already been developed " + this.getNumOfDevelopments()
						+ " times. A major development will now take place. \nSuccessful major development! "
						+ this.getName() + " is now fully developed.");
				this.numOfDevelopments += 1;
				player.deductResources(priceToMajorDevelop);
			} else {
				System.out.println(this.getName() + " is already fully developed");
			}
		}
	}

}
