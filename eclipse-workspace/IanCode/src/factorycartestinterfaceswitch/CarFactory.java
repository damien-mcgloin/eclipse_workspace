package factorycartestinterfaceswitch;


public class CarFactory {
   public static Car getCar(String label)
   {
	   switch (label) 
	   {
	   		case "racer":
	   			return new Racer();
	   		case "limo":
	   			return new Limo();
	   		case "banger":
	   			return new Banger();
	   		default: return null;
	   }
   }
}
