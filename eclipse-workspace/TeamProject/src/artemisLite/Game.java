/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Damien McGloin 40000631
 *
 */
public class Game {

	public static List<Player> players = new ArrayList<Player>();

	// private member vars for board, players, activePlayer, goMoney

	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	Player player4 = new Player();
	Player activePlayer = new Player();
	private int goMoney;
	private boolean victory;

	// Default constructor
	public Game() {

	}

	// Constructor with args
	public Game(int goMoney, boolean victory) {
		this.goMoney = goMoney;
		this.victory = victory;
	}

	// getters & setters
	public int getGoMoney() {
		return goMoney;
	}

	public void setGoMoney(int goMoney) {
		this.goMoney = goMoney;
	}

	public boolean isVictory() {
		return victory;
	}

	public void setVictory(boolean victory) {
		this.victory = victory;
	}

	/**
	 * 
	 */
	public void startGame() {
		// this method would instantiate the board and use the initialiseBoard method to
		// populate it.
		Board board = new Board();
		board.initialiseBoard();

		// then it would ask for the user to input the number of players and then ask
		// each player in turn for their name (will need to include checks for duplicate
		// names).

		Scanner startGameScanner = new Scanner(System.in);
		System.out.println("Please enter the number of players (between 2 and 4)");

		try {
			int numOfPlayers = startGameScanner.nextInt();
			setUpPlayers(numOfPlayers);// calls method to set up players
		} catch (InputMismatchException e) {
			System.out.println("Value entered must be a single integer...");
		}

		activePlayer = players.get(0);
		displayIntro();

		startGameScanner.close();

		/*
		 * System.out.println("Please enter the number of players"); Scanner scanner1 =
		 * new Scanner(System.in);
		 * 
		 * int playerNum = scanner1.nextInt();
		 * 
		 * System.out.println("What is the player's name?"); Scanner scanner2 = new
		 * Scanner(System.in);
		 * 
		 * player1.setName(scanner2.nextLine());
		 * 
		 * System.out.println("What is the second player's name?"); Scanner scanner3 =
		 * new Scanner(System.in);
		 * 
		 * player2.setName(scanner3.nextLine());
		 * 
		 * if (playerNum > 2 && playerNum < 4) {
		 * 
		 * System.out.println("What is the third player's name?"); Scanner scanner4 =
		 * new Scanner(System.in);
		 * 
		 * player3.setName(scanner4.nextLine());
		 * 
		 * } else if (playerNum > 3 && playerNum < 5) {
		 * 
		 * System.out.println("What is the third player's name?"); Scanner scanner4 =
		 * new Scanner(System.in);
		 * 
		 * player3.setName(scanner4.nextLine());
		 * 
		 * System.out.println("What is the third player's name?"); Scanner scanner5 =
		 * new Scanner(System.in);
		 * 
		 * player4.setName(scanner5.nextLine()); }
		 * 
		 * 
		 * // it would then create each player via a constructor and set the resources
		 * to a // starting amount (need to decide this), position to 0 and properties
		 * owned to // a new ArrayList, each player is added to the players list.
		 * players.add(player1); players.add(player2);
		 * 
		 * if(!player3.getName().equals(null)) { players.add(player3); }
		 * 
		 * if(!player4.getName().equals(null)) { players.add(player4); }
		 * 
		 * 
		 * 
		 * // the method then displays the introductory text displayIntro();
		 * 
		 * // finally it sets the activePlayer to the player at index 0 in players
		 * 
		 * 
		 * 
		 * // note: this is kinda a long method - you could definitely create and call
		 * // other methods (for example you could create a displayIntro method and call
		 * it // from here rather than this method holding all of the functions)
		 */
	}

