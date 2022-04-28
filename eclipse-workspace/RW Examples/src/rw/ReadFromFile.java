/**
 * 
 */
package rw;

/**
 * @author damienmcgloin
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String line;
		// get the file
		File file = new File("teams.txt");

		System.out.println("About to open and read file");
		try {
			// open the file
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// read the contents
			line = bufferedReader.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

			// close resources
			bufferedReader.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("About to finish program");
	
	}

}
