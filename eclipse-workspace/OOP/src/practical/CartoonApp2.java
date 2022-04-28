package practical;

public class CartoonApp2 {

	public static void main(String[] args) {
		
		SimpsonsCharacter2 Bart = new SimpsonsCharacter2();
		
		Bart.setName("Bart");
		Bart.setCatchPhrase("Eat my shorts!");
		
		System.out.println(Bart.getName());
		Bart.sayCatchPhrase();

	}

}
