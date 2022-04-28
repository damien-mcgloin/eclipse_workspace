package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Challenge {

	public static void main(String[] args) {
		
		ArrayList<String> Catch22 = new ArrayList<String>();
		
		File file = new File("Catch 22.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String read;
			read = br.readLine();
			
			
			while(read!=null) {
				Catch22.add(read);
				read = br.readLine();
			}
			
			System.out.println(Catch22.toString());
			
			br.close();
			fr.close();
			
			System.out.println("\n------- File end ---------");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
