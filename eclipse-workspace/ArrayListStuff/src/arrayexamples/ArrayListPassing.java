package arrayexamples;

import java.util.ArrayList;

public class ArrayListPassing {

	public static void main(String[] args) {
		ArrayList<String> goodSingers = new ArrayList<String>();
		ArrayList<String> crooners = new ArrayList<String>();
		
		goodSingers.add("Prince");
		goodSingers.add("Bowie");
		goodSingers.add("Barry White");
		
		crooners.add("Englebert Humperdink");
		crooners.add("Sinatra");
		
		System.out.println("Good singers...");
		displayAllSingers(goodSingers);
		
		System.out.println("Crooners...");
		displayAllSingers(crooners);
		

	}
	
	public static void displayAllSingers(ArrayList<String> singers) {
		
		System.out.println(singers.toString());
		
	}

}
