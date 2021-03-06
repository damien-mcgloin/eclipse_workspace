package listexamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(23);
        a.add(9);
        a.add(88);
        System.out.println(a.toString());
        List<Integer> b = new LinkedList<>();
        b.add(3);
        b.add(94);
        b.add(88);
        System.out.println(b.toString());
        removeDuplicates(a, b);

	}
	
	public static void removeDuplicates(List<Integer> originalList, List<Integer> listToRemove) {
        for (Integer removeItem : listToRemove) {
            if (originalList.contains(removeItem)) {
            	originalList.removeAll(listToRemove);
                //originalList.remove(removeItem);        
            }
        }
        
        // smarts ! 
       
        
        System.out.println(originalList.toString());
    }

}
