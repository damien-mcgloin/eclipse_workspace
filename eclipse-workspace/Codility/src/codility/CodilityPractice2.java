/**
 * 
 */
package codility;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author damienmcgloin
 *
 */
public class CodilityPractice2 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		solution();
		
	}
		
		public String solution2(String S) {
			
			Pattern pattern = Pattern.compile("null");
			Matcher matcher = pattern.matcher(ListB)
			
			return S;
			
		}
	
		public String solution(String S) {
		
		List<String> ListA = new ArrayList<String>();
		
		ListA.add("id");
		ListA.add("name");
		ListA.add("age");
		ListA.add("score");
		
		Object element = null;
		
		List<Object> ListB = new ArrayList<>();
		
		ListB.add(element);
		
		/*boolean containsElement;
		containsElement = ListB.contains(null);
		System.out.println(containsElement);
		*/
		
		ListB.remove(element);
		
		if(ListB.contains(null)) {
			ListB.remove(element);
		}
		
		Pattern pattern = Pattern.compile("null");
		Matcher matcher = pattern.matcher(ListB);
		
		/*
		 * Although we haven't covered lists in my MSc course at queens
		 * research suggested it was the best option for completing
		 * this task
		 */
		
		return S;
		
	}
	
}