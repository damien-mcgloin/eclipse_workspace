/**
 * 
 */
package practice;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class Challenge {

	public static String readFile() {

		String line = null;

		try {
			File file = new File("ECWinners.txt");
			FileReader fileReader;
			fileReader = new FileReader(file.getName());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

			bufferedReader.close();
			fileReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return line;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> allWinners = new ArrayList<String>();
		
		allWinners.add(readFile());
		
		ArrayList<String> ndWinners = new ArrayList<String>();
		for(int loop = 0; loop < allWinners.size(); loop++) {
			if(!ndWinners.contains(allWinners.get(loop))) {
				ndWinners.add(allWinners.get(loop));
			}
		}
		
		System.out.println(ndWinners.toString());

	}
}
