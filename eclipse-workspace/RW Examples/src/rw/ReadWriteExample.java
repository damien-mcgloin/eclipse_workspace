/**
 * 
 */
package rw;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author damienmcgloin
 *
 */
public class ReadWriteExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			// prompt the user for a series of numbers
			System.out.println("Please enter 5 numbers");

			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();

			// sort the numbers in ascending order

			File file = new File("Page.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);

			BufferedWriter bw = new BufferedWriter(fw);

			int[] exampleArray = { userInput };

			for (int loop = 0; loop < exampleArray.length; loop++) {
				Arrays.sort(exampleArray);
			}
			
			bw.write(userInput);
			bw.close();
			System.out.println("Write Complete");
			
			sc.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
