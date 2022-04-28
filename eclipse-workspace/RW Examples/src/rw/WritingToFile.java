/**
 * 
 */
package rw;

/**
 * @author damienmcgloin
 *
 */

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class WritingToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fileWriter;
		BufferedWriter bufferedWriter;

		// open the file
		File file = new File("SixNations1996.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {

			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("Scot");
			bufferedWriter.write("\nEng");
			bufferedWriter.write("\nIre");
			bufferedWriter.write("\nWales");
			bufferedWriter.write("\nFra");

			bufferedWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}