package TestStatic;

public class TestStatic {
	
	private static int retrievedModuleCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			
			System.out.println(Module.getModuleCount());
			
			Module myModule1 = new Module();
			Module myModule2 = new Module();
			
			Module.setModuleCount(2);
			
			retrievedModuleCount = myModule1.getModuleCount();
			System.out.println(retrievedModuleCount);
			
			retrievedModuleCount = myModule2.getModuleCount();
			System.out.println(retrievedModuleCount);
			
			retrievedModuleCount = Module.getModuleCount();
			System.out.println(retrievedModuleCount);
			
			
	}

}
