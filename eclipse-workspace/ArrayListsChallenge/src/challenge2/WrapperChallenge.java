/**
 * 
 */
package challenge2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author damienmcgloin
 *
 */
public class WrapperChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("Scores.csv");
		int team1Score, team2Score;
		String game = null;
		String[] gameInfo = null;
		
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		
		game = br.readLine();
		
		while (game != null) {
			gameInfo = game.split(",");
			
			team1Score = Integer.parseInt(gameInfo[1]);
			team2Score = Integer.parseInt(gameInfo[3]);
			
			System.out.println(gameInfo[0] + " ");
			System.out.println(gameInfo[1] + " ");
			System.out.println(gameInfo[2] + " ");
			System.out.println(gameInfo[3] + "\t");
			
			System.out.print("\t\t Winner  ");
			if (team1Score > team2Score) {
				// winner was team 1
				System.out.println(gameInfo[0]);
			} else if (team2Score > team1Score) {
				// winner was team 2
				System.out.println(gameInfo[2]);
			} else {
				// draw
				System.out.println("Draw");
			}
			
			game = br.readLine();
		}
		br.close();
		fr.close();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
