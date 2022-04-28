package TestStatic;


public class Module {
private static int moduleCount = 0;

	public static int getModuleCount() {
		return moduleCount; 
	}
	
	public static void setModuleCount(int value){
		moduleCount = value;
	}
}
