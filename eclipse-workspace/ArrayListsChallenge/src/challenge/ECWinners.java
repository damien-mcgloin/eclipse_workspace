/**
 * 
 */
package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class ECWinners {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		readAndPopulateWinnersList();
		
		
		
	}
	
	public static ArrayList<String> readAndPopulateWinnersList() {

	ArrayList<String> winners = new ArrayList<String>();
		
		try {
		File file = new File("ECWinners.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String team = br.readLine();
		
		for(int loop = 0; loop<winners.size(); loop++) {
			while (team!=null) {
				winners.add(team);
				team = br.readLine();
			}
		}
		
		fr.close();
		br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return winners;

	}

}
