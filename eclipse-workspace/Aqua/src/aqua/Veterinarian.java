package aqua;

import java.util.ArrayList;
import java.util.List;

public class Veterinarian {
	
	List<String> addPet = new ArrayList<String>();
	
    public void accept(String petName) {
    	
        addPet.add(petName);

    }

    public String heal() {
    	
    	String name = null;
    	
    	for (String pet : addPet) {
        	if(addPet!=null) {
        		name = pet;
        	}
    	}
    	
        for(String pet : addPet) {
            if(pet.equals(name)) {
            	addPet.remove(pet);
            } else {
            	continue;
            }
        }
        
        if(name!=null) {
        	return name;
        } else {
        	return null;
        }
    	     	
    	
    }
    
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
