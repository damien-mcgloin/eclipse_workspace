/**
 * 
 */
package rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author damienmcgloin
 *
 */
public class RWExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String line;
		
		File file = new File("SixNations1996.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}
}
