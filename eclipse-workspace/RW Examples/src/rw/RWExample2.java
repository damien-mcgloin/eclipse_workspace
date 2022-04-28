/**
 * 
 */
package rw;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class RWExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] example = new int [5];
		
		for(int loop = 0; loop<example.length; loop++) {
			System.out.println("Enter five numbers...");
			example[loop] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(example));
		
		Arrays.sort(example);
		System.out.println(Arrays.toString(example));
		
		FileWriter fw;
		BufferedWriter bw;
		File file = new File("page2");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for(int loop = 0; loop<example.length; loop++) {
				bw.write(example[loop] + " ");
			}
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();

	}

}
