/**
 * 
 */
package rw;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author damienmcgloin
 *
 */
public class ReadFromFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("potatoes.txt");
		String line;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			while (line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem with reading the file");
		} catch (Exception e) {
			System.out.println("Had a problem...");
		}
	
	
	}
}
