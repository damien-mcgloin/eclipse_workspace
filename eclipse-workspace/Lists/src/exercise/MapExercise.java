package exercise;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		
		contacts.put("Aidan", "0773939393");
		contacts.put("Annie", "0772222222");
		contacts.put("Una", "07788888888");
		
		// get number
		System.out.println("Number for Annie "+contacts.get("Annie"));
		
		// get all
		for(String key : contacts.keySet()) {
			System.out.println(key+" " +contacts.get(key));
		}

	}

}
