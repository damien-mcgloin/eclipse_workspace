package exercise;

import java.util.HashMap;
import java.util.Map;

public class MapExercise3 {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<String, String>();
		
		contacts.put("Aidan", "0777393939393");
		contacts.put("Una", "077788888888");
		contacts.put("Annie", "0777222222222");
		
		System.out.println("Number for Annie "+contacts.get("Annie"));
		
		for(String key: contacts.keySet()) {
			System.out.println(key+" "+contacts.get(key));
		}
		

	}

}
