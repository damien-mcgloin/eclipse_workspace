package exercise;

import java.util.HashMap;
import java.util.Map;

public class MapExercise2 {

	public static void main(String[] args) {
		
		Map<String, String> contacts = new HashMap<>();
		
		contacts.put("Aidan", "077739393939");
		contacts.put("Annie", "077222222222");
		contacts.put("Una", "0778888888888");
		
		System.out.println("Annie's number "+contacts.get("Annie"));
		
		for(String key:contacts.keySet()) {
			System.out.println(key+" "+contacts.get(key));
		}

	}

}
