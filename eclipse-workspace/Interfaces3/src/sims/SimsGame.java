package sims;

public class SimsGame {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Claire");
		
		Person p2 = new Person();
		p2.setName("Aidan");
		
		IPest pest1= new HouseFly();
        IPest pest2= new HouseFly();
        IPest pest3= new HouseFly();
        
        IPest pest4= new Telesales();
        IPest pest5= new Telesales();
        IPest pest6= new Baby();
        
        Person[] persons = {p1,p2};
        
        IPest[] pests = {pest1, pest2, pest3, pest4, pest5, pest6};
        
        DiningRoom diningRoom = new DiningRoom(persons, pests);
        
        diningRoom.serveFood();

	}

}
