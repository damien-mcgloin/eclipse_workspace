/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author emmadeane
 *
 */
public class Board {

	private List<Square> currentBoard = new ArrayList<Square>();
	
	/**
	 * Default constructor
	 */
	public Board() {
		
	}
	
	
	/**
	 * Constructor with args
	 * 
	 * @param currentBoard
	 */
	public Board(List<Square> currentBoard) {
		this.currentBoard = currentBoard;
	}

	/**
	 * Populates a default board.
	 */
	public void initialiseBoard() {
		currentBoard.add(new Square("Go", SquareType.GO));
		currentBoard.add(new Square("Boosters", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.SPACE_LAUNCH_SYSTEM));
		currentBoard.add(new Square("Engines", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.SPACE_LAUNCH_SYSTEM));
		currentBoard.add(new Square("Primary Life Support Systems", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ARTEMIS_GENERATION_SPACESUITS));
		currentBoard.add(new Square("Communication Carrier Assembly", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ARTEMIS_GENERATION_SPACESUITS));
		currentBoard.add(new Square("Display and Control Module", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ARTEMIS_GENERATION_SPACESUITS));
		currentBoard.add(new Square("Pause Research", SquareType.PAUSE_RESEARCH));
		currentBoard.add(new Square("Service Module", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ORION));
		currentBoard.add(new Square("Crew Module", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ORION));
		currentBoard.add(new Square("Launch Abort System", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.ORION));
		currentBoard.add(new Square("Power and Propulsion Element", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.GATEWAY));
		currentBoard.add(new Square("Habitation and Logistics Outpost (HALO)", SquareType.PURCHASABLE, 0, 0, 0, 0, 0, null, SystemGroup.GATEWAY));
	}
	
	/**
	 * returns the details of the square a player is on, based on their position
	 * in a list of squares
	 * @param playerPosition
	 * @return
	 */
	public Square playSquare(int playerPosition) {
		return currentBoard.get(playerPosition);
	}
	
}
