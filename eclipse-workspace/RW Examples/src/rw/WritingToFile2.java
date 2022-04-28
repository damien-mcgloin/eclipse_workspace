/**
 * 
 */
package rw;

/**
 * @author damienmcgloin
 *
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

public class WritingToFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileWriter fw;
		BufferedWriter bw;
		
		File file = new File("potatoes.txt");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.write("There's");
			bw.write("\nmore");
			bw.write("\nto");
			bw.write("\nvalor");
			bw.write("\nthan");
			bw.write("\nfighting");
			bw.write("\nonly");
			bw.write("\nwhen");
			bw.write("\nyou");
			bw.write("\nthink");
			bw.write("\nyou");
			bw.write("\ncan");
			bw.write("\nwin");
			bw.write(".");
			
			fw.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
