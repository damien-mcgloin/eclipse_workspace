package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckException {
	
	public static void main(String[] args) {
		
        CheckException ck = new CheckException();
        
        ck.iAmChecked();
        
    }
    public void iAmChecked()    {
        
      
		try {
			FileReader fr = new FileReader("nothere.txt");
			
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	      
        
    }

}