	/**
	 * this method sets up a fixed number of players based on integer entered number
	 * of players must be between 2 and 4 each player must have a unique name
	 * 
	 * @param numberOfPlayers
	 */
	public void setUpPlayers(int numOfPlayers) {
		Scanner playerNameScanner = new Scanner(System.in);

		do {

			if (!(numOfPlayers >= 2 && numOfPlayers <= 4)) {
				System.out.println("Invalid input. \nPlease enter the number of players (between 2 and 4)");
			}

		} while (numOfPlayers < 2 || numOfPlayers > 4);

		int loop = 1;

		while (loop <= numOfPlayers) {

			System.out.println("Player " + loop + ", please enter your name");
			String playerName = playerNameScanner.nextLine();

			// need to check to see if player name already exists (
			// cannot have two players with same name.
			
			/* potential idea for validation regarding player names
			switch (loop) {
			case 1:
				Player player1 = new Player(playerName, 0, 0);
				players.add(player1);
				break;
			case 2:
				Player player2 = new Player(playerName, 0, 0);
				if(!players.contains(player2.getName())) {
				players.add(player2);
				} else {
					System.out.println("Error - name already exists");
				}
				break;
			case 3:
				Player player3 = new Player(playerName, 0, 0);
				players.add(player3);
				break;
			case 4:
				Player player4 = new Player(playerName, 0, 0);
				players.add(player4);
				break;
			default:
				System.out.println("uh oh");
			}
			*/
			
			switch (loop) {
			case 1:
				Player player1 = new Player(playerName, 0, 0);
				players.add(player1);
				break;
			case 2:
				Player player2 = new Player(playerName, 0, 0);
				players.add(player2);
				break;
			case 3:
				Player player3 = new Player(playerName, 0, 0);
				players.add(player3);
				break;
			case 4:
				Player player4 = new Player(playerName, 0, 0);
				players.add(player4);
				break;
			default:
				System.out.println("uh oh");
			}
			
			
			loop++;
		}
		playerNameScanner.close();

	}

	

	/**
	 * 
	 */
	public void nextTurn() {
		// sets the activePlayer as players[+1]
	}

	/**
	 * sets up a number of die objects and rolls them, returning a total dice roll
	 * number
	 * informs the active player of the total of each dice and the overall total
	 * should player interaction with dice roll take place here or in the dice class?
	 */
	public int rollDice() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		dice1.setNumOfSides(6);
		dice2.setNumOfSides(6);

		int roll1 = 0;
		int roll2 = 0;

		Scanner scanner = new Scanner(System.in);
		String proceed;

		do {
			System.out.println(activePlayer.getName() + ", would you like to roll the die? y/n"); // I'd like to add
																									// Player.getName
																									// here to
			// personalise the game

			proceed = scanner.nextLine();

			if (proceed.equalsIgnoreCase("y")) {
				roll1 = dice1.rollDice();
				roll2 = dice2.rollDice();
			} else {
				System.out.println("Please roll the die in order to continue the game. To continue, hit y and enter.");
			}

			scanner.close();
		} while (!proceed.equals("y"));

		int total = roll1 + roll2;

		System.out.println("Nice, " + activePlayer.getName() + ", you've rolled a " + roll1 + " and a " + roll2
				+ " - that makes " + total);
		
		return total;
	}

	/**
	 * 
	 * @param player
	 * @param diceRoll
	 */
	public void movePlayer(Player player) {
		int spacesToMove = rollDice();//rolls two dice
		
		// method updates the player position based on the dice roll
		player.getPosition();//player current position
		player.movePosition(spacesToMove);//adjust player position

		// remember to check if the new index is >= board size, if it is you'll need to
		// adjust the board position and update the resources to show that the player
		// has passed go
		
		

		// also remember to update the player on where they have landed
		
	}

	/**
	 * 
	 */
	public String getStateOfPlay() {
		// displays all of the player's info (might be a nice excuse to use
		// stringBuilder?)
		String newLine = "\n";
		StringBuilder sb = new StringBuilder();
		sb.append("Player name       : ");
		// sb.append(activePlayer.getName());
		sb.append(newLine);
		sb.append("Resources         : ");

		sb.append(newLine);
		sb.append("Position          : ");

		sb.append(newLine);
		sb.append("Properties owned  : ");

		sb.append(newLine);

		return sb.toString();
	}

	public void displayIntro() {
		System.out.print("Welcome to our game brave heroes of space, ");
		for (Player p : players) {
			System.out.printf(p.getName()+", ");
		}
		System.out.printf("\n");
		System.out.printf(
				"It is a period of great turmoil,\n"+
				"Our home planet,\n"+
				"ravaged by climate change,\n"+
				"diseases running rife\n"+
				"is becoming nigh on uninhabitable.\n"+
				"\n"+
				"On earth a group of scientists\n"+
				"the best, the brightest,\n"+
				"undertake a crucial mission:\n"+
				"push the boundaries\n"+
				"of space exploration.\n"+
				"\n"+
				"Humanity is on a journey to Mars,\n"+
				"first stop: the Moon,\n"+
				"only through collective effort,\n"+
				"will this great goal be fulfilled,\n"+
				"welcome, human,\n"+
				"to your ArtemisLite quest."
				);
	}

	public void endGame() {
		// will need to display an end of game text (will be different on whether or not
		// the game has been won or lost)
		// might be an idea to pass a boolean through and then display the winning outro
		// if it's true and the
		// losing outro if it's false

		if (victory = true) {
			System.out.println("You are the hero of space");
		} else {
			System.out.println("Sorry but you suck");
		}

		// will also need to display a final state of play
		getStateOfPlay();
	}

}

