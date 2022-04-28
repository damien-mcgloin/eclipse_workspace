package zoo;

public class ZooSystem {

	public static void main(String[] args) {
		
		
		Hippo h1 = new Hippo();
		h1.setName("Hippo 1");
		h1.setWeight(250);
		
		System.out.println(h1.getName());
		System.out.println(h1.getWeight());
		
		Hippo h2 = new Hippo();
		h2.setName("Damien");
		h2.setWeight(5);
		
		System.out.println(h2.getName());
		System.out.println(h2.getWeight());
		
		Hippo h3 = new Hippo("Hippo 3", 450);
		System.out.println(h3.getName());
		System.out.println(h3.getWeight());
		
		Hippo h4 = new Hippo("Harry", 950);
		System.out.println(h4.getName());
		System.out.println(h4.getWeight());
		
	}

}
