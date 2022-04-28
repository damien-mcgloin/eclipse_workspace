package sims;

public class DiningRoom {
	
	public Person[] persons;
    public IPest[] pests;
    
    public DiningRoom(Person[] persons, IPest[] pests) {
        this.persons = persons;
        this.pests = pests;
    }
    
    public void serveFood() {
        System.out.println("Food served ...");
        
        for (IPest pest : pests) {
            pest.beAnnoying();
        }
    }

}
