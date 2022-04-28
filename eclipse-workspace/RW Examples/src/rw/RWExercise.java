/**
 * 
 */
package rw;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class RWExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//int userInput = scanner.nextInt();
		
		int[] exampleArray = new int[5];
		
		for(int loop = 0; loop<exampleArray.length; loop++) {
			System.out.println("Enter five numbers");
			exampleArray[loop] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(exampleArray));
		
		Arrays.sort(exampleArray);
		System.out.println(Arrays.toString(exampleArray));
		
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;
		File file = new File("Nums.txt");
		
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
			for(int loop = 0; loop<exampleArray.length; loop++) {
				bufferedWriter.write(exampleArray[loop] + " ");
			}

			bufferedWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();

	}

}
